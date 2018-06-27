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
		<h1>
			<c:forEach items="${reserva}" var="e">
				<h2>Su reserva fue realizada con Exito!</h2>
				<h3>Usuario: ${e.usuario}</h3>
				<h3>Desde: ${e.fechaIn}</h3>
				<h3>Hasta: ${e.fechaOut}</h3>
				<h3>tipo ${e.HumanizeTipo()}</h3>
				<h3></h3>
			</c:forEach>
		</h1>
	</div>
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>