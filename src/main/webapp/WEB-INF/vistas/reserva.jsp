<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
			<c:forEach items="${reserva}" var="e">
				<h3>Su fue realizada con Exito!</h3>
				<h4>Usuario: ${e.usuario}</h4>
				<h4>Desde: ${e.fechaIn}</h4>
				<h4>Hasta: ${e.fechaOut}</h4>
				<h4>Tipo: ${e.HumanizeTipo()}</h4>
				<h4>Cantidad de personas: ${e.cantPersona}</h4>
				<hr>
			</c:forEach>
		
	</div>
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>