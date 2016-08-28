/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.utils;

/**
 *
 * @author User
 */
public class Utils {
    
    public boolean isEmptyText(String text) throws Exception{
    
        if(text != null && text.length() > 0){
            return false;
        }
        return true;
    }
    
}
