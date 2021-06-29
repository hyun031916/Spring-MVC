<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이름 : ${param.name } <br>
국어 : ${param.korean } <br>
영어 : ${param.english }<br>
수학 : ${param.math }<br>
총점 : ${param.korean+param.english+param.math }<br>
평균 : ${(param.korean+param.english+param.math)/3 }
</body>
</html>