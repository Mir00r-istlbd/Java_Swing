/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card.pdu;

/**
 *
 * @author User
 */
public class APDUResponse 
{
    private byte[] rdata;
    private int sw;
    private int sw1;
    private int sw2;

    public APDUResponse(byte[] rdata,int sw,int sw1,int sw2)
    {
        this.rdata = rdata;
        this.sw = sw;
        this.sw1=sw1;
        this.sw2=sw2;
    }
    
    public APDUResponse()
    {
        this(null,0,0,0);
    }
        public byte[] getRdata() {
        return rdata;
    }

    public void setRdata(byte[] rdata) {
        this.rdata = rdata;
    }

    public int getSw() {
        return sw;
    }

    public void setSw(int sw) {
        this.sw = sw;
    }

    public int getSw1() {
        return sw1;
    }

    public void setSw1(int sw1) {
        this.sw1 = sw1;
    }

    public int getSw2() {
        return sw2;
    }

    public void setSw2(int sw2) {
        this.sw2 = sw2;
    }
    
    
}
