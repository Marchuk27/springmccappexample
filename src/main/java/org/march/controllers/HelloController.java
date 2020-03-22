package org.march.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Spring MVC WebApp Example");
		return "start";
	}

	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public String sendSomething(ModelMap model) {
		model.addAttribute("message", "Spring MVC WebApp Example");
		return "second";
	}
}