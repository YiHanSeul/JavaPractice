<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 
		JSTL(JSP Standard Tag Library
		Core(c): 변수, 반복문, 조건문
		Formatting :(fmt)숫자,날짜,시간을 포맷팅
		DataBase(sql)
		Xml(x)
		Function(fn)
	 -->
	<h1>JSTL</h1>
	<table border="1">
		<tr>
			<th>NAME</th>
			<th>KOR</th>
			<th>ENG</th>
			<th>MATH</th>
			<th>SUM</th>
			<th>AVG</th>
			<th>GRADE</th>
		</tr>
		<c:forEach items="${list}" var="score"> <!--  list안에 있는 객체를 score에 하나씩 담아서 반복할거예요 -->
				<tr>
					<td>
						<c:if test="${score.name eq '이름1' }">
							<c:out value="이한슬"></c:out> 
						</c:if>
						<c:choose>
							<c:when test="${score.name eq '이름2' }">
								<c:out value="${score.name }님!"></c:out>
							</c:when>
							<c:when test="${score.name eq '이름3' }">
								<c:out value="${score.name }님@@"></c:out>
							</c:when>
							<c:otherwise>
								<c:out value="익명"></c:out>
							</c:otherwise>
						</c:choose>
					</td>
					<td>${score.kor}</td>
					<td>${score.eng}</td>
					<td>${score.math}</td>
					<td>${score.sum}</td>
					<td>${score.avg}</td>
					<td>${score.grade}</td>
					
				</tr>
		</c:forEach>
	</table>
	<c:forEach var ="i" begin="1" end="10">
		${i }<br>
	</c:forEach>
	<c:set var="test" value="jstl test"/>
		${test }
	<c:out value="${test }"></c:out>
</body>
</html>