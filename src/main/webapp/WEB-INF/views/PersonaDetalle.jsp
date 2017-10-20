<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personas Detalle</title>
</head>
<body>
	<h1>Persona Detalle</h1>
	<h2>${persona.nombre} ${persona.apellido1} ${persona.apellido2}</h2>
	<ul>
		<li>DNI: ${persona.dni}</li>
		<li>Fecha Nacimiento: <fmt:formatDate pattern = "dd-MM-yyyy" value = "${persona.fechaNacimiento}" /></li>
		<li><a href="edit?id=${persona.id}">+ Modificar</a> | <a href="delete?id=${persona.id}">- Eliminar</a></li>
	</ul>
</body>
</html>