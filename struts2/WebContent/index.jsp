<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%@ taglib prefix="s" uri="/struts-tags"%>
<a href="enlace1.action">enlace 1</a><br/>
<a href="enlace_2.action">enlace 2 - usa * en el struts.xml</a><br/>
<!-- El atributo value pone la ruta tal cual, mientras que action a�ade la ruta absoluta  -->
<a href="<s:url value="enlace1.action" />">enlace 3</a><br/>
<a href="<s:url action="enlace1.action" />" >enlace 4 </a><br/>
<a href="<s:url value="https://www.pablomonteserin.com" />" >enlace 4 </a><br/>
<s:url action="enlace1.action" var="urlTag" >
    <s:param name="age">99</s:param>
</s:url>
<s:a href="%{urlTag}">enlace 5 - usa %</s:a>



</body>
</html>