<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">
  

<title>LISTADO DE EMPLEADOS</title>
</head>
<body>
	<div align="center">
		<h1>LISTADO DE EMPLEADOS</h1>
		<h3>
			<a href="new">Clic para crear un NUEVO EMPLEADO</a>
		</h3>

		<table border="1">
		<tr>
			<th>Nº</th>
			<th>Código de Empleado</th>
			<th>Salario</th>
			<th>fecha de Alta</th>
			</tr>

			<c:forEach var="empleado" items="${listEmpleados}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${empleado.codEmpleado}</td>
					<td>${empleado.salario}</td>
					<td>${empleado.fechaAlta}</td>
					<td><a href="edit?id=${empleado.id}">Modificar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=${empleado.id}">Eliminar</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>