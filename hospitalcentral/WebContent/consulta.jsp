<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1px">
		<tr>
			<th>id</th>
			<th>nombre</th>
			<th>apellidos</th>
			<th>fecha</th>
		</tr>
		<c:forEach var="paciente" items="${pacientes}">
			<tr>
				<td><a href="Controlador?action=consultaPaciente&id=${paciente.id}">${paciente.id}</a></td>
				<td>${paciente.nombre}</td>
				<td>${paciente.apellidos}</td>
				<th><fmt:formatDate value="${paciente.fecha_alta}" pattern="dd-MM-yyyy"/></th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>