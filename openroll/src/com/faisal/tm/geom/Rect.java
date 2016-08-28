/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm.geom;

/**
 *
 * @author User
 */
public class Rect extends Point
{
    private int w;
    private int h;
    
    public Rect()
    {
        super(0,0);
        this.w = 0;
        this.h = 0;
    }
    public Rect(int x, int y , int w, int h)
    {
        super(x,y);
        this.w = w;
        this.h = h;
    }

    public int getW() 
    {
        return w;
    }

    public void setW(int w) 
    {
        this.w = w;
    }

    public int getH() 
    {
        return h;
    }

    public void setH(int h) 
    {
        this.h = h;
    }
        
}
