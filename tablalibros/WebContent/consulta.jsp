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
<form id="formulario" action="/tablalibros/Controlador">
<table border="1px">
<tr>
<th>id</th>
<th>titulo</th>
<th>precio</th>
<th>opcion</th>
</tr>
<c:forEach var="libro" items="${ libros}">
<tr>
<td>${libro.id}</td>
<td><input type="text" value="${libro.titulo}" id="titulomodificar${libro.id}"></td>
<td><input type="text" value="${libro.precio}" id="preciomodificar${libro.id}"></td>
<td><input type="button" onclick="borrar(${libro.id})" value="borrado"><input type="button" value="modificacion" onclick="modificar(${libro.id})"></td>
</tr>
</c:forEach>
<tr>
<th>id</th>
<th><input type="text" name="nuevoTitulo"></th>
<th><input type="text" name="nuevoPrecio"></th>
<th><input type="submit" value="insertar"></th>
</tr>
</table>

<input type="hidden" name="action" id="action" value="alta">
<input type="hidden" name="identificador" id="identificador" value="alta">
<input type="hidden" name="titulomodificar" id="titulomodificar" value="alta">
<input type="hidden" name="preciomodificar" id="preciomodificar" value="alta">
</form>

<script>
function borrar(id){
	document.getElementById("action").value="borrar"
	document.getElementById("identificador").value=id	
	document.getElementById("formulario").submit()
}
function modificar(id){
	document.getElementById("action").value="modificar"
	document.getElementById("identificador").value=id	
	document.getElementById("titulomodificar").value=	document.getElementById("titulomodificar"+id).value
	document.getElementById("preciomodificar").value=	document.getElementById("preciomodificar"+id).value

	
	document.getElementById("formulario").submit()	
}
</script>
</body>
</html>