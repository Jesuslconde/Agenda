package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.model.Empleado;
import com.service.EmpleadoService;



@Controller
public class Supercontroller {
	
	@Autowired
	private EmpleadoService empleadoService;

	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		List<Empleado> listEmpleados = empleadoService.list();
		ModelAndView model = new ModelAndView("EmpleadoList");
		model.addObject("empleadoList", listEmpleados);
		return model;
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newEmpleado() {
		ModelAndView model = new ModelAndView("EmpleadoForm");
		model.addObject("user", new Empleado());
		return model;		
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editEmpleado(HttpServletRequest request) {
		int empleadoId = Integer.parseInt(request.getParameter("id"));
		Empleado empleado = empleadoService.get(empleadoId);
		ModelAndView model = new ModelAndView("EmpleadoForm");
		model.addObject("empleado", empleado);
		return model;		
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteEmpleado(HttpServletRequest request) {
		int empleadoId = Integer.parseInt(request.getParameter("id"));
		empleadoService.delete(empleadoId);
		return new ModelAndView("redirect:/");		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Empleado empleado) {
		empleadoService.saveOrUpdate(empleado);
		return new ModelAndView("redirect:/");
	}
	
}
