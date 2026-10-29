package com.org;
import java.sql.*;


public class Storedprocedure {
   public static void main( String[] args )
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loadded successfully");
            String connString="jdbc:mysql://localhost:3306/adjava";
            String username="root";
            String password="Root123@";
            Connection con=DriverManager.getConnection(connString, username, password);

            CallableStatement cs=con.prepareCall("{call getstudentj(?)}");
            cs.setInt(1,1);
            cs.execute();
            cs.setInt(1, 1);

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Marks: " + rs.getInt("marks"));
            }

            rs.close();
            cs.close();
            con.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
