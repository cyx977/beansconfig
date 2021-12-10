package com.santosh.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TagFormController {
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	
	@Value("#{favoriteLanguageOptions}")
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	@RequestMapping("/tagform")
	public String showTagForm(Model model) {
		for(Map.Entry<String, String> entry: countryOptions.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		model.addAttribute("countries", countryOptions);
		model.addAttribute("student", new Student());
		model.addAttribute("favoriteLanguageOptions", favoriteLanguageOptions);
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