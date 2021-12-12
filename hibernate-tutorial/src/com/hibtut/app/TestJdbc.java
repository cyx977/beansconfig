package com.hibtut.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jibtut.hibernate.entity.Student;


public class TestJdbc {

	public static void main(String[] args) {
//		String jdbcUrl = "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false";
//		String user = "root";
//		String password = "";
		try {
//			System.out.println("connecting to database "+jdbcUrl);
//			Connection myConnection = DriverManager.getConnection(jdbcUrl, user, password);
//			System.out.println("connection successful");
//			myConnection.close();
			SessionFactory factory = new Configuration().configure("cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
//			Session session = factory.getCurrentSession();	
			final Session session = factory.openSession();
			Student s = new Student();
			s.setName("random guy");
//			s.setId(2);
			session.beginTransaction();
			int theId = (Integer) session.save(s);
			System.out.println(theId);
//			Student s1 = session.get(Student.class, 1);
//			System.out.println(s1.getName());
//			Thread.sleep(1000*50);
//			System.out.println("done sleeping");https://img-c.udemycdn.com/redactor/2016-10-06_12-44-20-3b68464e433153ad29cb254bb1f7f136/image4.png
//			List<Student> students = session.createQuery("from Student s where s.id='2' OR s.id='3'").getResultList();
//			displayStudents(students);
			
			session.getTransaction().commit();
			factory.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void displayStudents(List<Student> students) {
		for(Student s : students) {
			System.out.println(s);
		}
	}

}
