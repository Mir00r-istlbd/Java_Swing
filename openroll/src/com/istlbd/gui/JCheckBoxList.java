/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.gui;

/**
 *
 * @author Maverick
 */
import com.istlbd.utils.Lookup;
import java.awt.Component;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.event.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class JCheckBoxList extends JList<JCheckBox> {
  protected static Border noFocusBorder = new EmptyBorder(1, 1, 1, 1);

  public JCheckBoxList() {
      Lookup.checkedOperationList = new ArrayList<String>();
    setCellRenderer(new CellRenderer());
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        int index = locationToIndex(e.getPoint());
        if (index != -1) {
          JCheckBox checkbox = (JCheckBox) getModel().getElementAt(index);
          /*if(checkbox.isSelected())
            
          else*/
              
          boolean checkFlag = !checkbox.isSelected();
          
          checkbox.setSelected(!checkbox.isSelected());
          if(checkFlag)
              Lookup.checkedOperationList.add(checkbox.getSelectedObjects()[0].toString());
          else {
              Lookup.checkedOperationList.remove(checkbox.getText());
          }
          //if(checkbox.isSelected())
            //main.checkedOperationList.add(checkbox.getSelectedObjects()[0].toString());
          //checkbox.getSelectedObjects();
          repaint();
        }
      }
    });
    setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
  }

  public JCheckBoxList(javax.swing.ListModel<javax.swing.JCheckBox> model){
    this();
    setModel(model);
  }

  protected class CellRenderer implements ListCellRenderer<JCheckBox> {
    public Component getListCellRendererComponent(JList<? extends JCheckBox> list, JCheckBox value, int index,boolean isSelected, boolean cellHasFocus) {
      JCheckBox checkbox = value;
      //Drawing checkbox, change the appearance here
//      checkbox.setBackground(isSelected ? getSelectionBackground(): getBackground());
//      checkbox.setForeground(isSelected ? getSelectionForeground(): getForeground());
      checkbox.setEnabled(isEnabled());
//      checkbox.setFont(getFont());
//      checkbox.setFocusPainted(false);
//      checkbox.setBorderPainted(true);
//      checkbox.setBorder(isSelected ? UIManager.getBorder("List.focusCellHighlightBorder") : noFocusBorder);
      return checkbox;
    }
  }
}