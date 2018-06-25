<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="registrarReserva" method="post" modelAttribute="reserva" name="formularioR" class="input-group">
    <div>
        <label for="CantPersona">Cantidad de Personas</label><br>
        <input type="number" path="CantPersona" name="CantPersona" placeholder="escriba aqui" required="required" min="0" max="100">
    </div>
	<br>
    <div>	
		<label for="fechaIn">Fecha de Inicio</label><br>
		<input type="date" path="fechaIn" name="fechaIn" required="required" >
	</div>
	<br>
    <div>	
		<label for="fechaOut">Fecha final</label><br>
		<input type="date" path="fechaOut" name="fechaOut" required="required" >
	<br>
    <div class="button">
        <button type="submit">Reservar</button>
    </div>
</form>

</body>
</html>