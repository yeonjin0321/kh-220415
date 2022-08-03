<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../common/easyui_common.jsp" %>
</head>
<body>


<script>
$(document).ready(function(){
	//alert("데이터그리드");
	$("#dg").datagrid({

		columns:[[
        {field:'b_no',title:'글번호', width:100, },
        {field:'b_title',title:'제목', width:200, },
        {field:'b_writter',title:'작성자', width:100, align:'center'}

        ]],
	    	data: [
	    		{b_no: 1, b_title:'게시글 제목 연습1.',b_writter:'김유신'},
	    		{b_no: 2, b_title:'게시글 제목 연습2.',b_writter:'이순신'},
	    		{b_no: 3, b_title:'게시글 제목 연습3.',b_writter:'강감찬'},
	    	] //end of data
		})
	})
</script>

<table id="dg"></table>
</body>
</html>