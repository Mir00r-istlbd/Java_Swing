/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card.terminal;

/**
 *
 * @author User
 */
public interface ITokenManager 
{
    void init() throws Exception;
    void getReaderList() throws Exception;
    void selectToken(int idx) throws Exception;
    void readBiographicData() throws Exception;
    void readDemographicData() throws Exception;
    void readPhoto() throws Exception;
    void readExtendedBiographicData() throws Exception;
    void readExtendedDemographicData() throws Exception;
    void readRelationshipData() throws Exception;
    void readSubscriptionData() throws Exception;
    void readFingerprintData() throws Exception;
    
}
