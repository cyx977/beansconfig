<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>console.log("works")</script>
<script>
	function test() {
		console.log("Test");
	}
</script>
</head>
<body>
	<form:form action="processTagForm" modelAttribute="student">
		<form:input path="firstName" onchange="test"/>
		<form:input path="lastName"/>
		<form:select path="country">
			<form:option value="taiwan" label="Taiwan"></form:option>
			<form:options items="${countries}"></form:options>
		</form:select>
		<br><br>
		Favourite Programming Language
		<form:radiobutton path="progLang" value="dart" label="dart"/>
		<form:radiobutton path="progLang" value="java" label="java"/>
		<form:radiobuttons path="progLang" items="${favoriteLanguageOptions}"/>
		<br><br>
		Favourite Programming Language
		<form:checkbox path="smartPhone" label="Xiaomi" value="mi"/>
		<form:checkbox path="smartPhone" label="Samsung" value="sm"/>
		<input type="submit" />
		
	</form:form>
</body>
</html>