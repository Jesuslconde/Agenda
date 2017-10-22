package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Persona;
import com.service.IPersonaService;



@Controller
public class Supercontroller {
	
	@Autowired
	private IPersonaService personaService;
	
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
	
}
