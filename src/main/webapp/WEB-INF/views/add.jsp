<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>FORMULARIO DE USUARIOS (add/edit)</h1>
		<table>
			<form:form id="form1" action="save" method="post" modelAttribute="persona">
				<tr>
					<td>Nombre:</td>
					<td><form:input path="nombre" /></td>
				</tr>
				<tr>
					<td>Primer Apellido:</td>
					<td><form:input path="apellido1" /></td>
				</tr>
				<tr>
					<td>Segundo Apellido</td>
					<td><form:input path="apellido2" /></td>
				</tr>
				<tr>
					<td>Fecha Nacimiento</td>
					<td><form:input  path="fechaNacimiento" /></td>
				</tr>
				<tr>
					<td>DNI</td>
					<td><form:input path="dni" /></td>
				</tr>
				<tr>
					<td>Direccion:</td>
					<td><form:input path="dir.direccion" /></td>
					<td>Codigo Postal:</td>
					<td><form:input path="dir.codpostal" /></td>
					<td>Localidad:</td>
					<td><form:input path="dir.localidad" /></td>
					<td>Provincia:</td>
					<td><form:input path="dir.provincia" /></td>
				</tr>
				
				<tr>
					<td>Codigo Empleado:</td>
					<td><form:input path="emple.codEmpleado" /></td>
					<td>Fecha Alta:</td>
					<td><form:input path="emple.fechaAlta"  /></td> 
					<td>Salario:</td>
					<td><form:input path="emple.salario" /></td>
				</tr>
				<tr>
					<td><input type="submit"  value="añadir"></td>
				</tr>
			</form:form>
		</table>
</body>
</html>