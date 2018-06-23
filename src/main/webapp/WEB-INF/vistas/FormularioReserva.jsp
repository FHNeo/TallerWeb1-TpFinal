<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/my-handling-form-page" method="post">
    <div>
        <label for="CantPersona">Cantidad de Personas</label><br>
        <input type="number" name="CantPersona" placeholder="escriba aqui" min="0" max="100">
    </div>
	<br>
    <div>	
		<label for="fechaIn">Fecha de Inicio</label><br>
		<input type="date" name="fechaIn" >
	</div>
	<br>
    <div>	
		<label for="fechaOut">Fecha final</label><br>
		<input type="date" name="fechaOut" >
	</div>
	<br>
    <div>	
		<label for="tipo">Tipo de sala</label><br>
		<input type="radio" name="tipo" value="privada" checked>Privada<br>
		<input type="radio" name="tipó" value="compartida">Compartida<br>
	</div>
	<br>
    <div>	
		<label for="tipo">Ubicacion</label>
    </div>
	<br>
    <div class="button">
        <button type="submit">Reservar</button>
    </div>
</form>

</body>
</html>