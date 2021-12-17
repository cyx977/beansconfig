package com.hibmap.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibmap.tables.Course;
import com.hibmap.tables.Instructor;
import com.hibmap.tables.InstructorDetail;

public class HqlDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();	
		session.beginTransaction();
		Query<Instructor> query = session.createQuery("select i from Instructor i"+" JOIN FETCH i.courses where i.id=:theInstructorId", Instructor.class);
		query.setParameter("theInstructorId", 1);
		Instructor i = query.getSingleResult();
		System.out.println(i.getName());
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
