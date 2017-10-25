package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	@Autowired
	private InterfazService<Telefono> telefonoService;
	
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
	
	@RequestMapping(value = "/addpersona", method = RequestMethod.POST)
	public ModelAndView  newpersona(@ModelAttribute Persona persona) throws IOException {
		
		System.out.println(persona.toString());
		personaService.saveOrUpdate(persona);
		return new ModelAndView("redirect:/");
	
	}
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public ModelAndView newEmpID() {
		ModelAndView model = new ModelAndView("CategoriaList");
	
		
		return model;		
	}
	
	/*
	@RequestMapping(value = "/newPersona", method = RequestMethod.GET)
	public ModelAndView newPersona() {
		ModelAndView model = new ModelAndView("PersonaForm");
		model.addObject("persona", new Persona());
		return model;		
	}
	
	
	*/
}
