<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
            <td>First Name:</td>
            <td>Last Name:</td>
            <td>email:</td>
        </tr>
		<c:forEach items="${customers}" var="customer">
			<tr>      
	        	<td>${customer.firstName}</td>
		        <td>${customer.lastName}</td>
		        <td>${customer.email}</td>
	    	</tr>
		</c:forEach>
	</table>
</body>
</html>