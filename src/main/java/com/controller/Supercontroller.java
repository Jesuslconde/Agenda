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
	public ModelAndView inicio() throws Exception{

		ModelAndView model = new ModelAndView("inicio");
		
		return model;
	}
	
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
		System.out.println("-- "+listEmpleados.get(0));
		System.out.println("-- "+listEmpleados.get(1));
		
		
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
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmpleado(@ModelAttribute Empleado empleado) {
		empleadoService.saveOrUpdate(empleado);
		return new ModelAndView("redirect:/");
	}
		
}
