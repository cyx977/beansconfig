package com.db_mvc.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = "root";
		String pass = "";
		String jdbc_url = "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false";
		
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			out.println("connecting to database..."+ jdbc_url);
			Class.forName(driver);
			
			Connection myCon = DriverManager.getConnection(jdbc_url, userName, pass);
			out.println("success");
			myCon.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
