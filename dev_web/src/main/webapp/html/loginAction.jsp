<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    //스크립틀릿
    //자바코드를 쓸 수 있다.
    //확장자는 jsp이지만 브라우저는 html으로 (확장자는 jsp이지만 그 내부의 타입은  html로 인식)
    String mem_id = request.getParameter("mem_id");
    //파라미터 자리는 id가 아닌 name값을 적는다. 반드시
    out.print(mem_id); // tomato or apple or kiwi 등등 동적인정보를..
    
    
    %>