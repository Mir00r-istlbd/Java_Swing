/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card.model;

/**
 *
 * @author User
 */
public class InternalFile
{
  private String name;
  private String id;
  private int recCnt;
  private int maxRecSize;
  
  public InternalFile()
  {
      this("","",0,0);
  }
  public InternalFile(String _name,String _id,int _reccnt,int _maxrecsize)
  {
      this.name = _name;
      this.id = _id;
      this.recCnt = _reccnt;
      this.maxRecSize = _maxrecsize;
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

    public int getRecCnt() {
        return recCnt;
    }

    public void setRecCnt(int recCnt) {
        this.recCnt = recCnt;
    }

    public int getMaxRecSize() {
        return maxRecSize;
    }

    public void setMaxRecSize(int maxRecSize) {
        this.maxRecSize = maxRecSize;
    }

  
}
