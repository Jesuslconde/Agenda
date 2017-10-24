package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Direccion;
import com.model.Persona;
import com.model.Telefono;
import com.service.IDireccionService;
import com.service.InterfazService;
import com.service.TelefonoServiceImp;

import com.model.Categoria;
import com.model.Empleado;
import com.service.CategoriaService;
import com.service.InterfazService;




@Controller
public class Supercontroller {
	
	@Autowired
	private InterfazService<Persona> personaService;
	@Autowired
	private InterfazService<Empleado> empleadoService;
	
	@RequestMapping("/")
	public ModelAndView inicio() throws Exception{
		List<Persona> per =  personaService.list();
		ModelAndView model = new ModelAndView("inicio");
		model.addObject("personas", per);
		return model;
		
	}
	@RequestMapping(value = "/newCategoria", method = RequestMethod.GET)
	public ModelAndView newCategoria() {
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("categoria", new Categoria());
		return model;		
	}
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public ModelAndView newEmpID() {
		ModelAndView model = new ModelAndView("CategoriaList");
	
		
		return model;		
	}
	@RequestMapping(value = "/ListadoEmp", method = RequestMethod.GET)
	public ModelAndView newListaCatEmpID() {
		ModelAndView model = new ModelAndView("CategoriaList");
		Categoria cat = new Categoria();
		cat.setId(1);
		List<Empleado> empleados =this.empleadoService.list();
		for(int i=0;i<empleados.size();i++){
			System.out.println(empleados.get(i).getCategoria().getNombre());
			System.out.println(empleados.get(i).getDepartamento().getNombre());
			System.out.println(empleados.get(i).getCodEmpleado());
		}
		model.addObject("categoria", empleados);
		return model;		
	}
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView newLista() {
		ModelAndView model = new ModelAndView("CategoriaList");
		List<Empleado> listCat =this.empleadoService.list();
		for(int i=0;i<listCat.size();i++){
			System.out.println(listCat.get(i).getCodEmpleado());
			System.out.println(listCat.get(i).getCategoria());
			System.out.println(listCat.get(i).getDepartamento());
		}
		model.addObject("lista", listCat);
		return model;		
	}
	


	/*
	@RequestMapping(value = "/newPersona", method = RequestMethod.GET)
	public ModelAndView newPersona() {
		ModelAndView model = new ModelAndView("PersonaForm");
		model.addObject("persona", new Persona());
		return model;		
	}
	
	@RequestMapping(value = "/viewPersona", method = RequestMethod.GET)
	public ModelAndView verPersona(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		//Persona persona = this.personaService.get(id);
		ModelAndView model = new ModelAndView("PersonaDetalle");
		//model.addObject("persona", persona);
		return model;		
	}
	/*
	@RequestMapping(value = "/newEmpleado", method = RequestMethod.GET)
	public ModelAndView newEmpleado() {
		ModelAndView model = new ModelAndView("EmpleadoForm");
		model.addObject("persona", new Empleado());
		return model;		
	}
	
	@RequestMapping(value = "/listEmpleado", method = RequestMethod.GET)
	public ModelAndView listEmpleado() {
		List<Empleado> listEmpleados = this.empleadoService.list();
		for(Empleado empleado : listEmpleados)
			System.out.println("-- "+empleado.getCodEmpleado());
		ModelAndView model = new ModelAndView("EmpleadoList");//Nombre del formulario
		model.addObject("listEmpleados", listEmpleados);
		return model;		
	}
	
	@RequestMapping(value = "/viewEmpleado", method = RequestMethod.GET)
	public ModelAndView verEmpleado(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		Empleado empleado = this.empleadoService.get(id);
		ModelAndView model = new ModelAndView("EmpleadoDetalle");
		model.addObject("empleado", empleado);
		return model;		
	}
	*/
}
