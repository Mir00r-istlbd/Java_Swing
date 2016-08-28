/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card.model;

/**
 *
 * @author User
 */
public class Field
{
  private String name;
  private String tag;
  private int minLength;
  private int maxLength;
  private boolean mandatory;
  
  public Field()
  {
      this("","",0,0,false);
  }  
  public Field(String name,String tag)
  {
      this(name,tag,0,0,false);
  }

  public Field(String name, String tag, int minLength, int maxLength , boolean Mand)
  {
    this.name = name;
    this.tag = tag;
    this.minLength = minLength;
    this.maxLength = maxLength;
    this.mandatory = Mand;
  }    
  public Field(String name, String tag, int minLength, int maxLength)
  {
    this(name,tag,minLength,maxLength,false);
  }
  public Field(String name, String tag, int length)      
  {
      this(name, tag, length, length,false);
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }
  
  
}
