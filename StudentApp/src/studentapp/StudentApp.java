/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

import com.student.dao.DatabaseConnection;

/**
 *
 * @author 2016
 */
public class StudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        AddStudent add = new AddStudent();
        SearchStudent searchStudent = new SearchStudent();
        DatabaseConnection databaseConnection = new DatabaseConnection();
        
        menu.setVisible(true);
        //add.setVisible(true);
        //searchStudent.setVisible(true);
        
        //databaseConnection.getConnection();
    }   
}
