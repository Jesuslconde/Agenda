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
import com.service.IPersonaService;
import com.service.TelefonoServiceImp;



@Controller
public class Supercontroller {
	
	@Autowired
	private IPersonaService personaService;
	
	@Autowired
	private IDireccionService direccionService;
	
	@Autowired
	private TelefonoServiceImp telefonoService;
	
	@RequestMapping("/")
	public ModelAndView inicio() throws Exception{

		ModelAndView model = new ModelAndView("inicio");
		
		return model;
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
	@RequestMapping(value = "/direccion", method = RequestMethod.GET)
	public ModelAndView personasPorDirecciones(HttpServletRequest request) {
		System.out.println("Pasa por controller");
		String id = request.getParameter("key");
		List<Telefono> tel =  telefonoService.get(id);
		ModelAndView model = new ModelAndView("buscardireccion");
		model.addObject("telefono", tel);
		return model;		
	}
	
}
