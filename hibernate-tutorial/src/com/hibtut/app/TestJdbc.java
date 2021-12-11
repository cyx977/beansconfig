package com.hibtut.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false";
		String user = "root";
		String password = "";
		try {
			System.out.println("connecting to database "+jdbcUrl);
			Connection myConnection = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("connection successful");
			myConnection.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
