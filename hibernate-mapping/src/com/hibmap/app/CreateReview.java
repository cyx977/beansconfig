package com.hibmap.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibmap.tables.Course;
import com.hibmap.tables.Instructor;
import com.hibmap.tables.InstructorDetail;
import com.hibmap.tables.Review;

public class CreateReview {

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
			
			//change course name
//			Course course = session.get(Course.class, 1);
//			course.setTitle("changed");

			//add review
			Course course = session.get(Course.class, 1);
			Review review = new Review();
			review.setCourse(course);
			review.setComment("mind blowingich");
			course.addReview(review);
	
			//modify Review
//			Course course = session.get(Course.class, 2);
//			Review review = session.get(Review.class, 1);
//			review.setComment("changed cmt");
//			review.setCourse(course);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			session.getTransaction().commit();
			session.close();
			factory.close();
		}
	}

}
