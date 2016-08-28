/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.face.faisal;

import ImageProcessing.ImageAndFileProcessing;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.istlbd.gui.ApplicationNidPanel;
import com.istlbd.utils.Lookup;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;

import java.awt.Stroke;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.swing.ImageIcon;


import javax.swing.JFrame;


import org.openimaj.image.ImageUtilities;
import org.openimaj.image.colour.Transforms;

import org.openimaj.image.processing.face.detection.DetectedFace;
import org.openimaj.image.processing.face.detection.HaarCascadeDetector;
import org.openimaj.image.processing.face.detection.keypoints.FKEFaceDetector;
import org.openimaj.image.processing.face.detection.keypoints.FacialKeypoint;

import org.openimaj.image.processing.face.detection.keypoints.KEDetectedFace;
import org.openimaj.math.geometry.point.Point2d;
import org.openimaj.math.geometry.shape.Rectangle;
import org.openimaj.math.geometry.shape.Shape;


/**
 *
 * @author Faisal
 */
public class ICAOFaceInternalFrame extends JFrame implements Runnable, WebcamPanel.Painter  
{

    /**
     * Creates new form ICAOFace
     */
    
    private final Executor EXECUTOR = Executors.newSingleThreadExecutor();
        
    private final HaarCascadeDetector haarDetector = new HaarCascadeDetector("haarcascade_frontalface_alt.xml");
    private final FKEFaceDetector faceDetector = new FKEFaceDetector(haarDetector);

    private final Stroke STROKE = new BasicStroke(2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1.0f, new float[] { 1.0f }, 0.0f);

    private Webcam webcam = null;
    private WebcamPanel.Painter painter = null;
    private WebcamPanel panel = null;
    private PhotoCanvas photoCanvas = null;
    private List<DetectedFace> haar_faces = null;
    private List<KEDetectedFace> ked_faces = null;
    
