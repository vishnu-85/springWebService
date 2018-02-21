package com.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelpController {
	@RequestMapping("/help")
	public ModelAndView help(){
		 return new ModelAndView("home");  
      
	}
}