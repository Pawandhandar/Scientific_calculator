package com.history;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class manage{
	public static void insert() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/calculator","root","root123");
		Scanner sc=new Scanner(System.in);
		System.out.println("opr");
		int id=sc.nextInt();
		
		System.out.println("result");
		String name=sc.next();
		
		PreparedStatement ps=con.prepareStatement("insert into history values(?,?)");
		ps.setInt(1, id);
		ps.setString(2,name);
		int x=ps.executeUpdate();
		
		System.out.println(x);
		
		System.out.println("Data successfully inserted");

	}
	public static void delete() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/calculator","root","root123");
		  String deleteOldRecords = "DELETE FROM history WHERE id NOT IN " +
	                "(SELECT id FROM history ORDER BY time DESC LIMIT 50)";

	}
}