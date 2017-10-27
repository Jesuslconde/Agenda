<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
<!DOCTYPE html>
<html lang="es">
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
    <spring:url value="resources/css/bootstrap.min.css" var="bootstrap"/>   
	<link href="${bootstrap}" rel="stylesheet" />
    <spring:url value="resources/css/container.css" var="buscar"/>
    <link href="${buscar}" rel="stylesheet" />
     <spring:url value="resources/css/estilos.css" var="custom"/>
    <link href="${custom}" rel="stylesheet" />
    <spring:url value="resources/js/jquery.min.js" var="jquery"/>
    <script type="text/javascript" src="${jquery}"></script>
    <spring:url value="resources/js/bootstrap.min.js" var="bootstrapjs"/>
    <script type="text/javascript" src="${bootstrapjs}"></script>
    <spring:url value="resources/js/mostrar1.js" var="script"/>
    <script type="text/javascript" src="${script}"></script>
    
    
   
    <style type="text/css">
       
    </style>
</head>
<body>
 <div>
       <h1 id="cabecera">Agenda Luca</h1>
   </div>
       <div class="container bootstrap snippet">
        <div class="row ng-scope">
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div class="panel-body text-center">
                        <div class="pv-lg"><img class="center-block img-responsive img-circle img-thumbnail thumb96" src="resources/image/imagen.jpg" alt="Contact"></div>
                        <h3 id="nombreUP" class="m0 text-bold">Nombre</h3>
                        <div id="nombreCatUP" class="mv-lg">Categoria</div>
                        <div id="nombreDeptUP" class="mv-lg">Departamento</div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div id="listaContacto" class="panel-heading">
                        <div class="panel-title text-center">ListaContactos</div>
                    </div>
                     <fieldset id="aa">

            <ul class="toolbar clearfix" id="bb">
				<li><a  type="addNew" href="add"><span class="fontawesome-plus-sign"></span></a></li>
                <li><input type="search" onkeyup="busca()" id="search" placeholder="Introduce datos..."></li>
                <li><button type="submit" id="btn-search"><span class="fontawesome-search"></span></button></li>

            </ul>

        </fieldset>
        
        	
                    <div class="panel-body">
                    <c:forEach items="${personas}" var="per">
                        <div class="media">
                            <div class="media-left media-middle">
                                <a href="#"><img class="media-object img-circle img-thumbnail thumb48" src="resources/image/imagen.jpg" alt="generico" alt="Contact"></a>
                            </div>
                            <div class="media-body pt-sm">
                                <div class="text-bold buscable" onclick="cambia1(this)">
                                    <tag id="nombre" class="campo">${per.nombre} ${per.apellido1} ${per.apellido2}</tag>
                                    
                                    <c:forEach items="${per.listTelf}" var="pertel">
                                   		<div id="telefono" class="text-sm text-muted campo">${pertel.telefono}</div>
                                    </c:forEach>
                                    
                                    <div hidden id="localidad" class="campo">${per.dir.localidad}</div>
                                    <div hidden id="provincia" class="campo">${per.dir.provincia}</div>
                                    <div hidden id="nombreDepart" class="campo">${per.emple.getDepartamento().nombre}</div>
                                    <div hidden id="codigoEmpl" class="campo">${per.emple.codEmpleado}z</div>
                                    <div hidden id="nombreCat" class="campo">${per.emple.getCategoria().nombre}</div>
                                    <div hidden id="descripcionCat" class="campo">${per.emple.getCategoria().descripcion}</div>
                                </div>
                            </div>
                        </div>
                       
              </c:forEach>     
                       
                       
                    </div>
                </div>
            </div>
            <div class="col-md-8">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="pull-right">
                            <div class="btn-group dropdown" uib-dropdown="dropdown">
                                <button class="btn btn-link dropdown-toggle" uib-dropdown-toggle="" aria-haspopup="true" aria-expanded="false"><em class="fa fa-ellipsis-v fa-lg text-muted"></em></button>
                                <ul class="dropdown-menu dropdown-menu-right animated fadeInLeft" role="menu">
                                    <li><a href=""><span>Send by message</span></a></li>
                                    <li><a href=""><span>Share contact</span></a></li>
                                    <li><a href=""><span>Block contact</span></a></li>
                                    <li><a href=""><span class="text-warning">Delete contact</span></a></li>
                                </ul>
                            </div>
                        </div>
                         <div class="h4 panel-title text-center" id="infoContacto">Información de contacto</div>
                        <div class="row pv-lg">
                            <div class="col-lg-2"></div>
                            <div class="col-lg-8">
                                <form class="form-horizontal ng-pristine ng-valid">
                                    <div class="form-group" id="nombreDescrip">
                                        <label class="col-sm-4">Nombre</label>
                                        <div class="col-sm-8" id="nombreDesc">
                                        </div>
                                    </div>
                                    <div class="form-group" id="telefonoDescrip">
                                        <label class="col-sm-4">Teléfono</label>
                                        <div class="col-sm-8" id="telefonoDesc">
                                        </div>
                                    </div>
                                    <div class="form-group" id="localidadDescrip">
                                        <label class="col-sm-4">Localidad</label>
                                        <div class="col-sm-8" id="localidadDesc">
                                        </div>
                                    </div>
                                    <div class="form-group" id="provinciaDescrip">
                                        <label class="col-sm-4">Provincia</label>
                                        <div class="col-sm-8" id="provinciaDesc">
                                        </div>
                                    </div>
                                    <div class="form-group" id="departamentoDescrip">
                                        <label class="col-sm-4">Departamento</label>
                                        <div class="col-sm-8" id="nombreDepartDesc">
                                        </div>
                                    </div>
                                    <div class="form-group" id="categoriaDescrip">
                                        <label class="col-sm-4">Categoría</label>
                                        <div class="col-sm-8" id="nombreCatDesc">
                                        </div>
                                    </div>
                                    <div class="form-group" id="descripcionCatDescrip">
                                        <label class="col-sm-4">Descripción de categoría</label>
                                        <div class="col-sm-8" id="descripcionCatDesc">
                                        </div>
                                    </div>
                                    <div class="form-group" id="codigoEmplDescrip">
                                        <label class="col-sm-4">Código de empleado</label>
                                        <div class="col-sm-8" id="codigoEmplDesc">
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script>
        function busca() {
            var texto = $('#search').val();
            texto.toLowerCase;
             var nombre, telefono, categoria, localidad, provincia, departamento, codigoEmpl,descripcionCat;
            
            $('.buscable').each(function() {
                $(this).parent().parent().css("display","");
                nombre = ($(this.querySelector('#nombre')).text());
                telefono = ($(this.querySelector('#telefono')).text());
                categoria = ($(this.querySelector('#nombreCat')).text());
                localidad = ($(this.querySelector('#localidad')).text());
                provincia = ($(this.querySelector('#provincia')).text());
                departamento = ($(this.querySelector('#nombreDepart')).text());
                codigoEmpl = ($(this.querySelector('#codigoEmpl')).text());
                descripcionCat = ($(this.querySelector('#descripcionCat')).text());
                 if (nombre.toLowerCase().indexOf(texto) > -1|| telefono.toLowerCase().indexOf(texto) > -1 || categoria.toLowerCase().indexOf(texto) > -1 || departamento.toLowerCase().indexOf(texto) > -1){
                    
                } else{
                   $(this).parent().parent().css("display","none");
                }
               
            });
        }
    </script>
    <script type="text/javascript">
        (function() {

            $('#btn-search').on('click', function(e) {

                e.preventDefault();
                $('#search').animate({
                    width: 'toggle'
                }).focus();

            });

        }());
    </script>
</body>

</html>
