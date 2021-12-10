package com.santosh.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/a")
public class NestedController {
	@RequestMapping
	public String dont() {
		System.out.println("b");
		return "helloworld";
	}
	
	@RequestMapping("/a")
	public String doIt() {
		System.out.println("a");
		return "helloworld";
	}
	
	

}
