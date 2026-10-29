package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RegisterUser {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	       
	        String connString="jdbc:mysql://localhost:3306/adjava";
	        String username="root";
	        String password="Root123@";
	        Connection con=DriverManager.getConnection(connString,username,password);
	        String uname,pwd;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("User Name := ");
	        uname=sc.nextLine();
	        System.out.println("Password := ");
	        pwd=sc.nextLine();
	        String query="insert into user values(?,?)";
	        PreparedStatement ps=con.prepareStatement(query);
	        ps.setString(1, uname);
	        ps.setString(2, pwd);
	        System.out.println(ps);
	        
//	        System.out.println(query);
	        
	        ps.executeUpdate();
	        System.out.println("User Registered....");
	        con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}
}