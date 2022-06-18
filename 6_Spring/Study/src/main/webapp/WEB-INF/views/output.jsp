<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>DATA 출력</h1>
<table border="1">
	
	<c:choose>
			<c:when test="${empty dto }">
				<tr>
					<td colspan="4">----작성된글이 존재하지 않습니다----</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${dto }" var="dto">
					<tr>
						<th>NAME</th>
						<td>${dto.name }</td>
					</tr>
					<tr>
						<th>AGE</th>
						<td>${dto.age }</td>
					</tr>
					<tr>
						<th>ADDR</th>
						<td>${dto.addr }</td>
					</tr>				
				</c:forEach>
			</c:otherwise>
		</c:choose>
	
</table>
</body>
</html>