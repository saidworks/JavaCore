package com.perscholas.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBApp {
	

	public static void main(String[] args) throws SQLException {
		DBUtil db = new DBUtil();
		Connection con = db.getConnection();

		Student said = new Student(1,"Said","Computer Science","Boston");
		updateStudent(said);
	}
	

	public static void updateStudent(Student student) throws SQLException {
		DBUtil db = new DBUtil();
		Connection con = db.getConnection();
		String updateQuery = "UPDATE student SET Name=?,Course=?, Address=?  WHERE Rollno=? ";
		System.out.println("trying");
		try(PreparedStatement ps = con.prepareStatement(updateQuery);) {
		ps.setInt(4,student.getRollNo());
		ps.setString(1,student.getName());
		ps.setString(2,student.getCourse());
		ps.setString(3,student.getAddress());
		ps.executeUpdate();
		System.out.println("Entry modified");
	
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

	public static void addStudent(Student student) throws SQLException {
		DBUtil db = new DBUtil();
		Connection con = db.getConnection();
		
		ResultSet resultSet = null;
		// Writing a parameterised query in prepared Statement
		String insertQuery = "INSERT INTO student(RollNo,Name,Course,Address) VALUES(?,?,?,?)";
	
		try {
			
//			 Compiling query String
			PreparedStatement statement = con.prepareStatement(insertQuery);
			// setting parameter to the query
			statement.setInt(1, 11);
			statement.setString(2, "Dinesh");
			statement.setString(3, "DCA");
			statement.setString(4, "Patna");
			//Updating Query
			statement.executeUpdate();
			statement.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}
