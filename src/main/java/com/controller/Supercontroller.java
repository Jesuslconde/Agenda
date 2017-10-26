package com.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.model.Persona;
import com.model.Telefono;
import com.service.InterfazService;
import com.model.Categoria;
import com.model.Departamento;
import com.model.Empleado;
import com.service.CategoriaService;
import com.service.InterfazService;




@Controller
public class Supercontroller {
	
	@Autowired
	private InterfazService<Persona> personaService;
	
	@Autowired
	private InterfazService<Categoria> categoriaService;
	
	@Autowired
	private InterfazService<Departamento> departamentoService;
	
	@RequestMapping("/")
	public ModelAndView inicio() throws Exception{
		List<Persona> per =  personaService.list();
		ModelAndView model = new ModelAndView("inicio");
		model.addObject("personas", per);
		return model;
		
	}
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add() {
		
		ModelAndView model = new ModelAndView("add");
		model.addObject("persona", new Persona());
		return model;		
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView  edit() throws IOException {
		
		ModelAndView model = new ModelAndView("edit");
		model.addObject("persona", new Persona());
		return model;
	
	}	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView  newpersona(@ModelAttribute Persona persona) throws IOException {
		
		System.out.println(persona.toString());
		personaService.saveOrUpdate(persona);
		return new ModelAndView("redirect:/");
	
	}	
	
	

}
