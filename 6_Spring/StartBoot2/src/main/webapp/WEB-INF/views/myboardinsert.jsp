<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insert" method="post">
		<table border="1">
			<tr>
				<th>MYNAME</th>
				<td><input type="text" name="myname"></td>
			</tr>
			<tr>
				<th>MYTITLE</th>
				<td><input type="text" name="mytitle"></td>
			</tr>
			<tr>
				<th>MYCONTENT</th>
				<td><textarea rows="10" cols="60" name="mycontent"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="취소" onclick="location.href='list'">
					<input type="submit" value="등록">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
