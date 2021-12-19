package com.db_mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.db_mvc.dao.CustomerDAO;
import com.db_mvc.entity.Customer;
import com.db_mvc.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	CustomerDAO customerDAO;
	
	@Autowired // inject FirstServiceImpl
    public CustomerServiceImpl(@Qualifier("first") CustomerDAO myService) {
        this.customerDAO = myService;
    }

	@Override
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

}
