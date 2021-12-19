package com.db_mvc.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.db_mvc.dao.CustomerDAO;
import com.db_mvc.entity.Customer;


@Repository
@Qualifier("first")
public class CustomerDaoImpl implements CustomerDAO {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory abcSessionFactory;
	
	
	@Override
	public List<Customer> getCustomers() {
		System.out.println("using first as dependency");
		Session currentSession = abcSessionFactory.getCurrentSession();
		Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);
		List<Customer> customers = query.getResultList();
		return customers;
	}

}
