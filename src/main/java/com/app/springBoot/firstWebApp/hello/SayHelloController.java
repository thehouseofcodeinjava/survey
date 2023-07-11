package com.in28minutes.springBoot.firstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SayHelloController {

	@RequestMapping("/helloPage")
	public String sayHello() {
	       return "Hiiiiiiiiiii";
	}
	@RequestMapping("/helloPageJsp")
	public String sayHelloJsp(Model model) {
		
	       return "helloPage";
	}
}

