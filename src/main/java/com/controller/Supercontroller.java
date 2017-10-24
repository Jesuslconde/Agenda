package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Direccion;
import com.model.Persona;
import com.model.Telefono;
import com.service.IDireccionService;
import com.service.InterfazService;
import com.service.TelefonoServiceImp;



@Controller
public class Supercontroller {
	
	@Autowired
	private InterfazService<Persona> personaService;

	
	@RequestMapping("/")
	public ModelAndView inicio() throws Exception{
		List<Persona> per =  personaService.list();
		ModelAndView model = new ModelAndView("inicio");
		model.addObject("personas", per);
		return model;
	}
	
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
	
}
