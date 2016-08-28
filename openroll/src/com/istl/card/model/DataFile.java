/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card.model;

/**
 *
 * @author User
 */
public class DataFile
{
  private String name;
  private String id;
  private String tag;
  private int size;
  private int security;
  private Field[] fields;

  public DataFile()
  {
      this("","","",0,0,null);
  }
  public DataFile(String _name,String _id,String _tag,int _size,int _security,Field[] _fields)
  {
      this.name = _name;
      this.id = _id;
      this.tag = _tag;
      this.size = _size;
      this.security = _security;
      this.fields = _fields;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSecurity() {
        return security;
    }

    public void setSecurity(int security) {
        this.security = security;
    }

    public Field[] getFields() {
        return fields;
    }

    public void setFields(Field[] fields) {
        this.fields = fields;
    }    
}
