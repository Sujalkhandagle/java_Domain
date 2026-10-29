package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Adjava","root","Root123@");
			Statement smt = con.createStatement();
			String uname,pwd;
			Scanner sc= new Scanner(System.in);
			System.out.println("User Name :=");
			uname=sc.nextLine();
			System.out.println("Password :=");
			pwd=sc.nextLine();
			
			String query="Select * from user1 "
					+"where username like ? "
					+"and password like ?";
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1,uname);
			ps.setString(2, pwd);
			
			ResultSet rs= ps.executeQuery();
			if(rs.next())
				System.out.println("Login Succesful");
			else
				System.out.println("Acces Denied !!");
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}
	}