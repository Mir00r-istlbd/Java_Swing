package com.istlbd.scanner.wrapper;

import com.istlbd.gui.ApplicationNidPanel;
import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import com.istlbd.gui.Scanner;

import com.istlbd.utils.Lookup;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import netscape.javascript.JSObject;
import org.apache.commons.codec.binary.Base64;

public class TwainScannerJFrame {

    public TwainLibrary tLib = null;
    public int resouce_cnt = 0;
    public boolean twain_available = false;
    public Vector resource_list;
    byte[] imgData = null;
    JSObject window;

    public TwainScannerJFrame() {
    }

    public void init() {
        Native.setProtected(true);
        try {
            this.tLib = MyScannerLibraryLoader.getTwainLibrary();
        } catch (Exception e) {
            System.out.println("Could not load twain library>>>" + e);
        }
        this.resource_list = new Vector();
    }

    public void start() {
        try {
            loadTwainResources();
        } catch (Throwable t) {
        }
    }

    public void stop() {
    }

    public void loadTwainResources() throws Throwable {
        this.resource_list.clear();
        if (this.tLib != null) {
            this.twain_available = (this.tLib.isTwainAvailble() == 1);
            if (this.twain_available) {
                PointerByReference pRef1 = new PointerByReference();
                IntByReference sz = new IntByReference();
                this.resouce_cnt = this.tLib.getAvailableSources(pRef1, sz);
                if (this.resouce_cnt > 0) {
                    String ss = pRef1.getValue().getString(0L);
                    String[] parts = ss.split("\\|");
                    for (String kk : parts) {
                        this.resource_list.add(kk);
                    }
                }
            }
        }
    }

    public void startCapture(boolean side1) throws Throwable {
        if (!this.twain_available) {
            return;
        }

        PointerByReference pRef = new PointerByReference();
        for (int kk = 0; kk < this.resource_list.size(); kk++) {
            if (((String) this.resource_list.get(kk)).equalsIgnoreCase("CanoScan LiDE 110")) {
                this.tLib.acquire2((String) this.resource_list.get(kk), pRef);
                String imgName = pRef.getValue().getString(0L);
                DataInputStream dis = new DataInputStream(new FileInputStream(imgName));
                this.imgData = new byte[dis.available()];
                dis.readFully(this.imgData);
                
                InputStream in = new ByteArrayInputStream(this.imgData);
		BufferedImage bImageFromConvert = ImageIO.read(in);
//                ImageIO.write(bImageFromConvert, "jpg", new File("D:/img/scan.jpg"));
                ImageIcon iic=new ImageIcon(bImageFromConvert.getScaledInstance(Scanner.scannedJLabelSide1.getWidth(),Scanner.scannedJLabelSide1.getHeight(),java.awt.Image.SCALE_DEFAULT));

                if(side1)
                {
                    Scanner.scannedJLabelSide1.setIcon(iic);                
                    
                    if(Scanner.cmb_attachment_type.getSelectedItem().toString().equalsIgnoreCase(Scanner.TYPE_CITIZENSHIP))
                    {
                        ApplicationNidPanel.applicationData.setCitizenshipAttachment1(imgData);
                    }
                    else if(Scanner.cmb_attachment_type.getSelectedItem().toString().equalsIgnoreCase(Scanner.TYPE_MARRIAGE))
                    {
                        ApplicationNidPanel.applicationData.setMarriageAttachment1(imgData);;
                    }
                    else if(Scanner.cmb_attachment_type.getSelectedItem().toString().equalsIgnoreCase(Scanner.TYPE_TRANSFER))
                    {
                        ApplicationNidPanel.applicationData.setTransferAttachment1(imgData);
                    }
                    else if(Scanner.cmb_attachment_type.getSelectedItem().toString().equalsIgnoreCase(Scanner.TYPE_UTILITY))
                    {
                        ApplicationNidPanel.applicationData.setUtilityAttachment1(imgData);
                    }
                    else if(Scanner.cmb_attachment_type.getSelectedItem().toString().equalsIgnoreCase(Scanner.TYPE_OTHER))
                    {
                        ApplicationNidPanel.applicationData.setOtherAttachment1(imgData);
                    }
                }
                else
                {
                    Scanner.scannedJLabelSide2.setIcon(iic);  
                    if(Scanner.cmb_attachment_type.getSelectedItem().toString().equalsIgnoreCase(Scanner.TYPE_CITIZENSHIP))
                    {
                        ApplicationNidPanel.applicationData.setCitizenshipAttachment2(imgData);
                    }
                    else if(Scanner.cmb_attachment_type.getSelectedItem().toString().equalsIgnoreCase(Scanner.TYPE_MARRIAGE))
                    {
                        ApplicationNidPanel.applicationData.setMarriageAttachment2(imgData);;
                    }
                    else if(Scanner.cmb_attachment_type.getSelectedItem().toString().equalsIgnoreCase(Scanner.TYPE_TRANSFER))
                    {
                        ApplicationNidPanel.applicationData.setTransferAttachment2(imgData);
                    }
                    else if(Scanner.cmb_attachment_type.getSelectedItem().toString().equalsIgnoreCase(Scanner.TYPE_UTILITY))
                    {
                        ApplicationNidPanel.applicationData.setUtilityAttachment2(imgData);
                    }
                    else if(Scanner.cmb_attachment_type.getSelectedItem().toString().equalsIgnoreCase(Scanner.TYPE_OTHER))
                    {
                        ApplicationNidPanel.applicationData.setOtherAttachment2(imgData);
                    }                    
                }
                
            }
        }
    }