    public int cropX,cropY,cropWidth,cropHeight;
    public static int WIDTH=320;
    public static int HEIGHT=240;

    
    public ICAOFaceInternalFrame() 
    {
        super();
                
        
        webcam = Webcam.getDefault();
        
        Dimension webcam_dimensions = new Dimension(WIDTH,HEIGHT);
        
//        webcam.setViewSize(WebcamResolution.VGA.getSize());
        webcam.setViewSize(webcam_dimensions);
        //[width=640,height=480]
        
        panel = new WebcamPanel(webcam, false);
//        panel.setPreferredSize(WebcamResolution.VGA.getSize());		
        panel.setPreferredSize(webcam_dimensions);		
        panel.setFPSDisplayed(true);
        panel.setFPSLimited(true);
        panel.setFPSLimit(20);
        panel.setPainter(this);
        
        btn_live_photo_capture = new java.awt.Button();
        panel_cropped_photo = new javax.swing.JPanel();
        photoCanvas = new PhotoCanvas();
       
        
        setResizable(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );

        btn_live_photo_capture.setActionCommand("capture");
        btn_live_photo_capture.setBackground(new java.awt.Color(204, 204, 204));
        btn_live_photo_capture.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_live_photo_capture.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_live_photo_capture.setLabel("CAPTURE");
        btn_live_photo_capture.setName("captureBtn"); // NOI18N
        btn_live_photo_capture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCapture(evt);
            }
        });

        panel_cropped_photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_cropped_photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(btn_live_photo_capture, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_cropped_photo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btn_live_photo_capture, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        btn_live_photo_capture.getAccessibleContext().setAccessibleName("capture");
                               
        pack();
                                                                                
        
        
        
        
//        System.out.println(photoCanvas.getBounds());
        System.out.println(panel_cropped_photo.getBounds());

        webcam.open(true);
        
        panel.start();
                
        painter = panel.getDefaultPainter();
                               
        setTitle("ICAO Face Capture");
        
                
        EXECUTOR.execute(this);
        
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        WindowListener exitListener = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            webcam.close();
        }};        
        this.addWindowListener(exitListener);
    }

    @Override
	public void run() 
        {
		while (true) 
                {
                    if (!webcam.isOpen()) 
                    {
                            continue;
                            ////return;
                    }
                    
                    try
                    {
                        BufferedImage bi = webcam.getImage();                                                                                               
                        ked_faces = faceDetector.detectFaces(Transforms.calculateIntensity(ImageUtilities.createMBFImage(bi, true)));                        
                        haar_faces = haarDetector.detectFaces(Transforms.calculateIntensity(ImageUtilities.createMBFImage(bi, true)));                            
                    }catch(Exception exc)
                    {
                    }
		}
	}

	@Override
	public void paintPanel(WebcamPanel panel, Graphics2D g2) 
        {                   
            
		if (painter != null) 
                {
			painter.paintPanel(panel, g2);
		}
	}
        
        
	@Override
	public void paintImage(WebcamPanel panel, BufferedImage image, Graphics2D g2) 
        {
             

		if (painter != null) 
                {                                                                                                                        
			painter.paintImage(panel, image, g2);
		}

		if (haar_faces==null) return;
		
                
                                                                
                Iterator<DetectedFace> dfi1 = haar_faces.iterator();
                while(dfi1.hasNext())
                {
                        DetectedFace face = dfi1.next();
                        
                        Rectangle bounds = face.getBounds();

			int dx = (int) (0.1 * bounds.width);
			int dy = (int) (0.2 * bounds.height);
			int x = (int) bounds.x - dx;
			int y = (int) bounds.y - dy;
			int w = (int) bounds.width + 2 * dx;
			int h = (int) bounds.height + dy;
                        
                        if(x-50>0)
                            cropX=x-50;
                        if(y-50>0)
                            cropY=y-50;
                        cropWidth=w+100;
                        cropHeight=h+100;
			
			g2.setStroke(STROKE);
			g2.setColor(Color.RED);
			g2.drawRect(x, y, w, h);
                }
                
               
                ///ked_faces = faceDetector.detectFaces(Transforms.calculateIntensity(ImageUtilities.createMBFImage(image, true)));
                
                if(ked_faces==null) return;
                
		Iterator<KEDetectedFace> dfi2 = ked_faces.iterator();
		while (dfi2.hasNext()) 
                {
                        
			KEDetectedFace face = dfi2.next();
                        Shape transBounds=face.getBounds();                        			                                                                                                                        
                        
                        FacialKeypoint[] fkp_arr = face.getKeypoints();
                                        
                        
                        for(FacialKeypoint fkp:fkp_arr)
                        {                           
                                                            
                                Point2d p2d = fkp.position.clone();
                                p2d.translate((float)transBounds.minX(), (float)transBounds.minY());
                                Color prevColor = g2.getColor();
                                g2.setColor(new Color(0,255,0));
                                g2.drawRect( (int)(p2d.getX()-2), (int)(p2d.getY()-2), 4, 4);
                                g2.setColor(prevColor);                                                                                                                                                                                                                    
                        }
                                                                        
		}
                
                
	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_live_photo_capture_preview = new javax.swing.JPanel();
        btn_live_photo_capture = new java.awt.Button();
        panel_cropped_photo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_live_photo_capture_preview.setMaximumSize(new java.awt.Dimension(320, 240));
        panel_live_photo_capture_preview.setMinimumSize(new java.awt.Dimension(320, 240));
        panel_live_photo_capture_preview.setPreferredSize(new java.awt.Dimension(320, 240));
        panel_live_photo_capture_preview.setLayout(null);
        getContentPane().add(panel_live_photo_capture_preview, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 320, 240));

        btn_live_photo_capture.setActionCommand("capture");
        btn_live_photo_capture.setBackground(new java.awt.Color(204, 204, 204));
        btn_live_photo_capture.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_live_photo_capture.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_live_photo_capture.setLabel("CAPTURE");
        btn_live_photo_capture.setName("btn_live_photo_capture"); // NOI18N
        btn_live_photo_capture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCapture(evt);
            }
        });
        getContentPane().add(btn_live_photo_capture, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 160, 44));
        btn_live_photo_capture.getAccessibleContext().setAccessibleName("capture");

        panel_cropped_photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panel_cropped_photo.setMaximumSize(new java.awt.Dimension(160, 190));
        panel_cropped_photo.setMinimumSize(new java.awt.Dimension(160, 190));
        panel_cropped_photo.setPreferredSize(new java.awt.Dimension(160, 190));

        javax.swing.GroupLayout panel_cropped_photoLayout = new javax.swing.GroupLayout(panel_cropped_photo);
        panel_cropped_photo.setLayout(panel_cropped_photoLayout);
        panel_cropped_photoLayout.setHorizontalGroup(
            panel_cropped_photoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );
        panel_cropped_photoLayout.setVerticalGroup(
            panel_cropped_photoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        getContentPane().add(panel_cropped_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 160, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onCapture(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCapture
        try
        {
            System.out.println(photoCanvas.getSize());
            photoCanvas.setBounds(2, 2, panel_cropped_photo.getWidth()-4, panel_cropped_photo.getHeight()-4);
            ////photoCanvas.setSize(new Dimension(200,200));
            photoCanvas.setPhotoImg(webcam.getImage().getSubimage(cropX,cropY,cropWidth,cropHeight));
            
//          int finalCropX=0,finalCropY=0,finalCropWidth=0,finalCropHeight=0;
//           if(cropX-50>0)
//                finalCropX=cropX-50;
//            if(cropY-50>0)
//                finalCropY=cropY-50;
//            finalCropWidth=cropWidth+100;
//            finalCropHeight=cropHeight+100;
            
            ApplicationNidPanel.lbl_photo.setText(null);
            ApplicationNidPanel.lbl_photo.setIcon(new ImageIcon(webcam.getImage().getSubimage(cropX,cropY,cropWidth,cropHeight).getScaledInstance(ApplicationNidPanel.lbl_photo.getWidth(),ApplicationNidPanel.lbl_photo.getHeight(),java.awt.Image.SCALE_DEFAULT)));

//            ApplicationNidPanel.applicationData.setPhoto(ImageAndFileProcessing.BufferedImageToByteArray(webcam.getImage().getSubimage(cropX,cropY,cropWidth,cropHeight),"BMP"));
            
            photoCanvas.repaint();            
            panel.stop();            
            panel.start();
            
            
            
        }catch(Exception exc)
        {
        }
    }//GEN-LAST:event_onCapture

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ICAOFaceInternalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ICAOFaceInternalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ICAOFaceInternalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ICAOFaceInternalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ICAOFaceInternalFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_live_photo_capture;
    private javax.swing.JPanel panel_cropped_photo;
    private javax.swing.JPanel panel_live_photo_capture_preview;
    // End of variables declaration//GEN-END:variables
}
