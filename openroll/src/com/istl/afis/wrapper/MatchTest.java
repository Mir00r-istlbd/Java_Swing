/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.afis.wrapper;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 *
 * @author User
 */
public class MatchTest 
{
    public static void main(String args[])
    {
        Tafis tafis = new Tafis();
        try
        {
            byte[] isoData1 = null;
            byte[] isoData2 = null;
            DataInputStream dis = new DataInputStream(new FileInputStream("D:/download/FingerJetFXOSE-master/samples/templates-iso/a001_03p.ist"));
            
            isoData1 = new byte[dis.available()];
            dis.readFully(isoData1);
            dis.close();
            
            dis = new DataInputStream(new FileInputStream("D:/download/FingerJetFXOSE-master/samples/templates-iso/a004_05p.ist"));
            isoData2 = new byte[dis.available()];
            dis.readFully(isoData2);
            dis.close();
            
            tafis.compareISOTemplate(isoData1, isoData1.length, isoData2, isoData2.length);
            
        }catch(Throwable t)
        {
        }
    }
}