    public void destroy() {
    }

    public void getImagePath() {
//    this.window = JSObject.getWindow(this);

        AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                TwainLibrary tLib = null;

                tLib = MyScannerLibraryLoader.getTwainLibrary();
                System.out.println("Library Loaded....");
                if (tLib.isTwainAvailble() == 1) {
                    System.out.println("Twain Available : " + tLib.isTwainAvailble());
                    PointerByReference pRef1 = new PointerByReference();
                    IntByReference sz = new IntByReference();
                    int res_cnt = tLib.getAvailableSources(pRef1, sz);

                    System.out.println("Resource Count : " + res_cnt);
                    System.out.println("String Length : " + sz.getValue());

                    PointerByReference pRef2 = new PointerByReference();
                    tLib.acquire2("CanoScan LiDE 110", pRef2);

                    System.out.println("Output : " + pRef2.getValue().getString(0L));
                    printPath(pRef2.getValue().getString(0L));
                }

                return null;
            }

            public void printPath(String pp) {
                System.out.println("from final print:" + pp);
                File _file = new File(pp);
                try {
                    FileInputStream imageInFile = new FileInputStream(_file);
                    byte[] imageData = new byte[(int) _file.length()];
                    imageInFile.read(imageData);
                    System.out.println("Original Image Data:" + imageData);
                    byte[] imageDataString = Base64.encodeBase64(imageData);
                    String encodedStr = new String(imageDataString);
                    System.out.println("Endoced String:" + encodedStr);
                    TwainScannerJFrame.this.window.setMember("pathVal", pp);

                    TwainScannerJFrame.this.window.call("setter", new Object[]{encodedStr});
                } catch (Exception ex) {
                }
            }
        });
    }

    public static void main(String[] args) {
        
        String devStr="|CanoScan LiDE 110|WIA-WIA CanoScan LiDE 110";
        String[] devices=devStr.split("\\|");
        
        for(int i=0;i<devices.length;i++)
            System.out.println(devices[i]);
        System.out.println("total ="+devices.length);
        
        try {
            TwainScannerJFrame tj = new TwainScannerJFrame();
            tj.init();
            tj.start();

            for (int kk = 0; kk < tj.resource_list.size(); kk++) {
                System.out.println("device "+kk+":"+((String) tj.resource_list.get(kk)).equalsIgnoreCase("HP Scanjet G3110 TWAIN"));
                    
                
            }
            tj.startCapture(true);
        } catch (Throwable ex) {
            Logger.getLogger(TwainScannerJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
