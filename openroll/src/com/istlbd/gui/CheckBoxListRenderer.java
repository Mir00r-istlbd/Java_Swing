/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.gui;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Rezwan
 */
public class CheckBoxListRenderer extends JCheckBox
        implements ListCellRenderer {

    public Component getListCellRendererComponent(JList comp, Object value,
            int index, boolean isSelected, boolean hasFocus) {
        setEnabled(comp.isEnabled());
        setSelected(((CheckListItem) value).isSelected());
        setFont(comp.getFont());
        setText(value.toString());

        if (isSelected) {
            setBackground(comp.getSelectionBackground());
            setForeground(comp.getSelectionForeground());
        } else {
            setBackground(comp.getBackground());
            setForeground(comp.getForeground());
        }

        return this;
    }
}
