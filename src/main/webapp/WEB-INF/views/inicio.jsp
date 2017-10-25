<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agenda</title>
</head>
<body>
	<h1>Opciones Agenda <a href="add"> AÑADIR </a></h1>
	
	<table>
	<c:forEach items="${personas}" var="per">
		
		<tr>
			<td><h2>${per.nombre}${per.apellido1}${per.apellido2} </h2></td>
			<tr>
				<td>DNI</td>
				<td>${per.dni}</td>
				<td>FEcha nac</td>
				<td>${per.fechaNacimiento}</td>
			</tr>
		</tr>
		<tr>
		<td>telefono</td>
		<c:forEach items="${per.listTelf}" var="pertel">
			<td>${pertel.telefono}</td>
		</c:forEach>
		</tr>
		<!--  <tr>
			<td>${per.dir.direccion}</td>
			<td>${per.dir.codpostal}</td>
			<td>${per.dir.localidad}</td>
			<td>${per.dir.provincia}</td>
		</tr>
		<tr>
			<td>${per.emple.getCategoria().nombre}</td>
			<td>${per.emple.getDepartamento().nombre}</td>
			<td>${per.emple.fechaAlta}</td>
			<td>${per.emple.salario}</td>
		<tr>-->
			
	 </c:forEach>
	
</table>
</body>
</html>