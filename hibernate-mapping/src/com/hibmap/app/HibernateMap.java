package com.hibmap.app;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibmap.tables.Course;
import com.hibmap.tables.Instructor;
import com.hibmap.tables.InstructorDetail;
import com.hibmap.tables.Review;
import com.hibmap.tables.Student;


public class HibernateMap {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();	
		
		session.beginTransaction();
		
		
		session.getTransaction().commit();
		session.close();
		
		
		
//		try {
//			session.beginTransaction();
//			
//			
//
//			
//			
//			
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			session.getTransaction().commit();
//			session.close();
//			factory.close();
//		}
//		
		
	}

}
