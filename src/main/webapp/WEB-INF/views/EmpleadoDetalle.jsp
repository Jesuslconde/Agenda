<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Empleado Detalle</title>
</head>
<body>
	<h1>Empleado Detalle</h1>
	
	<ul>
		<li>Código de Empleado: ${empleado.codEmpleado}</li>
		<li>Salario: ${empleado.salario}</li>
		<li>Fecha de Alta: <fmt:formatDate pattern = "dd-MM-yyyy" value = "${empleado.fechaAlta}" /></li>
		
		<li><a href="edit?id=${empleado.id}">+ Modificar</a> | <a href="delete?id=${empleado.id}">- Eliminar</a></li>
	</ul>
</body>
</html>