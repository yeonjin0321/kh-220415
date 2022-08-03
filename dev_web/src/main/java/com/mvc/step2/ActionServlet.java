package com.mvc.step2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//void 에서 ActionForward -> String(spring4.0. 5.0, boot) -> ModelAndView(Object,scope 처리:spring2.5)
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

//시중 교재에서는 어노테이션으로 url매핑을 처리하지만
// 수업에서는 스프링 프레임워크를 최대한 흉내내 보자는 취지로 사용하지 않는다.
public class ActionServlet extends HttpServlet {
	Logger logger = Logger.getLogger(ActionServlet.class); // 액션 서블릿에 로그가 찍히게 해주는

	public void doService(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		logger.info("doService 호출 성공!");
		// 요청 URL을 통해서 해당하는 업무의 컨트롤 클래스 객체를 주입받고
		// 메소드 이름까지도 결정할 수 있다면 좋을 것 같음.
		String requestURI = req.getRequestURI();// => /board2/boardApp.kh?crud=select
		// 컨텍스트는 톰캣 서버의 serve.xml에 배포된 위치 정보 값을 참조함.
		// /dev_web or /
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length() + 1);
		int end = command.lastIndexOf(".");
		command = command.substring(0, end); //board2/boardApp
		String upmu[] = null;
		upmu = command.split("/"); // board2/boardApp
		logger.info(upmu[0] + "," + upmu[1]); // 배열이 2개라 그냥 찍어봐도 괜찮음
		req.setAttribute("upmu", upmu); // 셋어트리뷰트로 요청해서 보드컨트롤러2에 넘겨줌
		Board2Controller boardController = new Board2Controller();
		// 컨트롤 클래스에서 리턴타입을 String과 ModelAndView(Spring2.X)[scope] 이원화 해보기 - 1~4번 계획
		Object obj = null;
		obj = boardController.execute(req, res);
		// page로 넘어오는 값의 유형
		// redirect:board2/boardInsert.jsp ->: 콜론이 있는경우
		// response.sendRedirect("XXX.jsp");
		// forward:board2/boardList -> : 콜론이 있는경우
		// board2/boardList -> :콜론이 없는경우
		if (obj != null) {
			String pageMove[] = null;
			if (obj instanceof String) {
				if (((String) obj).contains(":")) { //localhost:8000/
					logger.info(":콜론이 포함되어 있습니다.");
					// package[0] = redirect or forward - redirect 유무 담기
					// package[1]=board2/boardList - 페이지 이름을 담아주세요.
					pageMove = obj.toString().split(":");
				} else {
					logger.info(":콜론이 포함되어 있지 않습니다.");
					pageMove = obj.toString().split("/");
				}
				logger.info("pageMove===>" + pageMove[0] + "," + pageMove[1]);
			} //// END OF STRING
			else if (obj instanceof ModelAndView) {
				
			}
			// 출력 결과에 대한 페이지 정보가 있니?
			//스프링에서는 왜 이런 처리를 제공하게 되었나?
			//ActionServlet은 모든 서비스의 요청을 가로채어 관리하기 위한 목적으로 설계됨.
			//웹 서비스 제공을 위한 클래스의 라이프 사이클에 대한 제어권을 F/W에서 갖고자 함.
			//업무에 대한 처리와 처리 결과에 대한 응답 페이지에 대한 정보는 각 컨트롤 클래스에 갖지만
			//전체적인 관리 감독은 ActionServlet에서 관리하도록 함.
			//결과적으로 ActionServlet의 역할은 사용자 요청에 대한 서비스를 담당할 적절한 컨트롤 클래스를
			//찾아서 연결해주고 각 업무별 추가된 컨트롤 클래으세어 지정한 페이지에 대한 요청 URL조립은 액션 서블릿에서 제공해줌
			if (pageMove != null) {
				String path = pageMove[1]; //path설정
				
				// Board2Controller에 리턴 값이 return "redirect:boardList.jsp"일때
				if ("redirect".equals(pageMove[0])) { // 너 select가 아니야?
					res.sendRedirect(path);
				} 
				// Board2Controller에 리턴 값이 return "forward:boardList.jsp"일때
				//localhost:8000/board2/boardList.kh -> boardList.jsp 그대로 출력
				//boardList.kh가 있으면 안되는 이유 -> boardList.kh.jsp로 요청 URL조립이 되어 404뜸
				//scope 요청이 유지되는 동안에는 주소번지를 사용할수 있다.
				else if ("forward".equals(pageMove[0])) {// 난 유지하게 해줄래
					RequestDispatcher view = 
							req.getRequestDispatcher("/" + path + ".jsp");
					view.forward(req, res);
				} 
				// Board2Controller에 리턴 값이 return "board2/boardList.jsp"일때
				else {// redirect나 forward문자열이 없는 경우라면?
					path = pageMove[0] + "/" + pageMove[1]; // /board2/boardList2
					RequestDispatcher view = 
							req.getRequestDispatcher("/WEB-INF/jsp/" + path + ".jsp");
					view.forward(req, res);

				}
			}///end of 출력페이지 호출
		} //// END OF 컨트롤계층 리턴결과에 대한 처리

	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) // 파라미터들 지변이다.
			throws ServletException, IOException {
		logger.info("doGet 호출 성공!");
		doService(req, res);
	}// do get 끝

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		logger.info("doGet 호출 성공!");
		doService(req, res);
	}// do post 끝

}
