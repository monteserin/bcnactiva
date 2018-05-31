<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


<body>

<form action="/ciclo/Controlador">
<input type="text" name="nombre">

<select name="caracteristica">
<option value="bello">Bello</option>
<option value="hermoso">Hermoso</option>
<option value="putrefacto">Putrefacto</option>
</select>

<input type="submit" value="Como soy?">
</form>

${resultado}

</body>
</html>