package com.org;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adjava","root","Root123@");

            Statement smt=con.createStatement();
            String name;
            int marks;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the name :=");
            name=sc.nextLine();
            
           
            System.out.print("Enter marks: ");
            int mark = sc.nextInt();

         smt.executeUpdate(
    "INSERT INTO studentj(name, marks) VALUES('" + name + "'," + mark + ")"
);
            // con.commit();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
