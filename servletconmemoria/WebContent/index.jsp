<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String valorEnviado="";
if(request.getAttribute("valores")!=null){
	out.print("exito");
	valorEnviado=(String)request.getAttribute("valores");
}

%>

<form action="/servletconmemoria/Controla">
<select name="valores">
<option value="valor" <% if(valorEnviado.equals("valor")){out.print(" selected ");} %>>valor</option>
<option value="valorcito" <% if(valorEnviado.equals("valorcito")){out.print(" selected ");} %>>valorcito</option>
<option value="valorzote" <% if(valorEnviado.equals("valorzote")){out.print(" selected ");} %>>valorzote</option>
</select>

<input type="text" name="texto">
<input type="submit">
</form>

</body>
</html>