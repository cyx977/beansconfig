package com.santosh.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("root", "/spring-mvc-demo");
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/process2")
	public String process2(HttpServletRequest request, @RequestParam("name") String theName, Model model){
		try {	
			theName = theName.toUpperCase();
			String result = "yo!" + theName;
			model.addAttribute("message", result);
			return "helloworld";
		}catch (Exception e) {
			return "main-menu";
		}
	}
}
