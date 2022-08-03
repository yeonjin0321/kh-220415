
<%
//확장자를 jsp로 해야 스크립틀릿이 사용이 가능함
// JSP = html+css+js(브라우저+인터프리터)+java(백엔드-서버주체-서버 즉 처리된 결과가 다운로드됨)
//왜 중요한 걸까? - 시간차(인스턴스화-위치-싱글톤패턴-서블릿 싱글톤으로 관리가 된다.)
//서블릿의 라이프사이클 - 스레드관리, 관리되는 주체 객체(서블릿)
//위 3가지중에서 개발자는 서비스 부분을 관리하면 된다. init() - service(req,res) -> doGet,doPost - destroy()
//톰캣서버가 init()과 destroy() 책임진다 ~ 개발자 책임이 아니다.
//a.jsp -> a_jsp.java -> a_jsp.class ->브라우저 쓰기
// jsp 컨테이너가 관여(엔진), servlet-api.jar(서블릿 엔진) 이 두개가 엔진이 되는것임.
//왜 서블릿이어야 하는가?
//서블릿이어야 웹서비스가 가능하다.
//웹서비스는 요청으로 시작항 응답으로 끝난다.
//요청객체와 응답객체에 대한 객체주입이 필요하다.
//누가 누구에게 주입을 해주나?
//요청시 전송방식 get/post
//서비스를 제공하는 백엔드단에서 전송방식에 매칭되는 메소드가 필요함
//doGet, doPost
//init()-service()-destroy()
//프로젝트 이름마다 경로가 다를 수 있다.
//매번 그떄마다 경로를 수정한다?? 
//was에서는 관리하는 server.xml문서에서 context에 정보를 가져오는 메소드 호출임.
StringBuilder path = new StringBuilder(request.getContextPath());
path.append("/");
%>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript"
	src="https://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="<%=path.toString()%>themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="<%=path.toString()%>demo/demo.css">
<link rel="stylesheet" type="text/css"
	href="<%=path.toString()%>themes/icon.css">
<script type="text/javascript" src="<%=path.toString()%>js/commons.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.js"></script>