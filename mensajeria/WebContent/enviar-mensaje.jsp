<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/mensajeria/Controlador">
<c:forEach var="usuario" items="${usuarios}">
<input type="checkbox" value="${usuario.id}" name="usuarios[]"> ${usuario.name} <br>
</c:forEach>
<input type="hidden" name="action" value="enviarmensaje">

<textarea name="texto"></textarea>
<input type="submit">
</form>
</body>
</html>