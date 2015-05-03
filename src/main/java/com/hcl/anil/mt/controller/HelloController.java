package com.hcl.anil.mt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/","/home"})
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}
}