/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.gui;


/**
 *
 * @author Ataur Rahman
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;


class RoleButtonEditor extends DefaultCellEditor{

    private String label;
    protected JButton button;
    private String details_id;
    private boolean isPushed;
    
    public RoleButtonEditor(JCheckBox chk) {
        super(chk);
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
            }
        });
    }

    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        
        if (isSelected) {
            button.setForeground(table.getSelectionForeground());
            button.setBackground(table.getSelectionBackground());
        } else {
            button.setForeground(table.getForeground());
            button.setBackground(table.getBackground());
        }
        
//        label = (value == null) ? "" : value.toString();
        
//        System.out.println("label ="+value);

//        button.setText(label);

        isPushed = false;
        
        this.details_id = (String) table.getModel().getValueAt(row,4);
        
        return button;

    }

    public Object getCellEditorValue() {
        RoleSearchPanel.viewDetails(details_id);

        isPushed = false;
        
        return this;
        
    }
    
    @Override
    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }

    @Override
    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }
}