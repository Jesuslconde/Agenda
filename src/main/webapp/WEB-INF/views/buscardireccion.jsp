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
	 <h2>${persona.nombre}</h2>
	  <h2>${persona.apellido1}</h2>
	   <h2>${persona.apellido2}</h2>
	    <h2>${persona.dni}</h2>
	     <h2>${persona.fechaNacimiento}</h2>
	       <h2>${persona.dir.direccion}</h2>
	       <h2>${persona.dir.codPostal}</h2>
	       <h2>${persona.dir.localidad}</h2>
	       <h2>${persona.dir.provincia}</h2>
	       
	 <c:forEach items="${dir}" var="per">
		
		<h2>${per}</h2>
		
	 </c:forEach>
	<ul>
	</ul>
</body>
</html>