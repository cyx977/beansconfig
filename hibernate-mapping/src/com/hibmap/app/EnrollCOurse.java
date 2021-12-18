package com.hibmap.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibmap.tables.Course;
import com.hibmap.tables.Instructor;
import com.hibmap.tables.InstructorDetail;
import com.hibmap.tables.Review;
import com.hibmap.tables.Student;

public class EnrollCOurse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			
			//enroll
//			Course course = session.get(Course.class, 1);
//			Student student = new Student();
//			student.setName("santosh");
//			student.enroll(course);
//			session.save(student);
			
			//modify
//			Student student = session.get(Student.class, 1);
//			Course course = session.get(Course.class, 2);
//			student.enroll(course);
			
			
			//get
			Course course = session.get(Course.class, 1);
			List<Student> students = course.getStudents();
			for(Student s : students) {
				System.out.println(s.getName());
			}
			
			
			

			
			
			
			
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
