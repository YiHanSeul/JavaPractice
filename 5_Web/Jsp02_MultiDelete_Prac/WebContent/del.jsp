<%@page import="com.mul.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String[] seq=request.getParameterValues("chk");
	BoardDao dao =new BoardDao();
	int res= dao.deleteChk(seq);
	
	if(res==seq.length){
%>
	<script type="text/javascript">
		alert("체크된 글들을 삭제 성공");
		location.href="boardlist.jsp";
	</script>
<%
	}else{
%>
	<script type="text/javascript">
		alert("체크된 글들을 삭제 실패");
		location.href="boardlist.jsp";
	</script>
<% 
}
%>
</body>
</html>