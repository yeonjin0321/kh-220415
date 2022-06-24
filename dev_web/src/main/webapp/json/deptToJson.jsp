<%@ page language="java" contentType="application/json; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.Map, java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="com.util.DBConnectionMgr, java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement, java.sql.ResultSet"%>
<%@ page import="com.google.gson.Gson"%>
<%
//스크립틀릿 - 자바코드를 사용할 수 있다.
Connection con = null;
PreparedStatement pstmt = null;
ResultSet rs = null; //select 일때 테이블 안에 row를 읽어서 꺼냄
DBConnectionMgr dbMgr = new DBConnectionMgr();
List<Map<String, Object>> deptList = null;
try {
	con = dbMgr.getConnection();
	pstmt = con.prepareStatement("select deptno,dname,loc from dept");
	// 전달 된 select문에 대한 처리를 요청하고 커서 받아내기
	rs = pstmt.executeQuery();
	deptList = new ArrayList<>(); //어레이리스트배열을 deptlist에 담는다.
	Map<String, Object> rmap = null;
	while (rs.next()) { //한개씩 꺼내오기
		rmap = new HashMap<>();
		rmap.put("deptno", rs.getInt("deptno"));
		rmap.put("dname", rs.getString("dname"));
		rmap.put("loc", rs.getString("loc"));
		deptList.add(rmap);
	}
	//out.print(deptList);
	Gson g = new Gson();
	String imsi = g.toJson(deptList);
	out.print(imsi);
} catch (Exception e) {
	out.println("오라클 서버와 연결 통로 확보 실패");
	// stack메모리에 쌓인 에러 메시지에 대한 history정보 출력 해줌
	e.printStackTrace();
}
%>