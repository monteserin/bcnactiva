<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr><th>id</th><th>titulo</th><th>precio</th></tr>
<s:iterator value="libros">
<tr>
<td><a href="consultaLibro.action?libro.id=<s:property value="id" />"><s:property value="id" /></a></td>
<td><s:property value="titulo" /></td>

<td><s:property value="precio" /></td>

</tr>
</s:iterator>
</table>
</body>
</html>