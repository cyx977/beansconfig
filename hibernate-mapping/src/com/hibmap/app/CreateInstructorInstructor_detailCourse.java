package com.hibmap.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibmap.tables.Course;
import com.hibmap.tables.Instructor;
import com.hibmap.tables.InstructorDetail;
import com.hibmap.tables.Review;
import com.hibmap.tables.Student;

public class CreateInstructorInstructor_detailCourse {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();	
		
		try {
			session.beginTransaction();
			//create instructor and instructor detail
			InstructorDetail detail = new InstructorDetail();
			detail.setHobby("basketball");
			detail.setYoutube_channel("another url");
			Instructor instructor = new Instructor();
			instructor.setName("pravat");
			instructor.setInstructor_detail(detail);
			
			
			//create course and link to instructor
			Course course = new Course();
			course.setTitle("node");
			course.setInstructor(instructor);
			instructor.addCourses(course);
			
			Course course1 = new Course();
			course1.setTitle("flutter");
			course1.setInstructor(instructor);
			instructor.addCourses(course1);
					
			session.save(instructor);
			
			
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
