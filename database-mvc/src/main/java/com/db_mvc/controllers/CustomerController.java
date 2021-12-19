package com.db_mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.db_mvc.entity.Customer;
import com.db_mvc.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	
	@GetMapping("/list")
	public String list(Model model) {		
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "customer";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {		
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customer-form";
	}
	
	@PostMapping("/processAdd")
	public String processAdd(Model model, @ModelAttribute("customer") Customer customer ) {		
		System.out.println(customer.getEmail());
		model.addAttribute("customer", customer);
		return "redirect:/customer/list";
	}
	
	
}
