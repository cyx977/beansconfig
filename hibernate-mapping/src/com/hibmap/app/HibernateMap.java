package com.hibmap.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibmap.tables.Instructor;
import com.hibmap.tables.InstructorDetail;


public class HibernateMap {

	public static void main(String[] args) {
		Instructor i = new Instructor();
		InstructorDetail id = new InstructorDetail();
		id.setHobby("random hobby");
		id.setYoutube_channel("some random url");
		SessionFactory factory = new Configuration().configure("cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();	
		i.setName("santosh");
		i.setInstructor_detail(id);
		session.beginTransaction();
//		Instructor i = session.get(Instructor.class, 1);
//		System.out.println(i);
		
//		session.delete(i);
	
		session.save(i);
		session.getTransaction().commit();
		factory.close();
		session.close();
	}

}
