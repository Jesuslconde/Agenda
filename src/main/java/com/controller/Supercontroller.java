package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class Supercontroller {
	
	@RequestMapping("/")
	public ModelAndView inicio() throws Exception{

		//Preparacion para recoger un formulario
		ModelAndView model = new ModelAndView("inicio");
		
		return model;
	}
}
