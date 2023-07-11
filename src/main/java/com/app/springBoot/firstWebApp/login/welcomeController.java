package com.in28minutes.springBoot.firstWebApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.extern.log4j.Log4j2;



@Controller
@Log4j2
@SessionAttributes
public class welcomeController {
	
	Logger logger=LoggerFactory.getLogger(getClass());

	@RequestMapping(method=RequestMethod.GET , value="/")
	public String gotoLogin(ModelMap model) {
		
		   model.put("name", "in28minutes");
		  // @RequestParam  String name,ModelMap model
		  // logger.info("name is ===");
		  // logger.info(name);
	       return "welcome";
	}
	
	/* @PostMapping("login")
	public String gotoHome(@RequestParam String name , @RequestParam String password,ModelMap model) {
		AuthService authService=new AuthService();
		if(authService.Authenticate(name,password)) {
			model.put("name",name);
			model.put("password", password);
			return "welcome";
		}
		return "login";
	}*/
}
