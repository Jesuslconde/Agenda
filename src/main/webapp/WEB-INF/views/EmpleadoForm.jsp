<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">


		<spring:url value="/resources/css/bootstrap.css" var="estilos1" />
		<link href="${estilos1}" rel="stylesheet" />
		
		<spring:url value="/resources/css/custom.css" var="estilos3" />
		<link href="${estilos3}" rel="stylesheet" />		
	
		<spring:url value="css/bootstrap.css" var="estilos2" />
		<link href="${estilos2}" rel="stylesheet" />	
		
        <link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
<title>FORMULARIO DE EMPLEADOS</title>
</head>
<body>
	<div align="center">
		<h1>FORMULARIO DE EMPLEADOS (add/edit)</h1>
		<table>
			<form:form action="save" method="post" modelAttribute="user">
				<form:hidden path="id" />
				<tr>
					<td>Código Empleado:</td>
					<td><form:input path="username" /></td>
				</tr>
				<tr>
					<td>Salario:</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>Fecha de Alta:</td>
					<td><form:password path="password" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Guardar Registro"></td>
				</tr>
			</form:form>
		</table>
	</div>

</body>
</html>