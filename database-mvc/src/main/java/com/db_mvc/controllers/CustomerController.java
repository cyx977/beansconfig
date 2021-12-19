package com.db_mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.db_mvc.dao.CustomerDAO;
import com.db_mvc.entity.Customer;
import com.db_mvc.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	
	@RequestMapping("/list")
	public String sth(Model model) {
		
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customer", customers);
		return "customer";
	}
}
