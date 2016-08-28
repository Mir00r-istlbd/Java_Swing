/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author User
 */
public interface ReaderListener 
{
    void refreshReaderList(List<String> readers);
    void cardSelected(String card_serial);
    void biographicDataReady(HashMap<String,Object> biographic);
    void demographicDataReady(HashMap<String,Object> biographic);
    void photoDataReady(HashMap<String,Object> photo);
    void extendedBiographicDataReady(HashMap<String,Object> extendedBiographic);
    void extendedDemographicDataReady(HashMap<String,Object> extendedDemographic);
    void relationshipDataReady(HashMap<String,Object> relationship);
    void subscriptionDataReady(HashMap<String,Object> subscription);
    void fingerprintDataReady(HashMap<String,Object> fingerprint);
    void irisDataReady(HashMap<String,Object> iris);
}
