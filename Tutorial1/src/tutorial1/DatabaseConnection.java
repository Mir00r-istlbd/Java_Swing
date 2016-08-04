/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tutorial1;

import java.sql.Connection;
import java.sql.DriverManager;

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
