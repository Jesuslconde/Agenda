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
	<h1>Persona Direccion</h1>
	<c:forEach items="${direccion}" var="dir">
		
		<h2>${dir.direccion},${dir.localidad},${dir.provincia}</h2>
	 </c:forEach>
	 
	 <c:forEach items="${telefono}" var="tel">
		
		<h2>${tel.telefono} ${ tel.persona }</h2>
		
	 </c:forEach>
	<ul>
	</ul>
</body>
</html>