<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터그리드 테스트</title>
<%@ include file="../common/easyui_common.jsp" %>
</head>
<body>

<script type="text/javascript">
$(document).ready(function(){
	alert("돔 구성이 완료되었음."+$("#dg_board"));
	$("#dg_board").datagrid({
		title : '계층형 게시판 목록',
		url:'./board.json', //http://localhost:8000/JEasyUI/boardSample.jsp 나일등 파일 나옴
		columns:[[
        {field:'b_no',title:'글번호', width:100, align:'center'},
        {field:'b_title',title:'제목', width:100, align:'left'},
        {field:'b_writter',title:'작성자', width:100, align:'right'}

        ]],
	    	data: [
	    		{b_no: 1, b_title:'게시글 제목 연습이다1.',b_writter:'김유신'},
	    		{b_no: 2, b_title:'게시글 제목 연습이다2.',b_writter:'이순신'},
	    		{b_no: 3, b_title:'게시글 제목 연습이다3.',b_writter:'강감찬'},
	    	] //end of data
		})
	})
</script>
<table id="dg_board"></table>
</body>
</html>