package com.santosh.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TagFormController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		System.out.println("this runs on every request inside this controller as a pre-processor");
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, editor);
	}
	
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
	public String processTagForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult result, Model model) {
		System.out.println(theStudent.firstName+ " "+ theStudent.lastName+ " "+theStudent.country+ " "+theStudent.progLang);
		if(theStudent.smartPhone != null) {
			for(String s : theStudent.smartPhone) {
				System.out.println(s);
			}
		}
		if(result.hasErrors()) {
			model.addAttribute("countries", countryOptions);
			model.addAttribute("student", theStudent);
			model.addAttribute("favoriteLanguageOptions", favoriteLanguageOptions);
			System.out.println(result);
			return "tag-form";
		}else {
			return "tag-view";
		}
	}
}