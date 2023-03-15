package com.prorigo.JavaFeature;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {

	public static void main(String args[]) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "mysql");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from user");) {
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "" + rs.getString(2) + "" + rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}