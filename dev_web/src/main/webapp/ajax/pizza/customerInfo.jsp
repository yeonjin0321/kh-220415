<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.google.gson.*" %>    
<%
	String mem_tel = request.getParameter("mem_tel");
	//out.print("주문자 전화번호 : "+mem_tel);
	List<Map<String,String>> cusList = new ArrayList<>();//새로운 어레이 리스트 생성
    Map<String,String> rMap = new HashMap<>(); //해시맵 생성
    rMap.put("mem_name","김유신"); //rmap에 멤버들 넣어주기(김유신)
    rMap.put("mem_addr","서울시 마포구 공덕동");
    rMap.put("mem_tel","0255556666");
    cusList.add(rMap);
    rMap = new HashMap<>();
    rMap.put("mem_name","김춘추");
    rMap.put("mem_addr","서울시 금천구 가산동");
    rMap.put("mem_tel","0277776666");
    cusList.add(rMap);
    rMap = new HashMap<>();
    rMap.put("mem_name","이성계");
    rMap.put("mem_addr","서울시 영등포구 당산동");
    rMap.put("mem_tel","0277778888");
    cusList.add(rMap);
    String address ="";
    for(int i=0; i<cusList.size();i++){
    	Map<String,String> rmap = cusList.get(i);
    	if(rmap.get("mem_tel").equals(mem_tel)){
    		address = rmap.get("mem_addr");
    	}
    }
    out.print(address); //여기서 전달된다.
%>