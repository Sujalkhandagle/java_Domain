package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

import java.sql.CallableStatement;

public class Callbalstatement {
    public static void main(String[] args) {
          try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loadded successfully");
            String connString="jdbc:mysql://localhost:3306/adjava";
            String username="root";
            String password="Root123@";
            Connection con=DriverManager.getConnection(connString, username, password);
            CallableStatement csmt=con.prepareCall("{?=CALL addition(?,?)}");

            int res,n1,n2;
            n1=20;
            n2=20;
            csmt.registerOutParameter(1,Types.INTEGER);
            csmt.setInt(2,n1);
            csmt.setInt(3,n2);
            csmt.execute();
            res=csmt.getInt(1);
            System.out.println("addition of"+n1+" and "+n2+" is :="+res);
            con.close();

          }
          catch(Exception e){
            System.out.println(e);
          }
    }
    
}
