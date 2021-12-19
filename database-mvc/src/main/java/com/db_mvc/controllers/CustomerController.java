package com.db_mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.db_mvc.dao.CustomerDAO;
import com.db_mvc.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String sth(Model model) {
		
		List<Customer> customers = customerDAO.getCustomers();
		for(Customer c : customers) {
			System.out.println(c.getFirstName());
		}
		model.addAttribute("custom", "25");
		return "customer";
	}
}
