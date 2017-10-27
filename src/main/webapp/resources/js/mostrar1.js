function cambia1(object) {
    var nombre = ($(object.querySelector('#nombre')).text());
    var telefono = ($(object.querySelector('#telefono')).text());
    var categoria = ($(object.querySelector('#nombreCat')).text());
    var localidad = ($(object.querySelector('#localidad')).text());
    var provincia = ($(object.querySelector('#provincia')).text());
    var departamento = ($(object.querySelector('#nombreDepart')).text());
    var codigoEmpl = ($(object.querySelector('#codigoEmpl')).text());
    var descripcionCat = ($(object.querySelector('#descripcionCat')).text());
    $("#nombreUP").html(nombre);
    $("#nombreDeptUP").html(departamento);
    $("#nombreCatUP").html(categoria);
    $("#telefonoDescrip").css("display", "");
    $("#localidadDescrip").css("display", "");
    $("#provinciaDescrip").css("display", "");
    $("#nombreDepartDescrip").css("display", "");
    $("#nombreCatDescrip").css("display", "");
    $("#descripcionCatDescrip").css("display", "");
    $("#codigoEmplDescrip").css("display", "");


    
    if (nombre != "") {
        $("#nombreDesc").html(nombre);
    } else {
        $("#nombreDescrip").css("display", "none");
    }
    if (telefono != "") {
        $("#telefonoDesc").html(telefono);
    } else {
        $("#telefonoDescrip").css("display", "none");
    }
    if (localidad != "") {
        $("#localidadDesc").html(localidad);
    } else {
        $("#localidadDescrip").css("display", "none");
    }
    if (provincia != "") {
        $("#provinciaDesc").html(provincia);
    } else {
        $("#provinciaDescrip").css("display", "none");
    }
    if (departamento != "") {
        $("#nombreDepartDesc").html(departamento);
    } else {
        $("#nombreDepartDescrip").css("display", "none");
    }
    if (categoria != "") {
        $("#nombreCatDesc").html(categoria);
    } else {
        $("#categoriaDescrip").css("display", "none");
    }
    if (descripcionCat != "") {
        $("#descripcionCatDesc").html(descripcionCat);
    } else {
        $("#descripcionCatDescrip").css("display", "none");
    }
    if (codigoEmpl != "") {
        $("#codigoEmplDesc").html(codigoEmpl);
    } else {
        $("#codigoEmplDescrip").css("display", "none");
    }
};
