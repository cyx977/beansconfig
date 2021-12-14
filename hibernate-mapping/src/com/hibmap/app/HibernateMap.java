package com.hibmap.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibmap.tables.Course;
import com.hibmap.tables.Instructor;
import com.hibmap.tables.InstructorDetail;


public class HibernateMap {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();	
		try {
//			Instructor i = new Instructor();
//			InstructorDetail id = new InstructorDetail();
//			id.setHobby("random hobby");
//			id.setYoutube_channel("some random url");
//			i.setName("santosh");
//			i.setInstructor_detail(id);
			
			

			session.beginTransaction();
		
//			session.save(i);
//			System.out.println(i);
			
//			session.delete(i);
			
//			Instructor i = session.get(Instructor.class, 1);
//			System.out.println(i.getInstructor_detail().getInstructor().getName());
//			session.delete(i.getInstructor_detail());
					
			//create instructor and instructor detail
			InstructorDetail detail = new InstructorDetail();
			detail.setHobby("football");
			detail.setYoutube_channel("some url");
			Instructor instructor = new Instructor();
			instructor.setName("santosh");
			instructor.setInstructor_detail(detail);
			
			
			//create course and link to instructor
			Course course = new Course();
			course.setTitle("hibernate");
			course.setInstructor(instructor);
			
			Course course1 = new Course();
			course1.setTitle("MVC");
			course1.setInstructor(instructor);
			instructor.addCourses(course);
			instructor.addCourses(course1);
			
//			Instructor instructor = session.get(Instructor.class, 1);
//			List<Course> courses = instructor.getCourses();
//			for (Course c : courses) {
//				System.out.println(c.getTitle());
//			}
					
			session.save(instructor);
//			session.save(course);
			
			
			//add course
//			Course course = new Course();
//			course.setTitle("MVC");
//			Instructor instructor = session.get(Instructor.class, 1);
//			instructor.addCourses(course);
			
			session.getTransaction().commit();
			
			
		} finally {
			session.close();
			factory.close();
		}
//		
		
	}

}
