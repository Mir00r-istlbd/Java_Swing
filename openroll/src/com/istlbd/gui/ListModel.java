/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.gui;

/**
 *
 * @author Maverick
 */
import business.entity.BioOperations;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import com.istlbd.gui.JCheckBoxList;
import com.istlbd.utils.Lookup;

public class ListModel extends JPanel {

  JCheckBoxList list;

  DefaultListModel<JCheckBox> model;

  int counter = 15;
  public BioOperations bioOperation;
  public ListModel() {
    setLayout(new BorderLayout());
    model = new DefaultListModel<JCheckBox>();
    list = new JCheckBoxList(model);
    JScrollPane pane = new JScrollPane(list);
    JButton addButton = new JButton("Add Element");
    JButton removeButton = new JButton("Remove Element");
    
    if(Lookup.OPERATION_LIST != null && Lookup.OPERATION_LIST.size() > 0){
    
    for (int i = 0; i < Lookup.OPERATION_LIST.size();  i++){
        
      model.addElement(new JCheckBox(Lookup.OPERATION_LIST.get(i).getOperationName()));
      
    }

    }
    addButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        model.addElement(new JCheckBox("Checkbox"+counter));
        counter++;
      }
    });
    removeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (model.getSize() > 0)
          model.removeElementAt(0);
      }
    });

    add(pane, BorderLayout.NORTH);
//    add(addButton, BorderLayout.WEST);
//    add(removeButton, BorderLayout.EAST);
  }

  public static void main(String s[]) {
    JFrame frame = new JFrame("List Model Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new ListModel());
    frame.setSize(260, 200);
    frame.setVisible(true);
  }
}