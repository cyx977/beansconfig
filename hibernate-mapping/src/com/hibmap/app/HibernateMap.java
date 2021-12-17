package com.hibmap.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibmap.tables.Course;
import com.hibmap.tables.Instructor;
import com.hibmap.tables.InstructorDetail;
import com.hibmap.tables.Review;


public class HibernateMap {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();	
		
		try {
			session.beginTransaction();
	
			
			//add review
			Course course = session.get(Course.class, 2);
			Review review = new Review();
			review.setComment("2.8 is out");
			review.setCourse(course);
			course.addReview(review);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			session.getTransaction().commit();
			session.close();
			factory.close();
		}
//		
		
	}

}
