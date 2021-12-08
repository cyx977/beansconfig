package com.santosh.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/process2")
	public String process2(HttpServletRequest request, Model model){
		try {
			String theName = request.getParameter("name");
			theName = theName.toUpperCase();
			String result = "yo!" + theName;
			model.addAttribute("message", result);
			return "helloworld";
		}catch (Exception e) {
			return "main-menu";
		}
	}
}
