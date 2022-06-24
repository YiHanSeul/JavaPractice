<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

	$(function(){
		let res=${res};
		console.log(res);
		$("div").append("<h3>"+res.info.faceCount+"명 인식</h3><br/>")
		for(let i=0; i<res.faces.length;i++){
			$("div").append("나이 :<span>"+res.faces[i].age.value+"</span><br/>");
			$("div").append("감정 :<span>"+res.faces[i].emotion.value+"</span><br/>");
			$("div").append("성별 :<span>"+res.faces[i].gender.value+"</span><br/><br/>");
			
		}
		/* let res1=${res1};
		console.log(res);
		for(let i=0; i<res1.faces.length;i++){
			$("div").append("나이 :<span>"+res1.faces[i].age.value+"</span><br/>");
			$("div").append("감정 :<span>"+res1.faces[i].emotion.value+"</span><br/>");
			$("div").append("성별 :<span>"+res1.faces[i].gender.value+"</span><br/><br/>");
			
		} */
	});
	</script>
</head>
<body>
<img alt="hanseul" src="/resources/img01.png" style="width:100px">
 <div></div>
</body>
</html>