/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardlayoutdemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 2016
 */
public class DataBaseHelper {
    
    public Connection getConnection() throws Exception{
        Connection conn;
         try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/student_schema";
            String username = "root";
            String password = "";
            Class.forName(driver);

             conn = DriverManager.getConnection(url, username, password);
             
             System.out.println("Connected");
            
            return conn;
        
    }catch(Exception e){
        System.out.println("Not Connected");
        
        return null;
    }
         
    }
    
}
