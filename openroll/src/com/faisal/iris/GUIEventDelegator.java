/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faisal.iris;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class GUIEventDelegator implements ActionListener,ItemListener
{
    private DeviceEventConsumer consumer=null;
    private IrisFeaturesMonocular features = null;
    
    
    
    public GUIEventDelegator(DeviceEventConsumer consumer,IrisFeaturesMonocular features)
    {
        this.consumer = consumer;
        this.features = features;        
    }
    
            
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getActionCommand()!=null && ae.getActionCommand().equalsIgnoreCase("startCapture"))
        {
            final JButton capBtn = (JButton)ae.getSource();
            SwingUtilities.invokeLater(new Runnable()
            {
                public void run()
                {
                    try
                    {
                        
                        features.capturing_process(true, false, true);
                        /////features.finalize_device();                
                    }catch(Exception exc)
                    {
                        ///exc.printStackTrace();
                    }
                }
            });
        }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) 
    {
        if(ie.getSource() instanceof JComboBox)
        {
            JComboBox cmbBox = (JComboBox)ie.getSource();
            if(cmbBox.getName().equalsIgnoreCase("comType"))
            {
                if(features!=null)
                {
                    features.setComStd(cmbBox.getSelectedIndex());
                }
            }else if(cmbBox.getName().equalsIgnoreCase("whichEye"))
            {
                if(features!=null)
                {
                    features.setWhichEye(cmbBox.getSelectedIndex());
                }
            }else if(cmbBox.getName().equalsIgnoreCase("imgFmt"))
            {
                if(features!=null)
                {
                    features.setImageFormat(cmbBox.getSelectedIndex());
                }
            }else if(cmbBox.getName().equalsIgnoreCase("isoImgFmt"))
            {
                if(features!=null)
                {
                    features.setIsoRevision(cmbBox.getSelectedIndex());
                }
            }else if(cmbBox.getName().equalsIgnoreCase("imgKind"))
            {
                if(features!=null)
                {
                    features.setImageKind(cmbBox.getSelectedIndex());
                }
            }            
        }
    }

    
    
}
