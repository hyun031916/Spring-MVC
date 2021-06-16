<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/register">
	이름 : <input type="text" name="user_name" value="${requestScope.userDTO.user_name }"/> <p>
	아이디: <input type="text" name="user_id" value="${requestScope.userDTO.user_id }"><p>
	비밀번호: <input type="password" name="user_pw" value="${requestScope.userDTO.user_pw }"><p>
	이메일: <input type="email" name="user_email" value="${requestScope.userDTO.user_email }"><p>
	<!-- 우편번호: <input type="text" name="user_postalCode" value="${requestScope.userDTO.user_name }"><p> -->
	주소: <input type="text" name="user_addr1" value="${requestScope.userDTO.user_addr1 }"><p>
	상세 주소: <input type="text" name="user_addr2" value="${requestScope.userDTO.user_addr2 }"><p>
	<input type="submit" value="확인">
</form>
</body>
</html>