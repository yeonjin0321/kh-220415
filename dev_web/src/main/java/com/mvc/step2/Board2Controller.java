package com.mvc.step2;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

//반드시 ActionServlet을 경유한 뒤 Board2Controller가 실행되어야 한다.
//왜냐하면 Board2Controller가 서블릿이(서블릿은 액션 서블릿) 아니기 때문이다.
// 나는 서블릿이 아니다. 왜냐면 액션서블릿으로부터 받으면 되니까
// 리턴타입을 스트링으로 바꾸었다. - 페이지 이동
// 그런데 1-3에서는 req, res가 없어도 페이지 이동이 가능하게 설정을 하였다.
// mvc 패턴의 완결편은 더 이상 상속관계로 재사용성이나 클래스 설계를 하지 말아야 한다. - 권장

public class Board2Controller implements Controller { // 컨트롤러 상속
	Logger logger = Logger.getLogger(Board2Controller.class);
	Board2Logic boardLogic = new Board2Logic();

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		logger.info("execute 호출 성공");
		String upmu[] = (String[]) req.getAttribute("upmu"); // 서블릿에서 보낸 요청객체를 응답객체로 받아옴?.. upmu배열
		String page = "";
		// upmu[0]=> 업무이름 , upmu[1]=> 업무기능이름-> 1-4(메소드 이름으로 매칭)
		logger.info(upmu[0] + "," + upmu[1]);// 배열이 2개라 그냥 찍어봐도 괜찮음 가져온거 찍어봄
		if ("boardList".equals(upmu[1])) {
			List<Map<String, Object>> boardList = null;
			boardList = boardLogic.boardList();
			req.setAttribute("boardList", boardList); // 두번째자리는 값이오니까 주소번지 넣어줌
			//오라클 서버에서 조회된 결과가 화면에 출력이 나가야 함.
			// 유지의 문제이다 - (로그인 세션유지)
			//page = "board2/boardList";
			page = "forward:board2/boardList";
		}else if("jsonBoardList".equals(upmu[1])) {
			List<Map<String, Object>> boardList = null;
			boardList = boardLogic.boardList();
			req.setAttribute("boardList", boardList);
			//오라클 서버에서 조회된 결과가 화면에 출력이 나가야 함.
			// 유지의 문제이다 - (로그인 세션유지)
			//page = "board2/boardList";
			page = "forward:board2/jsonBoardList";
			//화면은 위의 주소로 나오고 결과는 2건 김유신 이순신 넣어둔게 json형식으로 나옴 
		}
			
		 else if ("boardInsert".equals(upmu[1])) {

			page = "";

		}

		return page;
	}

}
