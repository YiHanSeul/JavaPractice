<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>MYNO</th>
		<td>${one.myno }
	</tr>
	<tr>
		<th>MYNAME</th>
		<td>${one.myname }
	</tr>
	<tr>
		<th>MYTITLE</th>
		<td>${one.mytitle }
	</tr>
	<tr>
		<th>MYCONTENT</th>
		<td> <textarea rows="10" cols="60" readonly="readonly">${one.mycontent }</textarea>
	</tr>
	<tr>
		<th>MYDATE</th>
		<td>${one.mydate }
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="button" value="수정" onclick="location.href='updateform?myno=${one.myno}'">
		<input type="button" value="삭제" onclick="location.href='delete?myno=${one.myno}'">
		<input type="button" value="목록" onclick="location.href='/myboard/list'">
		</td>
	</tr>
</table>
</body>
</html>