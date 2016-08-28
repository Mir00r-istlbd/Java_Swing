/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.iris;

import com.iritech.iddk.standard.IddkImage;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface DeviceEventConsumer 
{
    void setImage(int eyeIdx,IddkImage image);
    void setISOImage(int eyeIdx,byte[] isoData,int len);
    void setTemplate(int eyeIdx,byte[] tpl,int len);    
    void updateLabel(String str);
    void deviceDetected(ArrayList<String> devices);
    void deviceNotPresent();
    void deviceConfigDetected();
}
