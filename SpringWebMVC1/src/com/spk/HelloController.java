package com.spk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/hello")
public class HelloController{

	// Route all HTTP method GET request to this method by default
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		
		//business logic or model processing
		model.addAttribute("message", "Hello SPK...Spring MVC Framework is rocking!");

		//returning view name i.e. filename of JSP
		return "hello";
	}

}
