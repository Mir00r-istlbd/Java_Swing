/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentapp;

/**
 *
 * @author 2016
 */
public class Student {
    private String name;
    private int roll;
    private String className;

    public Student() {
    }

    public Student(String name, int roll, String className) {
        this.name = name;
        this.roll = roll;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }    
}
