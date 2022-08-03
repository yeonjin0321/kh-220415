<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@
page import = "java.util.List, book.ch1.DeptVO, java.util.ArrayList"
%>

<%
//보여지는 화면이다.
//sendRedirect => 불가(반드시 유지를 해야하는 상황이라면 - 쿠키, 세션)
//forward => 가능하다 출력OK
String s_name = (String) request.getAttribute("s_name"); //요청 받아온 속성 s_name
List<DeptVO> list = (List)request.getAttribute("list");
out.println("서버에서 요청객체에 담은 값 :"+s_name); //리다이렉트일땐 null 포워드일땐 이순신
out.print("<br>");
out.print(list.get(0).getDeptno()+", "+list.get(0).getDname()+", "+list.get(0).getLoc());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>