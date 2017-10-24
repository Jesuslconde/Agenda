<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">

        <spring:url value="static/css/bootstrap.css" var="bootstrap"/>
        <link href="${bootstrap}" rel="stylesheet" />
        <spring:url value="static/css/custom.css" var="custom"/>
        <link href="${custom}" rel="stylesheet" />  

<title>LISTADO DE EMPLEADOS</title>
</head>
<body>
	<div align="center">
		<h1>LISTADO DE CATEGORIAS</h1>
		<h3>
			<a href="new">Clic para crear un NUEVA CATEGORIA</a>
		</h3>

		<table border="1">
		<tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Descripcion</th>
			<th>Opciones</th>
			</tr>

				<tr>
					<td>${cat.id}</td>
					<td>${cat.nombre}</td>
					<td>${categoria.descripcion}</td>
					<td><a href="edit?id=${categoria.id}">Modificar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=${categoria.id}">Eliminar</a>
					</td>
				</tr>
			
		</table>
	</div>
</body>
</html>