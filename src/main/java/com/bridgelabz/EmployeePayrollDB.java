package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeePayrollDB {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://127.0.0.1:3306/payroll?useSSL=false";
        String username = "root";
        String password = "MyN3wP4ssw0rd";
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("cannot find the driver in the classpath!", e);
        }
        try {
            System.out.println("connecting to database:" + jdbcURL);
            con = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("connection done successful!!" + con);
        } catch (Exception e) {
            //  e.printStackTrace();
        }
    }

}
