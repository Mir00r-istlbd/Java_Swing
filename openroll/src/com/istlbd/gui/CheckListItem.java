/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.gui;

/**
 *
 * @author Rezwan
 */
public class CheckListItem
  {
    private Object item;
    private boolean selected;

    public CheckListItem(Object item)
    {
      this.item = item;
    }

    @SuppressWarnings("unused")
    public Object getItem()
    {
      return item;
    }

    public boolean isSelected()
    {
      return selected;
    }

    public void setSelected(boolean isSelected)
    {
      this.selected = isSelected;
    }

    @Override
    public String toString()
    {
      return item.toString();
    }
  }
