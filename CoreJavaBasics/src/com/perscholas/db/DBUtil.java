package com.perscholas.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil{
	Connection connection = null;
	String driverName = "org.mariadb.jdbc.Driver";
	String connectionUrl = "jdbc:mariadb://localhost:1234/student";
	String userName = "saidlearns";
	String userPass = "mysql";

	public DBUtil() {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}

	public Connection getConnection() {
		try {
			connection = DriverManager.getConnection(connectionUrl, userName,
					userPass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	
	

}