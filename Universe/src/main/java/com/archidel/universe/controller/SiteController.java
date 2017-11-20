package com.archidel.universe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SiteController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		System.out.println("get method");
		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		return "index";
		a
		sd
		as
		da
		sd
		
	}
	
}
