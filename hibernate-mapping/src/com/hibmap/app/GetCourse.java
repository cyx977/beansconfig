package com.hibmap.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibmap.tables.Course;
import com.hibmap.tables.Instructor;
import com.hibmap.tables.InstructorDetail;
import com.hibmap.tables.Review;

public class GetCourse {

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
			
			//get Courses
			Course course = session.get(Course.class, 1);
			System.out.println(course.getReviews().get(0).getCourse().getTitle());
			
//			InstructorDetail detail = new InstructorDetail();
//			detail.setHobby("basketball");
//			detail.setYoutube_channel("another url");
//			Instructor instructor = new Instructor();
//			instructor.setName("pravat");
//			instructor.setInstructor_detail(detail);
//			
//			Course c = new Course();
//			c.setId(1);
//			c.setInstructor(instructor);
//			c.setTitle("somecourse");
//			System.out.println(c);
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
