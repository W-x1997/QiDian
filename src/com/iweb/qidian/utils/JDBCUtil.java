package com.iweb.qidian.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class JdbcUtil {

	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/book";
			String user = "root";
			String password = "jsjywx123";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
				
		}

		return conn;
	}

	public static ResultSet select(String sql) {
		Connection conn = getConn();
		Statement statement = null;
		ResultSet result = null;
		try {
			statement = conn.createStatement();
			result = statement.executeQuery(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static boolean insert(String sql) {
		Connection conn = getConn();
		Statement statement = null;
		boolean flag=true ;
		try {
			statement = conn.createStatement();
		
			statement.execute(sql);
		} catch (SQLException e) {
			flag=false;
			e.printStackTrace();
		}
		return flag;
	}
	public static void update(String sql) {
		Connection conn = getConn();
		Statement statement = null;
		try {
			statement = conn.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
