<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Controlador">
<input type="text" name="nombre" value="${paciente.nombre}">
<input type="text" name="apellidos"  value="${paciente.apellidos}">
<input type="date" name="fecha_alta" value="<fmt:formatDate value="${paciente.fecha_alta}" pattern="yyyy-MM-dd"/>">
<input type="hidden" name="action" value="modifica">
<input type="hidden" name="identificador" value="${paciente.id}">
<input type="submit" value="enviar">

</form>
</body>
</html>