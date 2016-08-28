/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card.pdu;

/**
 *
 * @author User
 */
public class APDURequest 
{
    private byte bCLA;
    private byte bINS;
    private byte bP1;
    private byte bP2;
    private byte bLc;
    private int bLe;
    private byte[] data;
    
    
    
    public APDURequest(byte CLA,byte INS,byte P1,byte P2, byte LC, int LE,byte[] data)            
    {
        this.bCLA = CLA;
        this.bINS = INS;
        this.bP1 = P1;
        this.bP2 = P2;
        this.bLc = LC;
        this.bLe = LE;
        this.data = data;        
    }
    public APDURequest(byte CLA,byte INS,byte P1,byte P2, byte LC, int LE)
    {
        this(CLA,INS,P1,P2,LC,LE,(byte[])null);
    }
    public APDURequest()
    {
        this((byte)0,(byte)0,(byte)0,(byte)0,(byte)0,0,(byte[])null);
    }
    public byte getbCLA() {
        return bCLA;
    }

    public void setbCLA(byte bCLA) {
        this.bCLA = bCLA;
    }

    public byte getbINS() {
        return bINS;
    }

    public void setbINS(byte bINS) {
        this.bINS = bINS;
    }

    public byte getbP1() {
        return bP1;
    }

    public void setbP1(byte bP1) {
        this.bP1 = bP1;
    }

    public byte getbP2() {
        return bP2;
    }

    public void setbP2(byte bP2) {
        this.bP2 = bP2;
    }

    public byte getbLc() {
        return bLc;
    }

    public void setbLc(byte bLc) {
        this.bLc = bLc;
    }

    public int getbLe() {
        return bLe;
    }

    public void setbLe(int bLe) {
        this.bLe = bLe;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }       
        
    /*public byte[] prepareData()
    {        
        byte[] raw_pdu = null;
        
        int apduLength = 4;
        
        int num1 = 0;
      
        if ((int)bLc > 0)
        {
            apduLength += (1 + bLc);
        }
        
        if (bLe > 0)
        {
            apduLength = apduLength+1;
        }
        
        raw_pdu = new byte[apduLength];
                
        int index1 = num1;
        int num2 = 1;
        int num3 = index1 + num2;
        int num4 = (int) bCLA;
        raw_pdu[index1] = (byte) num4;
                
        int index2 = num3;
        int num5 = 1;
        int num6 = index2 + num5;
        int num7 = (int) bINS;
        raw_pdu[index2] = (byte) num7;
                
        int index3 = num6;
        int num8 = 1;
        int num9 = index3 + num8;
        int num10 = (int) bP1;
        raw_pdu[index3] = (byte) num10;
                
        int index4 = num9;
        int num11 = 1;
        int num12 = index4 + num11;
        int num13 = (int) bP2;
        raw_pdu[index4] = (byte) num13;
        
        if ((int) bLc > 0)
        {            
            int index5 = num12;
            int num14 = 1;
            int destinationIndex = index5 + num14;
            int num15 = (int) bLc;
            raw_pdu[index5] = (byte) num15;            
            System.arraycopy(data, 0, raw_pdu, destinationIndex, (int) bLc);            
            num12 = destinationIndex + (int) bLc;
        }
        
        if (bLe > 0)
        {            
            int index5 = num12;
            int num14 = 1;
            int num15 = index5 + num14;
            int num16 = (int) (byte) (bLe % 256);
            raw_pdu[index5] = (byte) num16;
        }                
       
        return raw_pdu;
    }*/
    
    public byte[] prepareData()
    {        
        byte[] raw_pdu = null;        
        int apduLength = 4;
        int idx = 0;
                      
        if ((int)bLc > 0)
        {            
            apduLength += 1;
            apduLength += bLc;
        }
        
        if (bLe > 0)
        {
            apduLength = apduLength+1;
        }
        
        raw_pdu = new byte[apduLength];
                                        
        raw_pdu[idx] = (byte)(bCLA&0xFF);
        idx++;
                                
        raw_pdu[idx] = (byte)(bINS&0xFF);
        idx++;
                                
        raw_pdu[idx] = (byte)(bP1&0xFF);
        idx++;                                
        
        raw_pdu[idx] = (byte)(bP2&0xFF);
        idx++;
        
        if ((int) bLc > 0)
        {                                                            
            raw_pdu[idx] = (byte)(bLc&0xFF);            
            idx++;            
            
            System.arraycopy(data, 0, raw_pdu, idx, (int) bLc);                                                
            idx+=(int)bLc;
            
        }
        
        if (bLe > 0)
        {                                    
            raw_pdu[idx] = (byte) (bLe % 256);
        }                
       
        return raw_pdu;
    }
}
