<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="/result" modelAttribute="userDTO">
	이름 : <form:input path="user_name"/> <p>
	아이디: <form:input path="user_id"/> <p>
	비밀번호: <form:input path="user_pw"/> <p>
	이메일: <form:input path="user_email"/> <p>
	주소: <form:input path="user_addr1"/> <p>
	상세 주소: <form:input path="user_addr2"/> <p>
	<input type="submit" value="확인">
</form:form>
</body>
</html>