/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizwan.greenbit;

import com.istlbd.gui.BiometricNidPanel;
import com.istlbd.gui.BiometricNidPanel;
import com.istlbd.gui.ContainerJFrame;
import GBMSAPI_JAVA_Defines.GBMSAPI_JAVA_AcquisitionProcessDefines.GBMSAPI_JAVA_AcquisitionOptions;
import GBMSAPI_JAVA_Defines.GBMSAPI_JAVA_DeviceCharacteristicsDefines.GBMSAPI_JAVA_ScannableObjects;
import GBMSAPI_JAVA_Defines.GBMSAPI_JAVA_ErrorCodesDefines.GBMSAPI_JAVA_ErrorCodes;
import GBMSAPI_JAVA_LibraryFunctions.GBMSAPI_JAVA_AcquisitionEventsManagerCallbackInterface;
import GBMSAPI_JAVA_LibraryFunctions.GBMSAPI_JAVA_DLL_WRAPPER;
import GBMSAPI_JAVA_LibraryFunctions.GBMSAPI_JAVA_DLL_WRAPPER.GBMSAPI_Library;
import ImageProcessing.ImageAndFileProcessing;
//import com.perp.Lookup.*;
import business.entity.BioPerson;
import com.faisal.tm.CSD550E.CSD200Library;
import com.faisal.tm.ComputeQualityScore;
import com.faisal.tm.ICaptureObserver;
import com.faisal.tm.IComputeQualityScore;
import com.faisal.tm.ISegmentFingerprint;
import com.faisal.tm.SegmentFingerprint;
import com.faisal.tm.data.FPData;
import com.faisal.tm.geom.FPSegment;
import client.bean.ApplicationData;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.istlbd.utils.Defs;
import com.istlbd.utils.Lookup;
import com.sun.jna.ptr.IntByReference;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import wsq.wrapper.WSQConverter;

/**
 *
 * @author User
 */
public class FingerPrintForm extends javax.swing.JFrame implements WindowListener, ISegmentFingerprint, ICaptureObserver, IComputeQualityScore {

    static {
        Native.setProtected(true);
    }
    /**
     * Creates new form Backup
     */
    private static Properties properties;
    private static boolean isValidProperties = false;
    private static boolean isPathChanged = false;
    private static HashMap<String, String> propertiesMap;
    private static ArrayList<BioPerson> tabledata;
    private static ArrayList<String> servers;
    private static DefaultTableModel historyTableModel = null;
    private static JPanel login_panel;
    private static String Existing_backup_path;
    private static FileNameExtensionFilter filter;
    private HashMap<String, byte[]> fingersMap;
    private HashMap<String, byte[]> photoMap;
    private static boolean isFpDeviceInitialized = false;
    public static boolean isFpDeviceConnected = true;
    public static boolean isAutoCapture = false;
    public int current_selected_index = 0;
    private int fWidth;
    private int fHeight;
    private String identifyOrVerify;
    public static String fingerQualityImage = "blue";
    private JFileChooser fingerPrintFileChooser;
    public static int initCrossMatchReturnCode;
    public static int crossmatchReadyForCapture;

    // Greenbit starts
    private static FingerPrintForm fpView = null;
    private FPData leftFPData = null;
    private FPData rightFPData = null;
    private FPData thumbFPData = null;
    private int fingerCnt = 0;
    private int whichFinger = 0;

    public static String imageFileName="";
    public static boolean manualClick=false;    
    public static int imageType;
    public static BufferedImage imgFromScanner;
    JLabel lFramePictureBox;
    Timer acquisitionTimer;
    public static int idle = 0;
    public static int preview = 1;
    public static int acquisition = 2;
    public static int scannerStart = 3;
    public static int scannerError = 4;

    public static int acquisitionState = idle;
    public static boolean FrameIsReady = false;
    public static boolean AcquisitionEnded = false;

    public static int imgSx = 0, imgSy = 0;

    public GB_ExampleAcquisitionCallback AcqCallb = null;
    
    public int previewX=230,previewY=10,previewWidth=390,previewHeight=280;
    
// greenbit ends    
    
    
    public HashMap<String, byte[]> getFingersMap() {
        return fingersMap;
    }

    public void setFingersMap(HashMap<String, byte[]> fingersMap) {
        this.fingersMap = fingersMap;
    }

    public FingerPrintForm() {
//        applicationData = new ApplicationData();
        initComponents();

        //GreenBits STARTS

//        int imgSize = 100;
        this.imgFromScanner = CreateBlankImage(previewWidth,previewHeight);
        FrameIsReady = true;
        this.drawImage(previewX,previewY);        
        

        leftFPData = new FPData();
        rightFPData = new FPData();
        thumbFPData = new FPData();
        //GreenBits ENDS

        idv_finger_print_panelComponentShown();
        
        this.addWindowListener(this);
    }
    
