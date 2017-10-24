package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Persona;
import com.service.IPersonaService;
import com.service.InterfazService;
import com.model.Categoria;
import com.model.Empleado;
import com.service.CategoriaService;
import com.service.EmpleadoService;


@Controller
public class Supercontroller {
	
	@Autowired
	private IPersonaService personaService;
	
	/*
	private EmpleadoService empleadoService;
	private CategoriaService catService;
	*/

	@RequestMapping("/")
	public ModelAndView inicio() throws Exception{
		ModelAndView model = new ModelAndView("inicio");
		return model;
	}
/*
	@RequestMapping(value = "/newCategoria", method = RequestMethod.GET)
	public ModelAndView newCategoria() {
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("categoria", new Categoria());
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
*/	
	
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
