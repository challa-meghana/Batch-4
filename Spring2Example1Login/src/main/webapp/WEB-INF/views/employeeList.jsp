<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<c:forEach items="${employeelist }" var="employee">
${employee.id):${employee.lastName },${employee.firstName }<br>
</c:forEach>
</center>
</body>
</html>