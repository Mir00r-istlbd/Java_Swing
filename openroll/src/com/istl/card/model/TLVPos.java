/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card.model;

/**
 *
 * @author User
 */
public class TLVPos
{
  private int  valueStarts;
  private int valueLen;

  public TLVPos()
  {
      this(0,0);
  }
  
  public TLVPos( int _start , int _len )
  {
      this.valueStarts=_start;
      this.valueLen = _len;
  }

    public int getValueStarts() {
        return valueStarts;
    }

    public void setValueStarts(int valueStarts) {
        this.valueStarts = valueStarts;
    }

    public int getValueLen() {
        return valueLen;
    }

    public void setValueLen(int valueLen) {
        this.valueLen = valueLen;
    }
  
  
}