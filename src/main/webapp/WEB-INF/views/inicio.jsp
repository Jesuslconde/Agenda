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
	<h1>Opciones Agenda</h1>
	<c:forEach items="${personas}" var="per">
		
		<h2>${per.nombre}${per.apellido1}${per.apellido2}</h2>
		
		<c:forEach items="${per.listTelf}" var="pertel">
			<h2>${pertel.telefono}</h2>
		</c:forEach>
	 </c:forEach>
	
</body>
</html>