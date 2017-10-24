<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">
  

<title>LISTADO DE EMPLEADOS</title>
</head>
<body>
	<div align="center">
		<h1>LISTADO DE EMPLEADOS</h1>
		

		<table border="1">
		<tr>
			<th>Nº</th>
			<th>Código de Empleado</th>
			<th>Salario</th>
			<th>Fecha de Alta</th>
			<th>Opciones</th>
			</tr>

			<c:forEach var="empleado" items="${listEmpleados}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${empleado.codEmpleado}</td>
					<td>${empleado.salario}</td>
					<td><fmt:formatDate pattern = "dd-MM-yyyy" value = "${empleado.fechaAlta}" /></td>
					
					<td><a href="viewEmpleado?id=${empleado.id}">Ver Detalle</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="edit?id=${empleado.id}">Modificar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=${empleado.id}">Eliminar</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>