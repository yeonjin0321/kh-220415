package com.day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//hello.do로 서블릿 매핑해둔 상태.
//restful api - get/post 방식 지원
public class HelloServlet extends HttpServlet { // 서블릿이 되기 위한 조건. 반드시 상속을 받아야한다.
	// 그냥 자바가 아닌 서블릿이 되기 위한 전제 조건은 반드시 httpservlet을 상속
	// 그냥 자바는 요청객체와 응답 객체를 주입 받을 수 없다.
	// 왜 서블릿이어야 하나?
	// 자바로 어떻게 웹 서비스를 제공하지?
	// 어노테이션(SPRING BOOT 어노테이션 주입, 설정)
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("doGet 호출 성공");
		req.setAttribute("name", "NCT DREAM"); //이동전에 넣어야함
		res.sendRedirect("./helloResponse.jsp");
		//RequestDispatcher view = req.getRequestDispatcher("./helloResponse.jsp");
		 //view.forward(req,res); // 주소창이 안바뀐다 => 요청이 계속 유지되고 있다(포워드때문에) - 톰캣이
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException {

	}

}

/*
 * 톰캣 서버를 기동한다. 포로젝트에서 web.xml문서 (dd파일:deploeyment descriptor - 배치서술자)를 가장 먼저
 * 로딩한다. nodejs, react, json의 역할 xml은 화면을 그리진 않는다. xml은 데이터 베이스의 역할을 할 수는 있지만,
 * 비효율적이다. 요청 url과 서블릿 클래스의 매핑을 맡기자.(배치서술자- web.xml문서) 브라우저에서
 * http://192.168.35.196:8000/day1/hello.do -> 페이지에 접근이 가능하다. 위와 같이 주소창에 요청하는 것은
 * get방식이다 (보안에 취약) 나는 doGet 메소드를 호출한 적이 없는데 어떻게 페이지가 출력되었을까?
 * 문제제기
 * print메소드를 통해서 html 태그를 작성하는건 많이 비효율적이다.
 * 그래서 jsp를 사용한다 -view 계층
 * 서블릿은 컨트롤 계층을 맡기자. - 실제로 업무를 처리하는 클래스는 아니다.
 * 사용자가 입력한 값을 듣고 백앤드(자바,오라클)전달
 * 어떤 응답 페이지로 출력이 나가야 되는지를 결정해 준다.
 * 화면을 직접 그리지 않는데 어떻게 출력페이지로 이동을 시킨다는 걸까?
 * 응답객체를 통해서 페이지를 이동시킬 수 있다.
 * get방식이고 주소창이 바뀐다.(현재 요청이 끊어지고 새로운 요청이 일어남.)
 * http프로토콜은 비상태 프로토콜이다.
 *  
 * jsp에서 페이지 이동하는 방법 2가지
 * 
 * res.senRedirect("XXX.jsp"); 기존의 요청이 끊어지고 주소창이 바뀐다
 * 
 * RequsetDispatcher view = req.getRequestDispatcher("XXX.jsp");
 * view.forward(req,res); // 주소창이 안바뀐다 => 요청이 계속 유지되고 있다 - 톰캣이
 */
