package com.abhi.firstweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value="/", method= RequestMethod.GET)
	public ModelAndView home() {
		Map<String, String> model =new HashMap<>();
		model.put("name", "Abhishek kumar Tiwari");
		return new ModelAndView("home", model);

	}
	
	@RequestMapping(value="/test", method= RequestMethod.GET)
	public ModelAndView homeModelAndView() {
		Map<String, String> model =new HashMap<>();
		model.put("name", "Abhishek kumar Tiwari");
		return new ModelAndView("home", model);
	}
	
	@RequestMapping(value="/version", method= RequestMethod.GET)
	@ResponseBody
	public String getversion() {
		return "0.0.1";
	}
	
	@RequestMapping(value="/newversion", method= RequestMethod.GET)
	@ResponseBody
	public String getNewVersion() {
		return "0.0.2";
	}
}
