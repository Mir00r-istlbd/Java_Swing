/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.istl.ws;

/**
 *
 * @author 2016
 */
public class ServiceException extends Exception{
    private String msg;
    
    public ServiceException(String eMsg)
    {
        this.msg=eMsg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
