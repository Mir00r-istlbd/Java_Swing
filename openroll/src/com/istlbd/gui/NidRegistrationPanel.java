/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.gui;

import ImageProcessing.ImageAndFileProcessing;
import business.bean.PersonManagerBean;
import business.bean.Utils;
import business.entity.BioPerson;
import com.istl.card.ReaderListener;
import com.istl.card.terminal.ITokenManager;
import com.istl.card.terminal.TokenManager;
import static com.istlbd.gui.OffLineApplicationNidPanel.cal_date_of_birth;
import com.istlbd.utils.Defs;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ws.response.GetPersonSummaryResponse;

/**
 *
 * @author User
 */
public class NidRegistrationPanel extends javax.swing.JPanel implements ReaderListener {

    private ITokenManager tokenManager = null;
    private boolean isCardReaderConnected = false;
    private boolean isCardConnected = false;
    private HashMap<String, String> dataMap = null;
    private String dob = "";
    private String oldPin = "";
    private String newPin = "";

    /**
     * Creates new form NidRegistrationPanel
     */
    public NidRegistrationPanel() {

        initComponents();
        tokenManager = new TokenManager(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nid_reg_content_panel = new javax.swing.JPanel();
        lbl_nid_reg_status = new javax.swing.JLabel();
        inp_reader_status = new javax.swing.JTextField();
        cmb_reader_type = new javax.swing.JComboBox();
        btn_read_data = new javax.swing.JButton();
        lbl_reader_model = new javax.swing.JLabel();
        lbl_reader_status = new javax.swing.JLabel();
        btn_nidreg_refresh = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1350, 650));
        setMinimumSize(new java.awt.Dimension(1350, 650));
        setName(""); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1350, 650));
        setLayout(null);

        nid_reg_content_panel.setBackground(new java.awt.Color(204, 204, 204));
        nid_reg_content_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nid_reg_content_panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                nid_reg_content_panelComponentShown(evt);
            }
        });
        nid_reg_content_panel.setLayout(null);

        lbl_nid_reg_status.setBackground(new java.awt.Color(204, 204, 204));
        lbl_nid_reg_status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_nid_reg_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nid_reg_content_panel.add(lbl_nid_reg_status);
        lbl_nid_reg_status.setBounds(100, 30, 350, 80);

        inp_reader_status.setEditable(false);
        inp_reader_status.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inp_reader_status.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inp_reader_status.setMaximumSize(new java.awt.Dimension(200, 30));
        inp_reader_status.setMinimumSize(new java.awt.Dimension(200, 30));
        inp_reader_status.setPreferredSize(new java.awt.Dimension(200, 30));
        nid_reg_content_panel.add(inp_reader_status);
        inp_reader_status.setBounds(250, 120, 200, 30);

        cmb_reader_type.setLightWeightPopupEnabled(false);
        cmb_reader_type.setMaximumSize(new java.awt.Dimension(200, 30));
        cmb_reader_type.setMinimumSize(new java.awt.Dimension(200, 30));
        cmb_reader_type.setPreferredSize(new java.awt.Dimension(200, 30));
        nid_reg_content_panel.add(cmb_reader_type);
        cmb_reader_type.setBounds(250, 160, 200, 30);

        btn_read_data.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_read_data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_img_proceed_20.png"))); // NOI18N
        btn_read_data.setText("PROCEED");
        btn_read_data.setIconTextGap(15);
        btn_read_data.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btn_read_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_read_dataActionPerformed(evt);
            }
        });
        nid_reg_content_panel.add(btn_read_data);
        btn_read_data.setBounds(250, 250, 200, 30);

        lbl_reader_model.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_reader_model.setText("Reader Type");
        lbl_reader_model.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        nid_reg_content_panel.add(lbl_reader_model);
        lbl_reader_model.setBounds(100, 160, 150, 30);

        lbl_reader_status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_reader_status.setText("Reader Status");
        lbl_reader_status.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        nid_reg_content_panel.add(lbl_reader_status);
        lbl_reader_status.setBounds(100, 120, 150, 30);

        btn_nidreg_refresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_nidreg_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_img_refresh_20.png"))); // NOI18N
        btn_nidreg_refresh.setText("REFRESH");
        btn_nidreg_refresh.setIconTextGap(15);
        btn_nidreg_refresh.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btn_nidreg_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nidreg_refreshActionPerformed(evt);
            }
        });
        nid_reg_content_panel.add(btn_nidreg_refresh);
        btn_nidreg_refresh.setBounds(250, 210, 200, 30);

        add(nid_reg_content_panel);
        nid_reg_content_panel.setBounds(410, 180, 560, 310);
    }// </editor-fold>//GEN-END:initComponents

    private void nid_reg_content_panelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_nid_reg_content_panelComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_nid_reg_content_panelComponentShown

    private void btn_nidreg_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nidreg_refreshActionPerformed

        scanCardReaderDevice();

    }//GEN-LAST:event_btn_nidreg_refreshActionPerformed

    private void btn_read_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_read_dataActionPerformed

        try {

            dataMap = new HashMap<String, String>();

            tokenManager.selectToken(cmb_reader_type.getSelectedIndex());
            tokenManager.readBiographicData();
            tokenManager.readExtendedBiographicData();
            tokenManager.readDemographicData();
            tokenManager.readRelationshipData();
            tokenManager.readSubscriptionData();
            tokenManager.readPhoto();
            
            Iterator i = dataMap.entrySet().iterator();

//            while (i.hasNext()) {
//                System.out.println(i.next().toString());
//            }
            
            oldPin = (new ArrayList<String>(dataMap.values())).get(11);
            dob=(new ArrayList<String>(dataMap.values())).get(14);
            dob=formatSmartCardDateStr(dob);
            System.out.println(oldPin+ " DOB:"+dob);
            
//            String write_path = "F:/Project_misc/data.txt";
//            writeDataToFile(write_path);

            //ContainerJFrame.container.applicationNidPanel1.viewCardData(dataMap);
        String checkNID = null;
             String checkDOB = null;
             String bioPersonId = null;
        
            
       

             //nid_num = inp_nid_number.getText();
             //dob = cal_date_of_birth.getDate() != null ? Defs.SDF.format(cal_date_of_birth.getDate()) : "";

             //dob = dob.replaceAll("/", "-");
             //ystem.out.println("NID - > " + nid_num + " " + "DOB - > " + dob);

             PersonManagerBean pmb = new PersonManagerBean();
             BioPerson bioPersonBO = new BioPerson();

             bioPersonBO.setPinNo(oldPin);
             bioPersonBO.setDateOfBirth(dob);
        
             System.out.println("Pin: "+bioPersonBO.getPinNo()+"\nDOB: "+bioPersonBO.getDateOfBirth());


             GetPersonSummaryResponse resp = pmb.getAdvancedSearchPersonInfo(0L, 100L, bioPersonBO);
             System.out.println("GetPersonSummaryResponse Status -> " + resp.isOperationStatus());

             List< BioPerson> biolist = resp.getPersonList();

             for (BioPerson bio : biolist) {
             bioPersonId = bio.getId().toString();
             checkNID = bio.getPinNo();
             checkDOB = bio.getDateOfBirth();
             //bioMetricId = bio.getBiometric().toString();
             //System.out.println(bioMetricId);
             }

             if (resp != null && resp.isOperationStatus() && !oldPin.equals("") && !dob.equals("")) {

             if (oldPin.equals(checkNID) && dob.equals(checkDOB)) {

             System.out.println("Bio ID - > " + bioPersonId);
             //setBiometricDetails(bioPersonId);

             ContainerJFrame.MenuBarVar.setVisible(true);
             ContainerJFrame.offline.setVisible(false);
             ContainerJFrame.showBiomatricPanel(bioPersonId);
              //ContainerJFrame.showBiomatricPanel(bioPersonId,checkDOB,checkNID);
             System.out.println("OK LOGIN SUCCCEESS------------");
             //ContainerJFrame.container.dummyNidPanel1.viewCardData(dataMap);
             } else {
             Utils.showErrorMsg("NID or Date of Birth Invalid ");
             }
             } else {
             Utils.showErrorMsg("No user register with this NID number or Date of Birth");
             } 

            //ContainerJFrame.container.dummyNidPanel1.viewCardData(dataMap);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(NidRegistrationPanel.this, ex, "Card Read Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_read_dataActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_nidreg_refresh;
    private javax.swing.JButton btn_read_data;
    private javax.swing.JComboBox cmb_reader_type;
    private javax.swing.JTextField inp_reader_status;
    private javax.swing.JLabel lbl_nid_reg_status;
    private javax.swing.JLabel lbl_reader_model;
    private javax.swing.JLabel lbl_reader_status;
    private javax.swing.JPanel nid_reg_content_panel;
    // End of variables declaration//GEN-END:variables

        private static String formatSmartCardDateStr(String dateValue) {

        try {

            if (dateValue != null && dateValue.length() == 8) {

                String day = dateValue.substring(0, 2);
                String month = dateValue.substring(2, 4);
                String year = dateValue.substring(4, 8);

                String formatted_date = year + "/" + month + "/" + day;

                //Date date = new SimpleDateFormat("dd/MM/yyyy").parse(formatted_date);
                return formatted_date;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;

    }
    
    public void scanCardReaderDevice() {
        isCardReaderConnected = detectDevice();
        if (isCardReaderConnected) {
            isCardConnected = detectCard();
        }

        updateNidRegUI(isCardReaderConnected, isCardConnected);

    }

    private void updateNidRegUI(boolean isDeviceConnected, boolean isCardConnected) {

        if (!isDeviceConnected) {
            btn_read_data.setEnabled(false);
            cmb_reader_type.removeAllItems();
            cmb_reader_type.setEnabled(false);
            lbl_nid_reg_status.setText("Please connect a SmartCard Reader Device");
            inp_reader_status.setText("DISCONNECTED");
            inp_reader_status.setBackground(Color.RED);
        } else if (isDeviceConnected && !isCardConnected) {
            inp_reader_status.setBackground(Color.GREEN);
            inp_reader_status.setText("CONNECTED");
            if (!cmb_reader_type.isEnabled()) {
                cmb_reader_type.setEnabled(true);
            }
            lbl_nid_reg_status.setText("Please insert SmartCard");
            btn_read_data.setEnabled(false);
        } else {
            inp_reader_status.setBackground(Color.GREEN);
            inp_reader_status.setText("CONNECTED");
            if (!cmb_reader_type.isEnabled()) {
                cmb_reader_type.setEnabled(true);
            }
            lbl_nid_reg_status.setText("Press 'Proceed' to continue");
            btn_read_data.setEnabled(true);
        }

    }

    private boolean detectDevice() {

        try {

            this.tokenManager.init();
            this.tokenManager.getReaderList();
//            this.tokenManager.selectToken(cmb_reader_type.getSelectedIndex());
            return true;

        } catch (Exception exc) {
//            JOptionPane.showMessageDialog(this, exc, "Terminal Initialization Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    private boolean detectCard() {

        try {
            this.tokenManager.selectToken(cmb_reader_type.getSelectedIndex());
            return true;
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        return false;
    }

    @Override
    public void refreshReaderList(List<String> readers) {

        cmb_reader_type.removeAllItems();
        for (String reader : readers) {
            cmb_reader_type.addItem(reader);
        }
    }

    @Override
    public void cardSelected(String card_serial) {
//        this.card_serial.setText(card_serial);
    }

    @Override
    public void biographicDataReady(HashMap<String, Object> biographic) {

        Set<String> biographicKeys = biographic.keySet();

        for (String _key : biographicKeys) {
            if (_key.equalsIgnoreCase("NameEnglish")) {
                dataMap.put(Defs.SC_NAME_ENG, (String) biographic.get(_key));
            } else if (_key.equalsIgnoreCase("NameBangla")) {
                dataMap.put(Defs.SC_NAME_BNG, (String) biographic.get(_key));
            } else if (_key.equalsIgnoreCase("Father")) {
                dataMap.put(Defs.SC_NAME_FATHER, (String) biographic.get(_key));
            } else if (_key.equalsIgnoreCase("Mother")) {
                dataMap.put(Defs.SC_NAME_MOTHER, (String) biographic.get(_key));
            } else if (_key.equalsIgnoreCase("BirthDate")) {
                dataMap.put(Defs.SC_DOB, (String) biographic.get(_key));
            } else if (_key.equalsIgnoreCase("VoterAdd")) {
                dataMap.put(Defs.SC_VOTER_ADDRESS, (String) biographic.get(_key));
            } else if (_key.equalsIgnoreCase("IssueDate")) {
                dataMap.put(Defs.SC_ISSUE_DATE, (String) biographic.get(_key));
            } else if (_key.equalsIgnoreCase("NewNid")) {
                dataMap.put(Defs.SC_NID_NEW, (String) biographic.get(_key));
            } else if (_key.equalsIgnoreCase("OldNid")) {
                dataMap.put(Defs.SC_NID_OLD, (String) biographic.get(_key));
            } else if (_key.equalsIgnoreCase("Nationality")) {
                dataMap.put(Defs.SC_NATIONALITY, (String) biographic.get(_key));
            } else if (_key.equalsIgnoreCase("Birthplace")) {
                dataMap.put(Defs.SC_BIRTH_PLACE, (String) biographic.get(_key));
            } else if (_key.equalsIgnoreCase("BloodGroup")) {
                dataMap.put(Defs.SC_BLOOD_GRP, (String) biographic.get(_key));
            } else if (_key.equalsIgnoreCase("Gender")) {
                dataMap.put(Defs.SC_GENDER, (String) biographic.get(_key));
            } else if (_key.equalsIgnoreCase("VoterAt")) {
                dataMap.put(Defs.SC_VOTER_AT, (String) biographic.get(_key));
            }

        }

    }

    @Override
    public void demographicDataReady(HashMap<String, Object> demographic) {

        Set<String> extBiographicKeys = demographic.keySet();

        for (String _key : extBiographicKeys) {
            if (_key.equalsIgnoreCase("OtherAdd")) {
                dataMap.put(Defs.SC_OTHER_ADDRESS, (String) demographic.get(_key));
            }
        }

    }

    @Override
    public void photoDataReady(HashMap<String, Object> photo) {

        if (photo != null) {
            Object imgObj = photo.get("photo");
            if ((imgObj != null) && (imgObj instanceof BufferedImage)) {

                BufferedImage bimg = (BufferedImage) imgObj;

//                ApplicationPanel.lbl_photo.setText(null);
//                ApplicationPanel.lbl_photo.setIcon(new ImageIcon(bimg.getScaledInstance(ApplicationPanel.lbl_photo.getWidth(), ApplicationPanel.lbl_photo.getHeight(), java.awt.Image.SCALE_DEFAULT)));
//                
//                ApplicationPanel.setSmart_card_photo(ImageAndFileProcessing.BufferedImageToByteArray(bimg,"JPG"));
                ApplicationNidPanel.lbl_photo.setText(null);
                ApplicationNidPanel.lbl_photo.setIcon(new ImageIcon(bimg.getScaledInstance(ApplicationNidPanel.lbl_photo.getWidth(), ApplicationNidPanel.lbl_photo.getHeight(), java.awt.Image.SCALE_DEFAULT)));

                ApplicationNidPanel.setSmart_card_photo(ImageAndFileProcessing.BufferedImageToByteArray(bimg, "JPG"));

//                photoCanvas.setPhotoImg((BufferedImage)imgObj);
//                photoCanvas.repaint();
                ///photo_panel.repaint();
                ///Graphics g = photoCanvas.getGraphics();                
                ///g.drawImage((BufferedImage)imgObj, 0, 0, photoCanvas.getWidth(), photoCanvas.getHeight(), null);                
            }
        }

    }

    @Override
    public void extendedBiographicDataReady(HashMap<String, Object> extendedBiographic) {

        Set<String> extBiographicKeys = extendedBiographic.keySet();

        for (String _key : extBiographicKeys) {
            if (_key.equalsIgnoreCase("VisIdenMark")) {
                dataMap.put(Defs.SC_UIM, (String) extendedBiographic.get(_key));
            } else if (_key.equalsIgnoreCase("Qualification")) {
                dataMap.put(Defs.SC_EDUCATION, (String) extendedBiographic.get(_key));
            } else if (_key.equalsIgnoreCase("Profession")) {
                dataMap.put(Defs.SC_PROFESSION, (String) extendedBiographic.get(_key));
            } else if (_key.equalsIgnoreCase("Religion")) {
                dataMap.put(Defs.SC_RELIGION, (String) extendedBiographic.get(_key));
            } else if (_key.equalsIgnoreCase("Disability")) {
                dataMap.put(Defs.SC_DISABILITY, (String) extendedBiographic.get(_key));
            }
        }

    }

    @Override
    public void extendedDemographicDataReady(HashMap<String, Object> extendedDemographic) {
    }

    @Override
    public void relationshipDataReady(HashMap<String, Object> relationship) {

        Set<String> relationshipKeys = relationship.keySet();

        for (String _key : relationshipKeys) {
            if (_key.equalsIgnoreCase("FatherNid")) {
                dataMap.put(Defs.SC_FATHER_NID, (String) relationship.get(_key));
            } else if (_key.equalsIgnoreCase("MotherNid")) {
                dataMap.put(Defs.SC_MOTHER_NID, (String) relationship.get(_key));
            } else if (_key.equalsIgnoreCase("SpouseNid")) {
                dataMap.put(Defs.SC_SPOUSE_NID, (String) relationship.get(_key));
            } else if (_key.equalsIgnoreCase("SpouseName")) {
                dataMap.put(Defs.SC_NAME_SPOUSE, (String) relationship.get(_key));
            }
        }

    }

    @Override
    public void subscriptionDataReady(HashMap<String, Object> subscription) {

        Set<String> relationshipKeys = subscription.keySet();

        for (String _key : relationshipKeys) {
            if (_key.equalsIgnoreCase("Passport")) {
                dataMap.put(Defs.SC_PASSPORT, (String) subscription.get(_key));
            } else if (_key.equalsIgnoreCase("TIN")) {
                dataMap.put(Defs.SC_TIN, (String) subscription.get(_key));
            } else if (_key.equalsIgnoreCase("EMail")) {
                dataMap.put(Defs.SC_EMAIL, (String) subscription.get(_key));
            } else if (_key.equalsIgnoreCase("Telephone")) {
                dataMap.put(Defs.SC_TELEPHONE, (String) subscription.get(_key));
            } else if (_key.equalsIgnoreCase("DrivingLicense")) {
                dataMap.put(Defs.SC_DRIVING_LICENSE, (String) subscription.get(_key));
            } else if (_key.equalsIgnoreCase("MobileNo")) {
                dataMap.put(Defs.SC_MOBILE, (String) subscription.get(_key));
            }
        }

    }

    @Override
    public void fingerprintDataReady(HashMap<String, Object> fingerprint) {
    }

    @Override
    public void irisDataReady(HashMap<String, Object> iris) {
    }

    private void writeDataToFile(String filepath) {

        try {

            File file = new File(filepath);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for (String key : dataMap.keySet()) {

                System.out.println("key: " + key + " value: " + dataMap.get(key));

                bw.write("- " + key + " : " + dataMap.get(key) + " -\n");
            }
            bw.close();

            System.out.println("Done");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
