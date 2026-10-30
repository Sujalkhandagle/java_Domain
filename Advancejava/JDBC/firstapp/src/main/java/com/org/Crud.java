package com.org;
import java.sql.*;
import java.util.Scanner;

public class Crud {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/adjava",
                "root",
                "Root123@"
            );

            System.out.println("Database Connected Successfully");

            while (true) {

                System.out.println("\n----- CRUD OPERATIONS -----");
                System.out.println("1. Insert Student");
                System.out.println("2. Display Student");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");

                System.out.print("Enter Your Choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    // CREATE
                    case 1:

                        System.out.print("Enter Name: ");
                        String name = sc.next();

                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt();

                        PreparedStatement ps1 = con.prepareStatement(
                            "INSERT INTO student(name, marks) VALUES(?, ?)"
                        );

                        ps1.setString(1, name);
                        ps1.setInt(2, marks);

                        ps1.executeUpdate();

                        System.out.println("Student Inserted Successfully");
                        break;

                    // READ
                    case 2:

                        Statement st = con.createStatement();

                        ResultSet rs = st.executeQuery(
                            "SELECT * FROM student"
                        );

                        while (rs.next()) {

                            System.out.println(
                                rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("marks")
                            );
                        }

                        break;

                    // UPDATE
                    case 3:

                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();

                        System.out.print("Enter New Marks: ");
                        int newMarks = sc.nextInt();

                        PreparedStatement ps2 = con.prepareStatement(
                            "UPDATE student SET marks=? WHERE id=?"
                        );

                        ps2.setInt(1, newMarks);
                        ps2.setInt(2, id);

                        int result = ps2.executeUpdate();

                        if (result > 0) {
                            System.out.println("Student Updated Successfully");
                        } else {
                            System.out.println("Student ID Not Found");
                        }

                        break;

                    // DELETE
                    case 4:

                        System.out.print("Enter Student ID: ");
                        int deleteId = sc.nextInt();

                        PreparedStatement ps3 = con.prepareStatement(
                            "DELETE FROM student WHERE id=?"
                        );

                        ps3.setInt(1, deleteId);

                        int deleted = ps3.executeUpdate();

                        if (deleted > 0) {
                            System.out.println("Student Deleted Successfully");
                        } else {
                            System.out.println("Student ID Not Found");
                        }

                        break;

                    // EXIT
                    case 5:

                        con.close();
                        sc.close();

                        System.out.println("Program Exited");
                        return;

                    default:
                        System.out.println("Invalid Choice");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}