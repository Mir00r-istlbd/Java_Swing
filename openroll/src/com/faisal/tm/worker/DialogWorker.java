/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.tm.worker;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DialogWorker extends Thread
{
     private String displayStr = null;
     private JDialog dialog;
     
     public DialogWorker(String inputString) 
     {
       this.displayStr = "Calibrating the fingerprint scanner.....\nPlease do not place finger on scanner";
 
       if (!inputString.isEmpty())
         this.displayStr = inputString;
     }
 
     public void run()
     {
        JOptionPane optionPane = new JOptionPane(this.displayStr, 1, -1, null, new Object[0], null);

        this.dialog = new JDialog();
        this.dialog.setTitle("Message");
        this.dialog.setModal(true);

        this.dialog.setContentPane(optionPane);

        this.dialog.setDefaultCloseOperation(0);
        this.dialog.pack();
        this.dialog.setLocationRelativeTo(null);
        this.dialog.setVisible(true);
     }
}
