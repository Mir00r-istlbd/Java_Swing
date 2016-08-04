/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import studentapp.AddStudent;
import studentapp.Student;

/**
 *
 * @author 2016
 */
public class DatabaseConnection {

    public static void main(String[] args) throws Exception {
        getConnection();
    }

    public static Connection getConnection() throws Exception {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/student_schema";
            String username = "root";
            String password = "";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected");
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
}
