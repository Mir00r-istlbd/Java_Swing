/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.interfaces;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface IEnrollment {
    
    void prepareApplicationData() throws Exception;
    boolean isDataValid() throws Exception;
    void dataReady() throws Exception;
    void dataError()throws Exception;
    
}
