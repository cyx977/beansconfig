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

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	CustomerDAO customerDAO;
	
	@Autowired // inject FirstServiceImpl
    public CustomerController(@Qualifier("first") CustomerDAO myService) {
        this.customerDAO = myService;
    }

	
	@RequestMapping("/list")
	public String sth(Model model, @RequestParam(name = "id") int id) {
		
		List<Customer> customers = customerDAO.getCustomers();
		for(Customer c : customers) {			
			System.out.println(c.getFirstName());
		}
		System.out.println(id);
		model.addAttribute("custom", "25");
		return "customer";
	}
}
