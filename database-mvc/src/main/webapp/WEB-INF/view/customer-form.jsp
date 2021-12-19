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
	<form:form method="POST" action="processAdd" modelAttribute="customer">
		FirstName: <form:input path="firstName" onchange="test"/>
		<br><br>
		LastName: <form:input path="lastName"/> <form:errors path="lastName" cssClass="error"></form:errors>
		<br><br>
		Email: <form:input path="email"/> <form:errors path="lastName" cssClass="error"></form:errors>
		<br><br>
		<input type="submit" />
		
	</form:form>
</body>
</html>