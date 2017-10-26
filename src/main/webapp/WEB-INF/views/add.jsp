<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <!--  This file has been downloaded from bootdey.com    @bootdey on twitter -->
    <!--  All snippets are MIT license http://bootdey.com/license -->
    <!-- 
    	The codes are free, but we require linking to our web site.
    	Why to Link?
    	A true story: one girl didn't set a link and had no decent date for two years, and another guy set a link and got a top ranking in Google! 
    	Where to Put the Link?
    	home, about, credits... or in a good page that you want
    	THANK YOU MY FRIEND!
    -->
    <title>contact details page - Bootdey.com</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="js/mostrar1.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/estilos.css">
    <style type="text/css">
        body {
            margin-top: 20px;
            background: #f5f7fa;
        }

        .panel.panel-default {
            border-top-width: 3px;
        }

        .panel {
            box-shadow: 0 3px 1px -2px rgba(0, 0, 0, .14), 0 2px 2px 0 rgba(0, 0, 0, .098), 0 1px 5px 0 rgba(0, 0, 0, .084);
            border: 0;
            border-radius: 4px;
            margin-bottom: 16px;
        }

        .thumb96 {
            width: 96px!important;
            height: 96px!important;
        }

        .thumb48 {
            width: 48px!important;
            height: 48px!important;
        }
    </style>
</head>

<body>
    <div class="container bootstrap snippet">
        <div class="row ng-scope">
            
            <div class="col-md-12">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="h4 text-center">Nuevo contacto</div>
                        <div class="row pv-lg">
                            <div class="col-lg-2"></div>
                            <div class="col-lg-8">
                            
                            
                            	<form:form id="form1" class="form-horizontal ng-pristine ng-valid" action="save" method="post" modelAttribute="persona">
                                    <div class="form-group">
                                        <label class="col-sm-4 control-label" for="nombreDesc">Nombre</label>
                                        <div class="col-sm-8">
                                            <form:input id="nombreDesc" class="form-control" path="nombre" />
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label class="col-sm-4 control-label" for="nombreDesc">Primer apellido</label>
                                        <div class="col-sm-8">
                                            <form:input id="nombreDesc" class="form-control" path="apellido1" />
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label class="col-sm-4 control-label" for="nombreDesc">Segundo apellido</label>
                                        <div class="col-sm-8">
                                            <form:input id="nombreDesc" class="form-control" path="apellido2" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-4 control-label" for="telefonoDesc">Fecha Nacimiento</label>
                                        <div class="col-sm-8">
                                            <form:input  class="form-control" path="fechaNacimiento" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-4 control-label" for="telefonoDesc">DNI</label>
                                        <div class="col-sm-8">
                                            <form:input  class="form-control" path="dni" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-4 control-label" for="localidadDesc">Calle</label>
                                        <div class="col-sm-8">
                                            <form:input class="form-control" path="dir.direccion" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-4 control-label" for="localidadDesc">Localidad</label>
                                        <div class="col-sm-8">
                                            <form:input class="form-control" path="dir.localidad" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-4 control-label" for="provinciaDesc">Provincia</label>
                                        <div class="col-sm-8">
                                            <form:input path="dir.provincia" class="form-control"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-4 control-label" for="provinciaDesc">Codigo postal</label>
                                        <div class="col-sm-8">
                                            <form:input path="dir.codpostal" class="form-control" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-4 control-label" for="nombreDepartDesc">Codigo de empleado</label>
                                        <div class="col-sm-8">
                                            <form:input path="emple.codEmpleado" class="form-control"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-4 control-label" for="nombreCatDesc">Fecha de alta en la empresa</label>
                                        <div class="col-sm-8">
                                            <form:input path="emple.fechaAlta" class="form-control" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-4 control-label" for="descripcionCatDesc">Salario</label>
                                        <div class="col-sm-8">
                                            <form:input path="emple.salario" class="form-control"/>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <div class="col-sm-offset-1 col-sm-12">
                                           <div class="text-center">
                                           <input class="btn btn-primary" type="submit"  value="Guardar">
                                           </form:form>
                                           <form:form  action="/agendaluca" method="post" >
                                          	  <input class="btn btn-primary" type="submit"  value="Volver"></div>
                                           </form:form>
                                         
                                        </div>
                                    </div>
                                
                                
                                
                                
                                
                               
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript">
    </script>
</body>
</html>