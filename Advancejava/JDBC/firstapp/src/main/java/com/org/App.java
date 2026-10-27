package com.org;
import java.sql.*;

import java.sql.DriverManager;

public class App 
{
    public static void main( String[] args )
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loadded successfully");
            String connString="jdbc:mysql://localhost:3306/adjava";
            String username="root";
            String password="Root123@";
            Connection con=DriverManager.getConnection(connString, username, password);
            System.out.println("connection successfully");
            Statement smt=con.createStatement();
            String createQuery="create table studentj("
            +"id int primary key auto_increment,"
            +"name varchar(30),"
            +"marks int not null)";
            smt.execute(createQuery);
            System.out.println("table created");


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
