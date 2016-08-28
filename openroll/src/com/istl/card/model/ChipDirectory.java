/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.card.model;

/**
 *
 * @author User
 */

public class ChipDirectory
{
  private String name;
  private String id;

  public ChipDirectory()
  {
      this("","");
  }
  public ChipDirectory(String _name, String _id)
  {
      this.name = _name;
      this.id = _id;
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
  
  
}