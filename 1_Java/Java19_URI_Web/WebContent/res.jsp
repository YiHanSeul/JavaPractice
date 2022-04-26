<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
%>
	<h1>res Page</h1>
	<h1><%=request.getParameter("tname") %>님의 주소는 <%=request.getParameter("taddr") %></h1>

<pre>
Get 방식 : queryString 포함
Post 방식 : 주소줄에 요청 페이지만 있다.
queryString : ?를 포함한 변수 =값&변수=값&...
		res.jsp?tname=이한슬&taddr=서울시
</pre>
</body>
</html>