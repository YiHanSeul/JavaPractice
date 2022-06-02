<%@page import="com.el.score.Score"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<%
response.setContentType("text/html; charset=UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Score sc = (Score) request.getAttribute("score");
	%>

	<h1>EL Page</h1>
	<table border="1">
		<tr>
			<th colspan="2"><%=sc.getName()%>님의 점수는 ....</th>
		</tr>
		<tr>
			<th>국어</th>
			<td><%=sc.getKor()%></td>
		</tr>
		<tr>
			<th>영어</th>
			<td>${score.eng }</td><!--  mycontroller에서 request.setAttribute("score",sc); 이렇게 설정을 해둬서  가지고 올수있음 ,session,request,application 다 가능-->
		</tr>
		<tr>
			<th>등급</th>
			<td>${score.grade }</td>
		</tr>
	</table>
</body>
</html>