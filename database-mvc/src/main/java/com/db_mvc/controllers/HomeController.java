package com.db_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class HomeController {
	@RequestMapping
	public String showMyPage(Model model) {
		model.addAttribute("root", "/spring-mvc-demo");
		return "main-menu";
	}
}
