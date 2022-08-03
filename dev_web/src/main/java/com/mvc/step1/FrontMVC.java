package com.mvc.step1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

// POJO
// XXX.gym -> 무조건 FrontMVC 클래스 인터셉트 하자
public class FrontMVC extends HttpServlet {
	Logger logger = Logger.getLogger(FrontMVC.class);

	// doService는 내가 만든것.
	// doget dopost로 나누어서 기능 구현하는것이 싫음. -창구를 일원화 한다.
	
	public void doService(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		logger.info("doService 호출 성공!");
		ActionForward af = null;
		// 보드컨트롤러는 서블릿으로 설계하지 않았다.
		// 앞단에 프론트mvc를 경유하니까..
		// 스프링이 이렇게 하던데...
		String uri = req.getRequestURI(); // -> /pay/payList.gym
		logger.info("uri:"+uri);
		String context = req.getContextPath();
		logger.info("context:"+context);
		String command  =uri.substring(context.length()+1);
		int end = command.lastIndexOf(".");
		command = command.substring(0,end);
		String upmu[] = null;  //upmu[0]-업무이름, upmu[1]=메소드이름통일 (pay, payController)
		upmu = command.split("/");
		
		
		
		BoardController boardController = new BoardController();
		//MemberController memberController = new MemberController();
		//PayController payController = new PayController();
		// 다 좋은데 BoardController에는 req와 res가 없는데 어떡하지??
		// 메소드의 파라미터 자리는 지역변수이다.
		// 서블릿 클래스만이 객체주입(게으른..)을 받을 수 있다.
		
		if("board".equals(upmu[0])) { // 업무 배열중 첫번째 업무파트 나눈것이 보드이면.
			req.setAttribute("upmu", upmu);
			
			af = boardController.execute(req, res); //액션포워드는 보드컨트롤러를 실행한다.
		}
		//2022-08-03 추가
		// 이 부분에 대해 2사람 이상에게 설명해 보자.
		if (af != null) {
			if (af.isRedirect()) {
				// res.sendDiresct("xxx.jsp");
				res.sendRedirect(af.getPath()); //유지가 안된다. sendRedirect 그리고 셀렉트일땐 절대 쓰면 안됨.
			} else { // forward - 유지, 주소안변함, 그런데 페이지는 바뀌었다.
				//select문이라면 무조건 이걸 써야함. 셀렉트 -> forward (왜냐면 그 화면에서 선택하는거니깐 just 검색 조회.)
				RequestDispatcher view = req.getRequestDispatcher(af.getPath());
				view.forward(req, res);

			}
		}
	}///// end of doService

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) // 파라미터들 지변이다.
			throws ServletException, IOException {
		logger.info("doGet 호출 성공!");
		doService(req, res);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		logger.info("doGet 호출 성공!");
		doService(req, res);
	}

}