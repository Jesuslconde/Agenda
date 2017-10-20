<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personas List</title>
</head>
<body>
	<h1>Lista Persona</h1>
	<table border="1">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nombres</th>
					<th>Apellidos</th>
					<th>Opciones</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<c:forEach var="persona" items="${listPersonas}" varStatus="status">
						<td>${persona.id}</td>
						<td>${persona.nombre}</td>
						<td>${persona.apellido1} ${persona.apellido2}</td>
						<td><a href="viewPersona?id=${persona.id}">Ver Detalle</a></td>
					</c:forEach>
				</tr>
			</tbody>
		</table>
</body>
</html>