    ActionListener taskPerformer = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            //...Perform a task...
            acquisitionTimer.stop();
            if (acquisitionState != idle) {
                drawImage(imgSx, imgSy);
            }
            if (!AcquisitionEnded) {
                acquisitionTimer.start();
            } else {
                acquisitionState = idle;
                FrameIsReady = true;
                drawImage(imgSx, imgSy);
//                bStartAcquisition.setEnabled(true);
//                bStopButton.setEnabled(false);
            }
        }
    };    

    public void setFrameTitle(String title) {
        this.setTitle(title);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_content_panel = new javax.swing.JPanel();
        idv_finger_print_panel1 = new javax.swing.JPanel();
        idv_lm_cap1 = new javax.swing.JLabel();
        leftFourFingerLabel = new javax.swing.JLabel();
        rightFourFingerLabel = new javax.swing.JLabel();
        twoThumbsLabel = new javax.swing.JLabel();
        idv_lr_cap1 = new javax.swing.JLabel();
        idv_lp_cap1 = new javax.swing.JLabel();
        idv_lt_cap1 = new javax.swing.JLabel();
        idv_li_cap1 = new javax.swing.JLabel();
        left_hand_base_label1 = new javax.swing.JLabel();
        idv_ri_pointer1 = new javax.swing.JLabel();
        idv_rt_cap1 = new javax.swing.JLabel();
        idv_rr_cap1 = new javax.swing.JLabel();
        idv_rp_cap1 = new javax.swing.JLabel();
        idv_ri_cap1 = new javax.swing.JLabel();
        idv_rm_cap1 = new javax.swing.JLabel();
        right_hand_base_label1 = new javax.swing.JLabel();
        idv_lt_preview_label1 = new javax.swing.JLabel();
        idv_lp_preview_label1 = new javax.swing.JLabel();
        idv_lr_preview_label1 = new javax.swing.JLabel();
        idv_lm_preview_label1 = new javax.swing.JLabel();
        idv_li_preview_label1 = new javax.swing.JLabel();
        idv_rt_preview_label1 = new javax.swing.JLabel();
        idv_rp_preview_label1 = new javax.swing.JLabel();
        idv_rr_preview_label1 = new javax.swing.JLabel();
        idv_rm_preview_label1 = new javax.swing.JLabel();
        idv_ri_preview_label1 = new javax.swing.JLabel();
        idv_rt_pointer1 = new javax.swing.JLabel();
        idv_rm_pointer1 = new javax.swing.JLabel();
        idv_rr_pointer1 = new javax.swing.JLabel();
        idv_rp_pointer1 = new javax.swing.JLabel();
        idv_lt_pointer1 = new javax.swing.JLabel();
        idv_li_pointer1 = new javax.swing.JLabel();
        idv_lm_pointer1 = new javax.swing.JLabel();
        idv_lr_pointer1 = new javax.swing.JLabel();
        idv_lp_pointer1 = new javax.swing.JLabel();
        idv_capture_complete_button1 = new javax.swing.JButton();
        idv_capture_cancel_button1 = new javax.swing.JButton();
        idv_capture_reset_button1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        idv_ri_pointer = new javax.swing.JLabel();
        idv_rt_pointer = new javax.swing.JLabel();
        idv_li_pointer = new javax.swing.JLabel();
        idv_lt_pointer = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        main_content_panel.setMaximumSize(new java.awt.Dimension(874, 450));
        main_content_panel.setMinimumSize(new java.awt.Dimension(874, 450));
        main_content_panel.setPreferredSize(new java.awt.Dimension(874, 450));

        idv_finger_print_panel1.setMaximumSize(new java.awt.Dimension(850, 422));
        idv_finger_print_panel1.setMinimumSize(new java.awt.Dimension(850, 422));
        idv_finger_print_panel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                idv_finger_print_panel1ComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                idv_finger_print_panel1ComponentShown(evt);
            }
        });
        idv_finger_print_panel1.setLayout(null);

        idv_lm_cap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_lm_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/l_middle_blue.gif"))); // NOI18N
        idv_lm_cap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idv_lm_cap1MouseClicked(evt);
            }
        });
        idv_finger_print_panel1.add(idv_lm_cap1);
        idv_lm_cap1.setBounds(120, 40, 30, 70);

        leftFourFingerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/left_four.png"))); // NOI18N
        leftFourFingerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftFourFingerLabelMouseClicked(evt);
            }
        });
        idv_finger_print_panel1.add(leftFourFingerLabel);
        leftFourFingerLabel.setBounds(-20, 200, 70, 70);

        rightFourFingerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/right_four.png"))); // NOI18N
        rightFourFingerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightFourFingerLabelMouseClicked(evt);
            }
        });
        idv_finger_print_panel1.add(rightFourFingerLabel);
        rightFourFingerLabel.setBounds(790, 200, 70, 70);

        twoThumbsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/thumbs2.png"))); // NOI18N
        twoThumbsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoThumbsLabelMouseClicked(evt);
            }
        });
        idv_finger_print_panel1.add(twoThumbsLabel);
        twoThumbsLabel.setBounds(360, 300, 130, 70);

        idv_lr_cap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_lr_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/l_ring_blue.gif"))); // NOI18N
        idv_lr_cap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idv_lr_cap1MouseClicked(evt);
            }
        });
        idv_finger_print_panel1.add(idv_lr_cap1);
        idv_lr_cap1.setBounds(89, 50, 30, 70);

        idv_lp_cap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_lp_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/l_small_blue.gif"))); // NOI18N
        idv_lp_cap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idv_lp_cap1MouseClicked(evt);
            }
        });
        idv_finger_print_panel1.add(idv_lp_cap1);
        idv_lp_cap1.setBounds(56, 66, 30, 70);

        idv_lt_cap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_lt_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/l_thumb_blue.gif"))); // NOI18N
        idv_lt_cap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idv_lt_cap1MouseClicked(evt);
            }
        });
        idv_finger_print_panel1.add(idv_lt_cap1);
        idv_lt_cap1.setBounds(181, 140, 40, 60);

        idv_li_cap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_li_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/l_index_blue.gif"))); // NOI18N
        idv_li_cap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idv_li_cap1MouseClicked(evt);
            }
        });
        idv_finger_print_panel1.add(idv_li_cap1);
        idv_li_cap1.setBounds(149, 56, 30, 70);

        left_hand_base_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left_hand_base_label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/left_hand.gif"))); // NOI18N
        left_hand_base_label1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        idv_finger_print_panel1.add(left_hand_base_label1);
        left_hand_base_label1.setBounds(50, 20, 180, 250);

        idv_ri_pointer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_ri_pointer1);
        idv_ri_pointer1.setBounds(675, 25, 20, 30);

        idv_rt_cap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_rt_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/r_thumb_blue.gif"))); // NOI18N
        idv_rt_cap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idv_rt_cap1MouseClicked(evt);
            }
        });
        idv_finger_print_panel1.add(idv_rt_cap1);
        idv_rt_cap1.setBounds(630, 141, 40, 60);

        idv_rr_cap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_rr_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/r_ring_blue.gif"))); // NOI18N
        idv_rr_cap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idv_rr_cap1MouseClicked(evt);
            }
        });
        idv_finger_print_panel1.add(idv_rr_cap1);
        idv_rr_cap1.setBounds(731, 42, 30, 80);

        idv_rp_cap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_rp_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/r_small_blue.gif"))); // NOI18N
        idv_rp_cap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idv_rp_cap1MouseClicked(evt);
            }
        });
        idv_finger_print_panel1.add(idv_rp_cap1);
        idv_rp_cap1.setBounds(764, 64, 30, 80);

        idv_ri_cap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_ri_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/r_index_blue.gif"))); // NOI18N
        idv_ri_cap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idv_ri_cap1MouseClicked(evt);
            }
        });
        idv_finger_print_panel1.add(idv_ri_cap1);
        idv_ri_cap1.setBounds(671, 51, 30, 80);

        idv_rm_cap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_rm_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/r_middle_blue.gif"))); // NOI18N
        idv_rm_cap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idv_rm_cap1MouseClicked(evt);
            }
        });
        idv_finger_print_panel1.add(idv_rm_cap1);
        idv_rm_cap1.setBounds(701, 37, 30, 80);

        right_hand_base_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        right_hand_base_label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/right_hand.gif"))); // NOI18N
        right_hand_base_label1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        idv_finger_print_panel1.add(right_hand_base_label1);
        right_hand_base_label1.setBounds(620, 20, 180, 250);

        idv_lt_preview_label1.setBackground(new java.awt.Color(255, 255, 255));
        idv_lt_preview_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_lt_preview_label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idv_lt_preview_label1.setOpaque(true);
        idv_finger_print_panel1.add(idv_lt_preview_label1);
        idv_lt_preview_label1.setBounds(290, 300, 60, 60);

        idv_lp_preview_label1.setBackground(new java.awt.Color(255, 255, 255));
        idv_lp_preview_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_lp_preview_label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idv_lp_preview_label1.setOpaque(true);
        idv_finger_print_panel1.add(idv_lp_preview_label1);
        idv_lp_preview_label1.setBounds(10, 300, 60, 60);

        idv_lr_preview_label1.setBackground(new java.awt.Color(255, 255, 255));
        idv_lr_preview_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_lr_preview_label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idv_lr_preview_label1.setOpaque(true);
        idv_finger_print_panel1.add(idv_lr_preview_label1);
        idv_lr_preview_label1.setBounds(80, 300, 60, 60);

        idv_lm_preview_label1.setBackground(new java.awt.Color(255, 255, 255));
        idv_lm_preview_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_lm_preview_label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idv_lm_preview_label1.setOpaque(true);
        idv_finger_print_panel1.add(idv_lm_preview_label1);
        idv_lm_preview_label1.setBounds(150, 300, 60, 60);

        idv_li_preview_label1.setBackground(new java.awt.Color(255, 255, 255));
        idv_li_preview_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_li_preview_label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idv_li_preview_label1.setOpaque(true);
        idv_finger_print_panel1.add(idv_li_preview_label1);
        idv_li_preview_label1.setBounds(220, 300, 60, 60);

        idv_rt_preview_label1.setBackground(new java.awt.Color(255, 255, 255));
        idv_rt_preview_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_rt_preview_label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idv_rt_preview_label1.setOpaque(true);
        idv_finger_print_panel1.add(idv_rt_preview_label1);
        idv_rt_preview_label1.setBounds(500, 300, 60, 60);

        idv_rp_preview_label1.setBackground(new java.awt.Color(255, 255, 255));
        idv_rp_preview_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_rp_preview_label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idv_rp_preview_label1.setOpaque(true);
        idv_finger_print_panel1.add(idv_rp_preview_label1);
        idv_rp_preview_label1.setBounds(780, 300, 60, 60);

        idv_rr_preview_label1.setBackground(new java.awt.Color(255, 255, 255));
        idv_rr_preview_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_rr_preview_label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idv_rr_preview_label1.setOpaque(true);
        idv_finger_print_panel1.add(idv_rr_preview_label1);
        idv_rr_preview_label1.setBounds(710, 300, 60, 60);

        idv_rm_preview_label1.setBackground(new java.awt.Color(255, 255, 255));
        idv_rm_preview_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_rm_preview_label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idv_rm_preview_label1.setOpaque(true);
        idv_finger_print_panel1.add(idv_rm_preview_label1);
        idv_rm_preview_label1.setBounds(640, 300, 60, 60);

        idv_ri_preview_label1.setBackground(new java.awt.Color(255, 255, 255));
        idv_ri_preview_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_ri_preview_label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idv_ri_preview_label1.setOpaque(true);
        idv_finger_print_panel1.add(idv_ri_preview_label1);
        idv_ri_preview_label1.setBounds(570, 300, 60, 60);

        idv_rt_pointer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_rt_pointer1);
        idv_rt_pointer1.setBounds(630, 105, 20, 30);

        idv_rm_pointer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_rm_pointer1);
        idv_rm_pointer1.setBounds(705, 8, 20, 30);

        idv_rr_pointer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_rr_pointer1);
        idv_rr_pointer1.setBounds(733, 18, 20, 30);

        idv_rp_pointer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_rp_pointer1);
        idv_rp_pointer1.setBounds(768, 45, 20, 30);

        idv_lt_pointer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_lt_pointer1);
        idv_lt_pointer1.setBounds(200, 105, 20, 30);

        idv_li_pointer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_li_pointer1);
        idv_li_pointer1.setBounds(155, 23, 20, 30);

        idv_lm_pointer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_lm_pointer1);
        idv_lm_pointer1.setBounds(123, 8, 20, 30);

        idv_lr_pointer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_lr_pointer1);
        idv_lr_pointer1.setBounds(95, 18, 20, 30);

        idv_lp_pointer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_lp_pointer1);
        idv_lp_pointer1.setBounds(60, 45, 20, 30);

        idv_capture_complete_button1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idv_capture_complete_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/go_next_22.png"))); // NOI18N
        idv_capture_complete_button1.setText("DONE");
        idv_capture_complete_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idv_capture_complete_button1ActionPerformed(evt);
            }
        });
        idv_finger_print_panel1.add(idv_capture_complete_button1);
        idv_capture_complete_button1.setBounds(740, 390, 100, 30);

        idv_capture_cancel_button1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idv_capture_cancel_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/cancel_16.png"))); // NOI18N
        idv_capture_cancel_button1.setText("CANCEL");
        idv_capture_cancel_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idv_capture_cancel_button1ActionPerformed(evt);
            }
        });
        idv_finger_print_panel1.add(idv_capture_cancel_button1);
        idv_capture_cancel_button1.setBounds(620, 390, 100, 30);

        idv_capture_reset_button1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idv_capture_reset_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/restart_18.png"))); // NOI18N
        idv_capture_reset_button1.setText("RESET");
        idv_capture_reset_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idv_capture_reset_button1ActionPerformed(evt);
            }
        });
        idv_finger_print_panel1.add(idv_capture_reset_button1);
        idv_capture_reset_button1.setBounds(500, 390, 100, 30);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/green-tick.png"))); // NOI18N
        idv_finger_print_panel1.add(jLabel19);
        jLabel19.setBounds(140, 390, 20, 20);

        jLabel20.setText("  Good");
        idv_finger_print_panel1.add(jLabel20);
        jLabel20.setBounds(170, 390, 40, 20);

        jLabel21.setText("  Fair");
        idv_finger_print_panel1.add(jLabel21);
        jLabel21.setBounds(250, 390, 30, 20);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/orange-tick.png"))); // NOI18N
        idv_finger_print_panel1.add(jLabel22);
        jLabel22.setBounds(220, 390, 20, 20);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/red-minus.png"))); // NOI18N
        idv_finger_print_panel1.add(jLabel23);
        jLabel23.setBounds(290, 390, 20, 20);

        jLabel24.setText("  Bad");
        idv_finger_print_panel1.add(jLabel24);
        jLabel24.setBounds(320, 390, 30, 20);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Fingerprint Quality : ");
        idv_finger_print_panel1.add(jLabel25);
        jLabel25.setBounds(16, 390, 114, 20);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("INDEX");
        idv_finger_print_panel1.add(jLabel26);
        jLabel26.setBounds(220, 365, 60, 20);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("THUMB");
        idv_finger_print_panel1.add(jLabel27);
        jLabel27.setBounds(500, 365, 60, 20);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("INDEX");
        idv_finger_print_panel1.add(jLabel28);
        jLabel28.setBounds(570, 365, 60, 20);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("THUMB");
        idv_finger_print_panel1.add(jLabel29);
        jLabel29.setBounds(290, 365, 60, 20);

        idv_ri_pointer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_ri_pointer);
        idv_ri_pointer.setBounds(675, 25, 20, 30);

        idv_rt_pointer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_rt_pointer);
        idv_rt_pointer.setBounds(630, 105, 20, 30);

        idv_li_pointer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_li_pointer);
        idv_li_pointer.setBounds(155, 23, 20, 30);

        idv_lt_pointer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idv_finger_print_panel1.add(idv_lt_pointer);
        idv_lt_pointer.setBounds(200, 105, 20, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        idv_finger_print_panel1.add(jPanel1);
        jPanel1.setBounds(240, 20, 380, 240);

        javax.swing.GroupLayout main_content_panelLayout = new javax.swing.GroupLayout(main_content_panel);
        main_content_panel.setLayout(main_content_panelLayout);
        main_content_panelLayout.setHorizontalGroup(
            main_content_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_content_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idv_finger_print_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        main_content_panelLayout.setVerticalGroup(
            main_content_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_content_panelLayout.createSequentialGroup()
                .addComponent(idv_finger_print_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(main_content_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_content_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
// GREEN BIT STARTS    

    public static String GetAcquisitionStateString(int acqState) {
        if (acqState == idle) {
            return "IDLE";
        }
        if (acqState == preview) {
            return "PREVIEW";
        }
        if (acqState == acquisition) {
            return "ACQUISITION";
        }
        if (acqState == scannerStart) {
            return "SCANNER START";
        }
        if (acqState == scannerError) {
            return "ERROR";
        }
        return "UNKNOWN";
    }

    public void drawImage(int x, int y) {
        if (x < 0 || y < 0) {
            return;
        }
        if (imgFromScanner != null && FrameIsReady == true) {
            BufferedImage imgToPaint = new BufferedImage(400, 375, imgFromScanner.getType());
            Graphics2D g = imgToPaint.createGraphics();
            g.drawImage(imgFromScanner, 0, 0, 400, 375, null);
            g.setColor(Color.BLACK);
            g.drawString(GetAcquisitionStateString(acquisitionState), previewX,previewY);
            g.dispose();
            if (lFramePictureBox != null) {
                this.remove(lFramePictureBox);
            }
            lFramePictureBox = new JLabel(new ImageIcon(imgToPaint));
            lFramePictureBox.setSize(previewWidth,previewHeight);
            lFramePictureBox.setLocation(previewX,previewY);
            add(lFramePictureBox);
            lFramePictureBox.setVisible(true);
            FrameIsReady = false;
//            System.out.println("Frame drawn!");
            this.repaint();
            
            jLabel2.setIcon(new ImageIcon(imgToPaint));
            
        }
    }

    public static BufferedImage getImageFromFramePtr(Pointer framePtr, int width, int height) {
        byte[] temp = framePtr.getByteArray(0L, width * height);
        if (temp != null && temp.length > 0) {
            BufferedImage bImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
            DataBuffer dataBuf = bImage.getRaster().getDataBuffer();
            for (int i = 0; i < temp.length - 4; i++) {
                int pix = temp[i] & 0xff | (temp[i + 1] & 0xff) << 8;
                dataBuf.setElem(i, pix);
            }
            return bImage;
        }
        return null;
    }

    public BufferedImage CreateBlankImage(int w, int h) {
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_BYTE_GRAY);
        DataBuffer dataBuf = bi.getRaster().getDataBuffer();
        for (int i = 0; i < w * h; i++) {
            int pix = 0xFFFFFFFF;
            dataBuf.setElem(i, pix);
        }
        return bi;
    }
    
    
    
// GREEN BIT ENDS    
    //3M STARTS 
    // INTERFACE ISegmentFingerPrint Starts
    @Override
    public FPData getFPData() {
        int wf = this.getWhichFinger();
        switch (wf) {
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_FINGERS:
                return leftFPData;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_FINGERS:
                return rightFPData;
            case CSD200Library.CG4ImageType.CG4_FLAT_TWO_THUMBS:
                return thumbFPData;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_SMALL:
                return leftFPData;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_RING:
                return leftFPData;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_MIDDLE:
                return leftFPData;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_INDEX:
                return leftFPData;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_THUMB:
                return thumbFPData;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_SMALL:
                return rightFPData;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_RING:
                return rightFPData;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_MIDDLE:
                return rightFPData;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_INDEX:
                return rightFPData;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_THUMB:
                return thumbFPData;
            default:
                return leftFPData;
        }
    }

    @Override
    public int getFingerCnt() {
        return fingerCnt;
    }

    @Override
    public void setFPData(FPData fpData) {
        int wf = this.getWhichFinger();
        switch (wf) {
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_FINGERS:
                this.leftFPData = fpData;
                break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_FINGERS:
                this.rightFPData = fpData;
                break;
            case CSD200Library.CG4ImageType.CG4_FLAT_TWO_THUMBS:
                this.thumbFPData = fpData;
                break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_SMALL:
                this.leftFPData = fpData;
                break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_RING:
                this.leftFPData = fpData;
                break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_MIDDLE:
                this.leftFPData = fpData;
                break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_INDEX:
                this.leftFPData = fpData;
                break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_THUMB:
                this.thumbFPData = fpData;
                break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_SMALL:
                this.rightFPData = fpData;
                break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_RING:
                this.rightFPData = fpData;
                break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_MIDDLE:
                this.rightFPData = fpData;
                break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_INDEX:
                this.rightFPData = fpData;
                break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_THUMB:
                this.thumbFPData = fpData;
                break;
            default:
                this.leftFPData = fpData;
        }
    }

    @Override
    public void segmentationDone() {
        int wf = this.whichFinger;

        switch (wf) {
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_FINGERS: {
                this.setLeftFingerIcons();
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_FINGERS: {
                this.setRightFingerIcons();
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_TWO_THUMBS: {
                this.setThumbFingerIcons();
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_SMALL: {
                this.setLabelIcon(idv_lp_preview_label1, this.leftFPData.getSegment(0));
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_RING: {
                this.setLabelIcon(idv_lr_preview_label1, this.leftFPData.getSegment(1));
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_MIDDLE: {
                this.setLabelIcon(idv_lm_preview_label1, this.leftFPData.getSegment(2));
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_INDEX: {
                this.setLabelIcon(idv_li_preview_label1, this.leftFPData.getSegment(3));
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_THUMB: {
                this.setLabelIcon(idv_lt_preview_label1, this.thumbFPData.getSegment(0));
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_SMALL: {
                this.setLabelIcon(idv_rp_preview_label1, this.rightFPData.getSegment(3));
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_RING: {
                this.setLabelIcon(idv_rr_preview_label1, this.rightFPData.getSegment(2));
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_MIDDLE: {
                this.setLabelIcon(idv_rm_preview_label1, this.rightFPData.getSegment(1));
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_INDEX: {
                this.setLabelIcon(idv_ri_preview_label1, this.rightFPData.getSegment(0));
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_THUMB: {
                this.setLabelIcon(idv_rt_preview_label1, this.thumbFPData.getSegment(1));
            }
            break;
            default:
                this.setLeftFingerIcons();
        }

        updateLabel("Finger Print Quality Calculating. Please wait...");
        //ComputeQualityScore qualityScore = new ComputeQualityScore(this);
        //qualityScore.start();
        qualityComputeDone();
        
    }

    @Override
    public void segmentationFailed(String errMsg) {
        JOptionPane.showMessageDialog(null, "Segmentation Failed : " + errMsg, "Segmentation Message", JOptionPane.OK_OPTION);
    }

    @Override
    public int getWhichFinger() {
        return whichFinger;
    }
    // INTERFACE ISEGMENTFINGERPRINT ENDS

// INTERFACE ICAPTUREOBSERVER STARTS
    @Override
    public void setFPImagePreview(Image img) {
//        mCanvas.setFpImg(img);
//        mCanvas.repaint();
    }

    @Override
    public void setFPImageFinal(Image img) {
//        mCanvas.setFpImg(img);
//        mCanvas.repaint();
    }

    @Override
    public void setCaptureDone() {
        updateLabel("Segmenting fingerprints. Please wait...");
        SegmentFingerprint segFinger = new SegmentFingerprint(this);
        segFinger.start();
    }

    @Override
    public Image getFPImage() {
//        return mCanvas.getFpImg();//ERR
        return null;
    }

// INTERFACE ICAPTURE OBSERVER ENDS    
// INTERFACE ICOMPUTEQUALITYSCORE STARTS
    @Override
    public void qualityComputeDone() {
        updateLabel("Finger Print Capture Completed.");

        int wf = this.getWhichFinger();
        FPData fpd = null;
        int scr = 100;
        int MIN_SCORE = 2000;
        int width,height;
        switch (wf) {
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_FINGERS: {
                fpd = leftFPData;


//Left Little 0                
                scr = fpd.getSegment(0).getScore();
                System.out.println("score obtained =" + scr);
                if (fpd.getSegment(0) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqLl(getWsqFromRaw(fpd.getSegment(0)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_lp,fpd.getSegment(0));
                }

// Left Ring 1

                scr = fpd.getSegment(1).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(1) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqLr(getWsqFromRaw(fpd.getSegment(1)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_lr,fpd.getSegment(1));                    
                }

// Left Middle 2
                scr = fpd.getSegment(2).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(2) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqLm(getWsqFromRaw(fpd.getSegment(2)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_lm,fpd.getSegment(2));
                }
// Left Index 3                
                scr = fpd.getSegment(3).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(3) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqLi(getWsqFromRaw(fpd.getSegment(3)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_li,fpd.getSegment(3));
                }

            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_FINGERS: {
                fpd = rightFPData;

                scr = fpd.getSegment(3).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(3) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqRl(getWsqFromRaw(fpd.getSegment(3)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_rp,fpd.getSegment(3));
                }

                scr = fpd.getSegment(2).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(2) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqRr(getWsqFromRaw(fpd.getSegment(2)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_rr,fpd.getSegment(2));
                }
                scr = fpd.getSegment(1).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(1) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqRm(getWsqFromRaw(fpd.getSegment(1)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_rm,fpd.getSegment(1));
                }
                scr = fpd.getSegment(0).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(0) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqRi(getWsqFromRaw(fpd.getSegment(0)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_ri,fpd.getSegment(0));
                }

            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_TWO_THUMBS: {
                fpd = thumbFPData;

                scr = fpd.getSegment(0).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(0) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqLt(getWsqFromRaw(fpd.getSegment(0)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_lt,fpd.getSegment(0));
                }

                scr = fpd.getSegment(1).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(1) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqRt(getWsqFromRaw(fpd.getSegment(1)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_rt,fpd.getSegment(1));
                }


            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_SMALL: {
                fpd = leftFPData;
                scr = fpd.getSegment(0).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(0) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqLl(getWsqFromRaw(fpd.getSegment(0)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_lp,fpd.getSegment(0));
                }
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_RING: {
                fpd = leftFPData;
                scr = fpd.getSegment(1).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(1) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqLr(getWsqFromRaw(fpd.getSegment(1)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_lr,fpd.getSegment(1));
                }
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_MIDDLE: {
                fpd = leftFPData;
                scr = fpd.getSegment(2).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(2) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqLm(getWsqFromRaw(fpd.getSegment(2)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_lm,fpd.getSegment(2));
                }

            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_INDEX: {
                fpd = leftFPData;
                scr = fpd.getSegment(3).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(3) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqLi(getWsqFromRaw(fpd.getSegment(3)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_li,fpd.getSegment(3));
                }
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_LEFT_THUMB: {
                fpd = thumbFPData;
                scr = fpd.getSegment(0).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(0) != null && scr < MIN_SCORE) {
                    
                    BiometricNidPanel.applicationData.setWsqLt(getWsqFromRaw(fpd.getSegment(0)));
                    if(BiometricNidPanel.applicationData.getWsqLt()!=null)
                        System.out.println("wsq aint null for lt");
                    else
                        System.out.println("wsq is null");
                    
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_lt,fpd.getSegment(0));
                    System.out.println("attempted to set label :|");
                }
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_SMALL: {
                fpd = rightFPData;
                scr = fpd.getSegment(3).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(3) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqRl(getWsqFromRaw(fpd.getSegment(3)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_rp,fpd.getSegment(3));
                }

            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_RING: {
                fpd = rightFPData;
                scr = fpd.getSegment(2).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(2) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqRr(getWsqFromRaw(fpd.getSegment(2)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_rr,fpd.getSegment(2));
                }
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_MIDDLE: {
                fpd = rightFPData;
                scr = fpd.getSegment(1).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(1) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqRm(getWsqFromRaw(fpd.getSegment(1)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_rm,fpd.getSegment(1));
                }
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_INDEX: {
                fpd = rightFPData;
                scr = fpd.getSegment(0).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(0) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqRi(getWsqFromRaw(fpd.getSegment(0)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_ri,fpd.getSegment(0));
                }
            }
            break;
            case CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_THUMB: {
                fpd = thumbFPData;
                scr = fpd.getSegment(1).getScore();
                System.out.println("score obtained =" + scr);

                if (fpd.getSegment(1) != null && scr < MIN_SCORE) {
                    BiometricNidPanel.applicationData.setWsqRt(getWsqFromRaw(fpd.getSegment(1)));
                    this.setLabelIcon(ContainerJFrame.dummyNidPanel1.lbl_fp_rt,fpd.getSegment(1));
                }
            }
            break;
            default:
                fpd = null;



        }
        startCrossmatchAutoSequenceCapture();

    }

    @Override
    public void qualityComputeFailed(String errMsg) {
        JOptionPane.showMessageDialog(null, "Quality Computation Failed : " + errMsg, "QC Message", JOptionPane.OK_OPTION);
        startCrossmatchAutoSequenceCapture();
    }

// INTERFACE ICOMPUTEQUALITYSCORE ENDS    
// INTERFACE WINDOWLISTENER STARTS
    @Override
    public void windowOpened(WindowEvent e) {
        isFpDeviceConnected = false;
        AcqCallb = new GB_ExampleAcquisitionCallback(this);
        try {
            
            updateLabel("Initializing Device.");

            if(!IsDeviceConnected())
            {
                isFpDeviceConnected=false;
                dispose();
            }
            else {

            isFpDeviceConnected = true;
            updateLabel("Scanner initialized");

           /* DummyNidPanel.showWsqImageinJLabel(idv_lt_preview_label1, DummyNidPanel.applicationData.getWsqLt());
            DummyNidPanel.showWsqImageinJLabel(idv_li_preview_label1, DummyNidPanel.applicationData.getWsqLi());
            DummyNidPanel.showWsqImageinJLabel(idv_lm_preview_label1, DummyNidPanel.applicationData.getWsqLm());
            DummyNidPanel.showWsqImageinJLabel(idv_lr_preview_label1, DummyNidPanel.applicationData.getWsqLr());
            DummyNidPanel.showWsqImageinJLabel(idv_lp_preview_label1, DummyNidPanel.applicationData.getWsqLl());
            
            DummyNidPanel.showWsqImageinJLabel(idv_rt_preview_label1, DummyNidPanel.applicationData.getWsqRt());
            DummyNidPanel.showWsqImageinJLabel(idv_ri_preview_label1, DummyNidPanel.applicationData.getWsqRi());
            DummyNidPanel.showWsqImageinJLabel(idv_rm_preview_label1, DummyNidPanel.applicationData.getWsqRm());
            DummyNidPanel.showWsqImageinJLabel(idv_rr_preview_label1, DummyNidPanel.applicationData.getWsqRr());
            DummyNidPanel.showWsqImageinJLabel(idv_rp_preview_label1, DummyNidPanel.applicationData.getWsqRl());   */  
            
            BiometricNidPanel.showWsqImageinJLabel(idv_lt_preview_label1, BiometricNidPanel.applicationData.getWsqLt());
            BiometricNidPanel.showWsqImageinJLabel(idv_li_preview_label1, BiometricNidPanel.applicationData.getWsqLi());
            BiometricNidPanel.showWsqImageinJLabel(idv_lm_preview_label1, BiometricNidPanel.applicationData.getWsqLm());
            BiometricNidPanel.showWsqImageinJLabel(idv_lr_preview_label1, BiometricNidPanel.applicationData.getWsqLr());
            BiometricNidPanel.showWsqImageinJLabel(idv_lp_preview_label1, BiometricNidPanel.applicationData.getWsqLl());
            
            BiometricNidPanel.showWsqImageinJLabel(idv_rt_preview_label1, BiometricNidPanel.applicationData.getWsqRt());
            BiometricNidPanel.showWsqImageinJLabel(idv_ri_preview_label1, BiometricNidPanel.applicationData.getWsqRi());
            BiometricNidPanel.showWsqImageinJLabel(idv_rm_preview_label1, BiometricNidPanel.applicationData.getWsqRm());
            BiometricNidPanel.showWsqImageinJLabel(idv_rr_preview_label1, BiometricNidPanel.applicationData.getWsqRr());
            BiometricNidPanel.showWsqImageinJLabel(idv_rp_preview_label1, BiometricNidPanel.applicationData.getWsqRl()); 
                
            startCrossmatchAutoSequenceCapture();
            }

        } catch (Exception exc) {
            updateLabel("Device initialization error. " + exc.getMessage());
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            AcqCallb=null;
            abortCapture();
        } catch (Exception exc) {
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

// INTERFACE WINDOWLISTENER ENDS    
// REM GREEN Bit Starts
    private void reset() {
        imageType = CSD200Library.CG4ImageType.CG4_FLAT_LEFT_FINGERS;
        int numberOfObjects = 4;
        
        int GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_SLAP_4_LEFT;

        if (this.current_selected_index == 11) {
            imageType = CSD200Library.CG4ImageType.CG4_FLAT_LEFT_FINGERS;
            numberOfObjects = 4;
            this.resetLeftFingerIcons();
            GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_SLAP_4_LEFT;
            updateLabel("Please place left fingers on scanner...");
        } else if (this.current_selected_index == 12) {
            this.resetRightFingerIcons();
            imageType = CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_FINGERS;
            numberOfObjects = 4;
            GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_SLAP_4_RIGHT;
            updateLabel("Please place right fingers on scanner...");
        } else if (this.current_selected_index == 13) {
            this.resetThumbFingerIcons();
            imageType = CSD200Library.CG4ImageType.CG4_FLAT_TWO_THUMBS;
            numberOfObjects = 2;
            GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_SLAP_2_THUMBS;
            updateLabel("Please place two thumbs on scanner...");
        } else if (this.current_selected_index == 10) {
            this.resetLabelIcon(idv_lp_preview_label1);
            imageType = CSD200Library.CG4ImageType.CG4_FLAT_LEFT_SMALL;
            GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_FLAT_LEFT_LITTLE;
            numberOfObjects = 1;
            updateLabel("Please place left small finger on scanner...");
        } else if (this.current_selected_index == 9) {
            this.resetLabelIcon(idv_lr_preview_label1);
            imageType = CSD200Library.CG4ImageType.CG4_FLAT_LEFT_RING;
            GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_FLAT_LEFT_RING;
            numberOfObjects = 1;
            updateLabel("Please place left ring finger on scanner...");
        } else if (this.current_selected_index == 8) {
            this.resetLabelIcon(idv_lm_preview_label1);
            imageType = CSD200Library.CG4ImageType.CG4_FLAT_LEFT_MIDDLE;
            GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_FLAT_LEFT_MIDDLE;
            numberOfObjects = 1;
            updateLabel("Please place left middle finger on scanner...");
        } else if (this.current_selected_index == 7) {
            this.resetLabelIcon(idv_li_preview_label1);
            imageType = CSD200Library.CG4ImageType.CG4_FLAT_LEFT_INDEX;
            GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_FLAT_LEFT_INDEX;
            numberOfObjects = 1;
            updateLabel("Please place left index finger on scanner...");
        } else if (this.current_selected_index == 6) {
            this.resetLabelIcon(idv_lt_preview_label1);
            imageType = CSD200Library.CG4ImageType.CG4_FLAT_LEFT_THUMB;
            GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_FLAT_LEFT_THUMB;
            numberOfObjects = 1;
            updateLabel("Please place left thumb finger on scanner...");
        } else if (this.current_selected_index == 5) {
            this.resetLabelIcon(idv_rp_preview_label1);
            imageType = CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_SMALL;
            GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_FLAT_RIGHT_LITTLE;
            numberOfObjects = 1;
            updateLabel("Please place right small finger on scanner...");
        } else if (this.current_selected_index == 4) {
            this.resetLabelIcon(idv_rr_preview_label1);
            imageType = CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_RING;
            GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_FLAT_RIGHT_RING;
            numberOfObjects = 1;
            updateLabel("Please place right ring finger on scanner...");
        } else if (this.current_selected_index == 3) {
            this.resetLabelIcon(idv_rm_preview_label1);
            imageType = CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_MIDDLE;
            GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_FLAT_RIGHT_MIDDLE;
            numberOfObjects = 1;
            updateLabel("Please place right middle finger on scanner...");
        } else if (this.current_selected_index == 2) {
            this.resetLabelIcon(idv_ri_preview_label1);
            imageType = CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_INDEX;
            GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_FLAT_RIGHT_INDEX;
            numberOfObjects = 1;
            updateLabel("Please place right index finger on scanner...");
        } else if (this.current_selected_index == 1) {
            this.resetLabelIcon(idv_rt_preview_label1);
            imageType = CSD200Library.CG4ImageType.CG4_FLAT_RIGHT_THUMB;
            GREEN_BIT_FINGER_VAL=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_FLAT_RIGHT_THUMB;
            numberOfObjects = 1;
            updateLabel("Please place right thumb finger on scanner...");
        }

        this.setFingerCnt(numberOfObjects);
        this.setWhichFinger(imageType);
        System.out.println("which finger ="+imageType);
        
        if (!isFpDeviceConnected) {
            {
                updateLabel("Capture failed.");
                abortCapture();
            }
        } else {
            
        int RetVal = 0;
        this.acquisitionState = this.idle;
        if (acquisitionTimer != null) {
            acquisitionTimer.stop();
        }

        imgSx = -1;
        imgSy = -1;
        AcquisitionEnded = false;
        
        /*
        if(GREEN_BIT_FINGER_VAL!=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_SLAP_4_LEFT && GREEN_BIT_FINGER_VAL!=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_SLAP_4_RIGHT && GREEN_BIT_FINGER_VAL!=GBMSAPI_JAVA_ScannableObjects.GBMSAPI_JAVA_SO_SLAP_2_THUMBS)
        {
            GBMSAPI_Library.INSTANCE.GBMSAPI_SetClippingRegionSize(1600,1500);
        }
        else
        {
            GBMSAPI_Library.INSTANCE.GBMSAPI_SetClippingRegionSize(1000,1000);
        
        }
         */   
        
        RetVal = GBMSAPI_Library.INSTANCE.GBMSAPI_StartAcquisition(
                GREEN_BIT_FINGER_VAL,
                GBMSAPI_JAVA_AcquisitionOptions.GBMSAPI_JAVA_AO_AUTOCAPTURE,
                (GBMSAPI_JAVA_AcquisitionEventsManagerCallbackInterface) AcqCallb, Pointer.NULL,
                0, (byte) 0, (byte) 0);
        
//        if(RetVal==999)
//        {
//            AcquisitionEnded = true;
//            acquisitionState=idle;
//            acquisitionTimer = new Timer(100, taskPerformer);
//            acquisitionTimer.start();                        
//            return;
//        }
        
            IntByReference ibr=new IntByReference();
            IntByReference ibr1=new IntByReference();
            IntByReference ibr2=new IntByReference();
            IntByReference ibr3=new IntByReference();        
        
            GBMSAPI_JAVA_DLL_WRAPPER.GBMSAPI_Library.INSTANCE.GBMSAPI_GetClippingRegionPosition(ibr,ibr1,ibr2,ibr3);
            
            
            
            
            
            System.out.println("^^^^^^^^^^^^^^^ ibr ="+ibr.getValue());
            System.out.println("^^^^^^^^^^^^^^^ ibr1 ="+ibr1.getValue());
            System.out.println("^^^^^^^^^^^^^^^ ibr2 ="+ibr2.getValue());
            System.out.println("^^^^^^^^^^^^^^^ ibr3 ="+ibr3.getValue());                   

        if (RetVal != GBMSAPI_JAVA_ErrorCodes.GBMSAPI_JAVA_ERROR_CODE_NO_ERROR) {
            System.out.println("FAILURE in GBMSAPI_StartAcquisition, exit");
            this.acquisitionState = this.idle;
            
            acquisitionTimer = new Timer(100, taskPerformer);
            acquisitionState=idle;
            acquisitionTimer.start();             
            return;
        }
            this.acquisitionState = this.scannerStart;
            this.imgFromScanner = CreateBlankImage(previewX,previewY);
            FrameIsReady = true;
            this.drawImage(previewWidth,previewHeight);
//            this.bStartAcquisition.setEnabled(false);
//            this.bStopButton.setEnabled(true);
            acquisitionTimer = new Timer(100, taskPerformer);
            acquisitionTimer.start();            
        }
    }

    public void updateLabel(String txt) {
        status.setText(txt);
        this.repaint();
    }

    public void resetLabelIcon(JLabel lbl) {
        try {
            InputStream is = FingerPrintForm.class.getResourceAsStream("images.png");
            BufferedImage bufferedImage = ImageIO.read(is);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            lbl.setIcon(imageIcon);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public void resetLeftFingerIcons() {
        this.resetLabelIcon(idv_lp_preview_label1);
        this.resetLabelIcon(idv_lr_preview_label1);
        this.resetLabelIcon(idv_lm_preview_label1);
        this.resetLabelIcon(idv_li_preview_label1);
    }

    public void resetRightFingerIcons() {
        this.resetLabelIcon(idv_rp_preview_label1);
        this.resetLabelIcon(idv_rr_preview_label1);
        this.resetLabelIcon(idv_rm_preview_label1);
        this.resetLabelIcon(idv_ri_preview_label1);
    }

    public void resetThumbFingerIcons() {
        this.resetLabelIcon(idv_lt_preview_label1);
        this.resetLabelIcon(idv_rt_preview_label1);
    }

    public void setLabelIcon(JLabel lbl, FPSegment segment) {
        try {
            BufferedImage bi = ImageAndFileProcessing.ByteArrayToBufferedImage(segment.getSegData(),segment.getW(), segment.getH());
            BufferedImage scaledImage = new BufferedImage(lbl.getWidth(), lbl.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
            // Paint scaled version of image to new image
            Graphics2D graphics2D = scaledImage.createGraphics();
            graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            graphics2D.drawImage(bi, 0, 0, lbl.getWidth(), lbl.getHeight(), null);
            // clean up
            graphics2D.dispose();

            ImageIcon icon = new ImageIcon(scaledImage);
            lbl.setIcon(icon);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public void setLeftFingerIcons() {
        FPSegment[] segments = this.leftFPData.getSegments();
        this.setLabelIcon(idv_lp_preview_label1, segments[0]);
        this.setLabelIcon(idv_lr_preview_label1, segments[1]);
        this.setLabelIcon(idv_lm_preview_label1, segments[2]);
        this.setLabelIcon(idv_li_preview_label1, segments[3]);

    }

    public void setRightFingerIcons() {
        FPSegment[] segments = this.rightFPData.getSegments();
        this.setLabelIcon(idv_ri_preview_label1, segments[0]);
        this.setLabelIcon(idv_rm_preview_label1, segments[1]);
        this.setLabelIcon(idv_rr_preview_label1, segments[2]);
        this.setLabelIcon(idv_rp_preview_label1, segments[3]);
    }

    public void setThumbFingerIcons() {
        FPSegment[] segments = this.thumbFPData.getSegments();
        this.setLabelIcon(idv_lt_preview_label1, segments[0]);
        this.setLabelIcon(idv_rt_preview_label1, segments[1]);
    }

    public void setFingerCnt(int fingerCnt) {
        this.fingerCnt = fingerCnt;
    }

    public void setWhichFinger(int whichFinger) {
        this.whichFinger = whichFinger;
    }

// REM 3M ENDS    
// 3M ENDS
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        if (Defs.IS_CROSSMATCH) {

            System.exit(0);

        }

    }//GEN-LAST:event_formWindowClosed

    private void idv_lt_cap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idv_lt_cap1MouseClicked
        // TODO add your handling code here:

        setBatchIconNullExcept(6);
        if (isFpDeviceConnected) {
            greenbitManualFingerFetch();            
            idv_lt_pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 6;
            reset();
        }
    }//GEN-LAST:event_idv_lt_cap1MouseClicked

    private void idv_li_cap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idv_li_cap1MouseClicked
        // TODO add your handling code here:
        setBatchIconNullExcept(7);
        if (isFpDeviceConnected) {
            greenbitManualFingerFetch();            
            idv_li_pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 7;
            reset();
        }
    }//GEN-LAST:event_idv_li_cap1MouseClicked

    private void idv_rt_cap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idv_rt_cap1MouseClicked
        // TODO add your handling code here:
        setBatchIconNullExcept(1);
        if (this.isFpDeviceConnected) {
            greenbitManualFingerFetch();            
            idv_rt_pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 1;
            reset();
        }

    }//GEN-LAST:event_idv_rt_cap1MouseClicked

    private void idv_ri_cap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idv_ri_cap1MouseClicked
        // TODO add your handling code here:
        setBatchIconNullExcept(2);
        if (isFpDeviceConnected) {
            greenbitManualFingerFetch();            
            idv_ri_pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 2;
            reset();
        }
    }//GEN-LAST:event_idv_ri_cap1MouseClicked

    private void idv_capture_complete_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idv_capture_complete_button1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_idv_capture_complete_button1ActionPerformed

    private void idv_capture_cancel_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idv_capture_cancel_button1ActionPerformed
        // TODO add your handling code here:

        abortCapture();
        //        dispose();
    }//GEN-LAST:event_idv_capture_cancel_button1ActionPerformed

    private void idv_capture_reset_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idv_capture_reset_button1ActionPerformed
        // TODO add your handling code here:
        reset_identification_verification_finger_panel();
        startCrossmatchAutoSequenceCapture();
    }//GEN-LAST:event_idv_capture_reset_button1ActionPerformed

    private void idv_finger_print_panel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_idv_finger_print_panel1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_idv_finger_print_panel1ComponentHidden

    private void idv_finger_print_panel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_idv_finger_print_panel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_idv_finger_print_panel1ComponentShown

    private void idv_rm_cap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idv_rm_cap1MouseClicked
        // TODO add your handling code here:
        setBatchIconNullExcept(3);
        if (isFpDeviceConnected) {
            greenbitManualFingerFetch();            
            idv_rm_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 3;
            reset();
        }
    }//GEN-LAST:event_idv_rm_cap1MouseClicked

    private void idv_rr_cap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idv_rr_cap1MouseClicked
        // TODO add your handling code here:
        setBatchIconNullExcept(4);
        if (isFpDeviceConnected) {
            greenbitManualFingerFetch();
            idv_rr_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 4;
            reset();
        }
    }//GEN-LAST:event_idv_rr_cap1MouseClicked

    private void idv_rp_cap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idv_rp_cap1MouseClicked
        // TODO add your handling code here:
        setBatchIconNullExcept(5);
        if (isFpDeviceConnected) {
            greenbitManualFingerFetch();
            idv_rp_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 5;
            reset();
        }
    }//GEN-LAST:event_idv_rp_cap1MouseClicked

    private void idv_lm_cap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idv_lm_cap1MouseClicked
        // TODO add your handling code here:
            setBatchIconNullExcept(8);
            greenbitManualFingerFetch();
            idv_lm_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 8;
            System.out.println("reset called");
            reset();

    }//GEN-LAST:event_idv_lm_cap1MouseClicked

    private void idv_lr_cap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idv_lr_cap1MouseClicked
        // TODO add your handling code here:
        setBatchIconNullExcept(9);
        if (isFpDeviceConnected) {
            greenbitManualFingerFetch();
            idv_lr_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 9;
            reset();
        }
    }//GEN-LAST:event_idv_lr_cap1MouseClicked

    private void idv_lp_cap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idv_lp_cap1MouseClicked
        // TODO add your handling code here:
        setBatchIconNullExcept(10);
        if (isFpDeviceConnected) {
            greenbitManualFingerFetch();            
            idv_lp_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 10;
            reset();
        }
    }//GEN-LAST:event_idv_lp_cap1MouseClicked

    private void leftFourFingerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftFourFingerLabelMouseClicked
        // TODO add your handling code here:

        setBatchIconNullExcept(11);
        if (isFpDeviceConnected) {
            greenbitManualFingerFetch();
            showLeftFingersPointer(); // NOI18N
            current_selected_index = 11;
            reset();
        }

    }//GEN-LAST:event_leftFourFingerLabelMouseClicked

    private void rightFourFingerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightFourFingerLabelMouseClicked
        // TODO add your handling code here:
        setBatchIconNullExcept(12);
        if (isFpDeviceConnected) {
            greenbitManualFingerFetch();
            showRightFingersPointer();
            current_selected_index = 12;
            reset();
        }
    }//GEN-LAST:event_rightFourFingerLabelMouseClicked

    private void twoThumbsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoThumbsLabelMouseClicked
        // TODO add your handling code here:
        setBatchIconNullExcept(13);
        if (isFpDeviceConnected) {
            greenbitManualFingerFetch();            
            showThumbFingersPointer();
            current_selected_index = 13;
            reset();
        }
    }//GEN-LAST:event_twoThumbsLabelMouseClicked

    public void startCrossmatchAutoSequenceCapture() {

        setIconNull(0);
        System.out.println("I am called .. !"+System.currentTimeMillis());

        if (current_selected_index > 10) {
            if (BiometricNidPanel.applicationData.getWsqLl() == null || BiometricNidPanel.applicationData.getWsqLr() == null || BiometricNidPanel.applicationData.getWsqLm() == null || BiometricNidPanel.applicationData.getWsqLi() == null) {
                isAutoCapture = true;
                current_selected_index = 11;
                showLeftFingersPointer();
            }
            else if (BiometricNidPanel.applicationData.getWsqRl() == null || BiometricNidPanel.applicationData.getWsqRr() == null || BiometricNidPanel.applicationData.getWsqRm() == null || BiometricNidPanel.applicationData.getWsqRi() == null) {
                isAutoCapture = true;
                current_selected_index = 12;
                showRightFingersPointer();
            } else if (BiometricNidPanel.applicationData.getWsqLt() == null || BiometricNidPanel.applicationData.getWsqRt() == null) {
                isAutoCapture = true;
                current_selected_index = 13;
                showThumbFingersPointer();
            }
            else
                isAutoCapture=false;
            
            if(isAutoCapture)
                reset();
            return;
        }

        if ((isFpDeviceConnected) && checkFingerPrintCaptureSequenceStatus() == 1) {
            idv_rt_pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 1;
        } else if ((isFpDeviceConnected) && checkFingerPrintCaptureSequenceStatus() == 2) {
            idv_ri_pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 2;
        } else if ((isFpDeviceConnected) && checkFingerPrintCaptureSequenceStatus() == 3) {
            idv_rm_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 3;
        } else if ((isFpDeviceConnected) && checkFingerPrintCaptureSequenceStatus() == 4) {
            idv_rr_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 4;
        } else if ((isFpDeviceConnected) && checkFingerPrintCaptureSequenceStatus() == 5) {
            idv_rp_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 5;
        } else if ((isFpDeviceConnected) && checkFingerPrintCaptureSequenceStatus() == 7) {
            idv_li_pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 7;
        } else if ((isFpDeviceConnected) && checkFingerPrintCaptureSequenceStatus() == 6) {
            idv_lt_pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 6;
        } else if ((isFpDeviceConnected) && checkFingerPrintCaptureSequenceStatus() == 8) {
            idv_lm_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 8;
        } else if ((isFpDeviceConnected) && checkFingerPrintCaptureSequenceStatus() == 9) {
            idv_lr_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 9;
        } else if ((isFpDeviceConnected) && checkFingerPrintCaptureSequenceStatus() == 10) {
            idv_lp_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
            current_selected_index = 10;
        } else {
            isAutoCapture = false;
        }
        if (isAutoCapture) {
            reset();
        }
    }

    private int checkFingerPrintCaptureSequenceStatus() {

        int current_sequence = 0;

        if (BiometricNidPanel.applicationData.getWsqRt() == null) {
            isAutoCapture = true;
            current_sequence = 1;
        } else if (BiometricNidPanel.applicationData.getWsqRi() == null) {
            isAutoCapture = true;
            current_sequence = 2;
        } else if (BiometricNidPanel.applicationData.getWsqRm() == null) {
            isAutoCapture = true;
            current_sequence = 3;
        } else if (BiometricNidPanel.applicationData.getWsqRr() == null) {
            isAutoCapture = true;
            current_sequence = 4;
        } else if (BiometricNidPanel.applicationData.getWsqRl() == null) {
            isAutoCapture = true;
            current_sequence = 5;
        } else if (BiometricNidPanel.applicationData.getWsqLt() == null) {
            isAutoCapture = true;
            current_sequence = 6;
        } else if (BiometricNidPanel.applicationData.getWsqLi() == null) {
            isAutoCapture = true;
            current_sequence = 7;
        } else if (BiometricNidPanel.applicationData.getWsqLm() == null) {
            isAutoCapture = true;
            current_sequence = 8;
        } else if (BiometricNidPanel.applicationData.getWsqLr() == null) {
            isAutoCapture = true;
            current_sequence = 9;
        } else if (BiometricNidPanel.applicationData.getWsqLl() == null) {
            isAutoCapture = true;
            current_sequence = 10;
        } else {
            isAutoCapture = false;
            current_sequence = 0;
        }

        return current_sequence;
    }

    /*
     private void reset() {

     if (!Defs.IS_CROSSMATCH) {
     if (capturer.isStarted()) {
     capturer.stopCapture();
     }
     capturer.startCapture();
     } else {


     }

     }
     */
    public String syncCron() {
        String response = "";

        return response;
    }

    private void exitProgram() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0); //calling the method is a must
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FingerPrintForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FingerPrintForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FingerPrintForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FingerPrintForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        Utils.printSoapRequestResponse();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BiometricNidPanel.applicationData = new ApplicationData();
                FingerPrintForm fpView = new FingerPrintForm();
//                fpView.addWindowListener(fpView);
                filter = new FileNameExtensionFilter("Image Files", "jpg");
                fpView.setTitle("3M");
                fpView.setLocationRelativeTo(null);
                fpView.setVisible(true);
            }
        });
    }
    
    
    
    
    

    private void reset_identification_verification_finger_panel() {

        setIconNull(0);

        idv_rt_preview_label1.setIcon(null);
        idv_ri_preview_label1.setIcon(null);
        idv_rm_preview_label1.setIcon(null);
        idv_rr_preview_label1.setIcon(null);
        idv_rp_preview_label1.setIcon(null);
        idv_lt_preview_label1.setIcon(null);
        idv_li_preview_label1.setIcon(null);
        idv_lm_preview_label1.setIcon(null);
        idv_lr_preview_label1.setIcon(null);
        idv_lp_preview_label1.setIcon(null);

//        idv_rt_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/r_thumb_blue.gif")));
//        idv_ri_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/r_index_blue.gif")));
//
//        idv_lt_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/l_thumb_blue.gif")));
//        idv_li_cap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/l_index_blue.gif")));

//        if (DummyNidPanel.applicationData.getWsqRt() != null) {
//            DummyNidPanel.applicationData.setWsqRt(null);
//        }
//        if (DummyNidPanel.applicationData.getWsqRi() != null) {
//            DummyNidPanel.applicationData.setWsqRi(null);
//        }
//        if (DummyNidPanel.applicationData.getWsqLi() != null) {
//            DummyNidPanel.applicationData.setWsqLi(null);
//        }
//        if (DummyNidPanel.applicationData.getWsqLt() != null) {
//            DummyNidPanel.applicationData.setWsqLt(null);
//        }

    }

    //******************************* ALL CODES WRITTEN HERE NEED TO BE BOUGHT TO A SINGLE CLASS TO BE MODULAR ************************
    //*********************************************************************************************************************************
    

    private String setQualityCheck(String qualityImage) {

        String image_name = null;

        if (qualityImage.equalsIgnoreCase("green")) {
            image_name = "/com/perp/images/green-tick.png";
        } else if (qualityImage.equalsIgnoreCase("orange")) {
            image_name = "/com/perp/images/orange-tick.png";
        } else {
            image_name = "/com/perp/images/red-minus.png";
        }

        return image_name;

    }

    public void setIconNull(int index) {

        if (index == 1) {
            if (BiometricNidPanel.applicationData.getWsqRt() == null) {
                idv_rt_pointer.setIcon(null);
            }
        } else if (index == 2) {
            if (BiometricNidPanel.applicationData.getWsqRi() == null) {
                idv_ri_pointer.setIcon(null);
            }
        } else if (index == 3) {
            idv_rm_pointer1.setIcon(null);
        } else if (index == 4) {
            idv_rr_pointer1.setIcon(null);
        } else if (index == 5) {
            idv_rp_pointer1.setIcon(null);
        } else if (index == 6) {
            if (BiometricNidPanel.applicationData.getWsqLt() == null) {
                idv_lt_pointer.setIcon(null);
            }
        } else if (index == 7) {
            if (BiometricNidPanel.applicationData.getWsqLi() == null) {
                idv_li_pointer.setIcon(null);
            }
        } else if (index == 8) {
            idv_lm_pointer1.setIcon(null);
        } else if (index == 9) {
            idv_lr_pointer1.setIcon(null);
        } else if (index == 10) {
            idv_lp_pointer1.setIcon(null);
        } else {

            idv_rt_pointer.setIcon(null);
            idv_ri_pointer.setIcon(null);
            idv_rm_pointer1.setIcon(null);
            idv_rr_pointer1.setIcon(null);
            idv_rp_pointer1.setIcon(null);
            idv_lt_pointer.setIcon(null);
            idv_li_pointer.setIcon(null);
            idv_lm_pointer1.setIcon(null);
            idv_lr_pointer1.setIcon(null);
            idv_lp_pointer1.setIcon(null);

        }

    }

    

    public void captureCrossmatchFingerPrint(byte[] fp) {
        if (current_selected_index == 1) {
            BiometricNidPanel.applicationData.setWsqRt(fp);
        } else if (current_selected_index == 2) {
            BiometricNidPanel.applicationData.setWsqRi(fp);
        } else if (current_selected_index == 6) {
            BiometricNidPanel.applicationData.setWsqLt(fp);
        } else if (current_selected_index == 7) {
            BiometricNidPanel.applicationData.setWsqLi(fp);
        }


    }
    //*********************************************************************************************************************************
    //*********************************************************************************************************************************
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton idv_capture_cancel_button1;
    private javax.swing.JButton idv_capture_complete_button1;
    private javax.swing.JButton idv_capture_reset_button1;
    private javax.swing.JPanel idv_finger_print_panel1;
    private javax.swing.JLabel idv_li_cap1;
    private javax.swing.JLabel idv_li_pointer;
    private javax.swing.JLabel idv_li_pointer1;
    private javax.swing.JLabel idv_li_preview_label1;
    private javax.swing.JLabel idv_lm_cap1;
    private javax.swing.JLabel idv_lm_pointer1;
    private javax.swing.JLabel idv_lm_preview_label1;
    private javax.swing.JLabel idv_lp_cap1;
    private javax.swing.JLabel idv_lp_pointer1;
    private javax.swing.JLabel idv_lp_preview_label1;
    private javax.swing.JLabel idv_lr_cap1;
    private javax.swing.JLabel idv_lr_pointer1;
    private javax.swing.JLabel idv_lr_preview_label1;
    private javax.swing.JLabel idv_lt_cap1;
    private javax.swing.JLabel idv_lt_pointer;
    private javax.swing.JLabel idv_lt_pointer1;
    private javax.swing.JLabel idv_lt_preview_label1;
    private javax.swing.JLabel idv_ri_cap1;
    private javax.swing.JLabel idv_ri_pointer;
    private javax.swing.JLabel idv_ri_pointer1;
    private javax.swing.JLabel idv_ri_preview_label1;
    private javax.swing.JLabel idv_rm_cap1;
    private javax.swing.JLabel idv_rm_pointer1;
    private javax.swing.JLabel idv_rm_preview_label1;
    private javax.swing.JLabel idv_rp_cap1;
    private javax.swing.JLabel idv_rp_pointer1;
    private javax.swing.JLabel idv_rp_preview_label1;
    private javax.swing.JLabel idv_rr_cap1;
    private javax.swing.JLabel idv_rr_pointer1;
    private javax.swing.JLabel idv_rr_preview_label1;
    private javax.swing.JLabel idv_rt_cap1;
    private javax.swing.JLabel idv_rt_pointer;
    private javax.swing.JLabel idv_rt_pointer1;
    private javax.swing.JLabel idv_rt_preview_label1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel leftFourFingerLabel;
    private javax.swing.JLabel left_hand_base_label1;
    private static javax.swing.JPanel main_content_panel;
    private javax.swing.JLabel rightFourFingerLabel;
    private javax.swing.JLabel right_hand_base_label1;
    private javax.swing.JLabel status;
    private javax.swing.JLabel twoThumbsLabel;
    // End of variables declaration//GEN-END:variables

    private void idv_finger_print_panelComponentShown() {

        reset_identification_verification_finger_panel();
//        startCrossmatchAutoSequenceCapture();

    }

    private void setBatchIconNullExcept(int exceptIconIndex) {
        for (int i = 1; i < 11; i++) {
            if (i == exceptIconIndex); else {
                setIconNull(i);
            }

        }


    }

    private void showLeftFingersPointer() {
        idv_li_pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
        idv_lp_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
        idv_lm_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
        idv_lr_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
    }

    private void showRightFingersPointer() {
        idv_ri_pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
        idv_rp_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
        idv_rm_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
        idv_rr_pointer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
    }

    private void showThumbFingersPointer() {
        idv_rt_pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
        idv_lt_pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/perp/images/arrow.gif"))); // NOI18N
    }
    
    private byte[] getWsqFromRaw(FPSegment fseg)
    {
        System.out.println("wsq conversion : i am accessed");
       WSQConverter wc=new WSQConverter();
       try{
        return wc.convertToWSQ(fseg.getSegData(),fseg.getW(),fseg.getH());
       }
       catch(Throwable ex)
       {
           ex.printStackTrace();
       }   
        return null;
    }
    
    private void abortCapture()
    {
        try{
        GBMSAPI_JAVA_DLL_WRAPPER.GBMSAPI_Library.INSTANCE.GBMSAPI_StopAcquisition();
        this.acquisitionState=idle;
        }
        catch(Exception ex)
        {
            
            System.out.println("No capture was in progress");
            ex.printStackTrace();
        
        }
    }
    
    private boolean IsDeviceConnected()
    {
        isFpDeviceConnected=false;
        
        isFpDeviceConnected=GB_ExampleUtils.Global_GetCurrentDevice(); 
        if(!isFpDeviceConnected)
        {
            JOptionPane.showMessageDialog(null, "No Device is connected, or install driver", "INFO", JOptionPane.INFORMATION_MESSAGE);            
        }
        
        
        return isFpDeviceConnected;
    }

    private void greenbitManualFingerFetch() {
        abortCapture();
        if(isAutoCapture){
        manualClick=true;
            while(manualClick==true)
            {
                System.out.println("waiting for acquisitionState to be idle");
            }
        }
        manualClick=false;
    }
    
    
}