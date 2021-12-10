package com.santosh.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TagFormController {
	@RequestMapping("/tagform")
	public String showTagForm(Model model) {
		model.addAttribute("student", new Student());
		return "tag-form";
	}
	
	@RequestMapping("/processTagForm")
	public String processTagForm(@ModelAttribute("student") Student theStudent) {
		System.out.println(theStudent.firstName+ " "+ theStudent.lastName+ " "+theStudent.country+ " "+theStudent.progLang);
		for(String s : theStudent.smartPhone) {
			System.out.println(s);
		}
		return "tag-view";
	}
}