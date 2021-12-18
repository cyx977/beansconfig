package com.hibmap.app;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibmap.tables.Course;
import com.hibmap.tables.Instructor;
import com.hibmap.tables.InstructorDetail;
import com.hibmap.tables.Review;
import com.hibmap.tables.Student;

public class Criterias {
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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Course> criteria = builder.createQuery(Course.class);
			Root<Course> courseRoot=criteria.from(Course.class);
			criteria.select(courseRoot);

			
//			criteria.where(builder.equal(courseRoot.get("title"), "flutter"));
			criteria.where(builder.or(builder.equal(courseRoot.get("title"), "flutter"), builder.equal(courseRoot.get("title"), "node")));
			
			List<Course> courseList=session.createQuery(criteria).getResultList();
			
			for(Course c: courseList) {
				System.out.println(c.getInstructor().getName());
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
