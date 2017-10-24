package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Categoria;
import com.model.Empleado;
import com.service.CategoriaService;
import com.service.InterfazService;




@Controller
public class Supercontroller {
	
	@Autowired
	private InterfazService<Categoria> catService;
	
	/*
	@Autowired
	private InterfazService<Persona> personaService;
	@Autowired
	private InterfazService<Empleado> empleadoService;
	*/
	
	@RequestMapping("/")
	public ModelAndView inicio() throws Exception{

		ModelAndView model = new ModelAndView("inicio");
		
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
		Categoria cat =this.catService.buscaPorEmpleados(1);
		System.out.println(cat.getNombre());
		model.addObject("cat", cat);
		return model;		
	}
	@RequestMapping(value = "/ListadoEmp", method = RequestMethod.GET)
	public ModelAndView newListaCatEmpID() {
		ModelAndView model = new ModelAndView("CategoriaList");
		List<Empleado> empleados =this.catService.buscaListado(1);
		for(int i=0;i<empleados.size();i++){
			System.out.println(empleados.get(i).getCategoria().getNombre());
			System.out.println(empleados.get(i).getIdDepartamento().getNombre());
			System.out.println(empleados.get(i).getCodEmpleado());
		}
		model.addObject("categoria", empleados);
		return model;		
	}
	@RequestMapping(value = "/listCat", method = RequestMethod.GET)
	public ModelAndView newLista() {
		ModelAndView model = new ModelAndView("CategoriaList");
		List<Categoria> listCat =this.catService.list();
		for(int i=0;i<listCat.size();i++){
			System.out.println(listCat.get(i).getNombre());
		}
		model.addObject("lista", listCat);
		return model;		
	}
	@RequestMapping(value = "/editCategoria", method = RequestMethod.GET)
	public ModelAndView editUser(HttpServletRequest request) {
		int userId = Integer.parseInt(request.getParameter("id"));
		Categoria user = catService.get(userId);
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("user", user);
		return model;		
	}
	
	@RequestMapping(value = "/deleteCategoria", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		int userId = Integer.parseInt(request.getParameter("id"));
		catService.delete(userId);
		return new ModelAndView("redirect:/");		
	}
	
	@RequestMapping(value = "/saveCategoria", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Categoria cat) {
		catService.saveOrUpdate(cat);
		return new ModelAndView("redirect:/");
	}
	/*
	@RequestMapping(value = "/newPersona", method = RequestMethod.GET)
	public ModelAndView newPersona() {
		ModelAndView model = new ModelAndView("PersonaForm");
		model.addObject("persona", new Persona());
		return model;		
	}
	
	@RequestMapping(value = "/listPersona", method = RequestMethod.GET)
	public ModelAndView listPersona() {
		List<Persona> listPersonas = this.personaService.list();
		for(Persona persona : listPersonas)
			System.out.println("-- "+persona.getNombre());
		ModelAndView model = new ModelAndView("PersonaList");
		model.addObject("listPersonas", listPersonas);
		return model;		
	}
	
	@RequestMapping(value = "/viewPersona", method = RequestMethod.GET)
	public ModelAndView verPersona(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		Persona persona = this.personaService.get(id);
		ModelAndView model = new ModelAndView("PersonaDetalle");
		model.addObject("persona", persona);
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
