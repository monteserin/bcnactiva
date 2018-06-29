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

<s:form action="guardarReserva">
<s:textfield name="reserva.noches" />

<s:select list="#{'Oviedo':'Oviedo', 'Tokyo ':'Tokyo', 'Madrid':'Madrid', 'Barcelona ':'Barcelona'}" name="reserva.destino"/>



<s:submit />
</s:form>


<input type="text" value="<s:property value="reservaValores.costeHotel" />">
<input type="text" value="<s:property value="reservaValores.costeViaje" />">
<input type="text" value="<s:property value="reservaValores.costeAlquilerCoche" />">
<input type="text" value="<s:property value="reservaValores.costeTotal" />">

</body>
</html>