/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.face.faisal;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.swing.JPanel;
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
 * @author Maverick
 */
public class photoPanel extends JPanel implements Runnable, WebcamPanel.Painter{

    /**
     * Creates new form photoPanel
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
    
    
    public photoPanel() {
        initComponents();
        webcam = Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.VGA.getSize());
        panel = new WebcamPanel(webcam, false);
        System.out.println("webcam vga size="+WebcamResolution.VGA.getSize());
        panel.setPreferredSize(WebcamResolution.VGA.getSize());		
        panel.setFPSDisplayed(true);
        panel.setFPSLimited(true);
        panel.setFPSLimit(20);
        panel.setPainter(this);    
        
        
        photoCanvas = new PhotoCanvas();
        

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
        
        
        captureBtn.setActionCommand("capture");
        captureBtn.setBackground(new java.awt.Color(204, 204, 204));
        captureBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        captureBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        captureBtn.setLabel("CAPTURE");
        captureBtn.setName("captureBtn"); // NOI18N
        captureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captureBtnonCapture(evt);
            }
        });

        photoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout photoPanelLayout = new javax.swing.GroupLayout(photoPanel);
        photoPanel.setLayout(photoPanelLayout);
        photoPanelLayout.setHorizontalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photoPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(photoCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        photoPanelLayout.setVerticalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photoPanelLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(photoCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );




        captureBtn.getAccessibleContext().setAccessibleName("capture");        
        
        
        
        
        System.out.println(photoCanvas.getBounds());
        System.out.println(photoPanel.getBounds());        
        
        webcam.open(true);
        
        panel.start();
                
        painter = panel.getDefaultPainter();
                               
//        setTitle("ICAO Face Capture");
        
                
        EXECUTOR.execute(this);
                
        
        
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

        photoPanel = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        captureBtn = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();

        photoPanel.setBackground(new java.awt.Color(51, 0, 51));
        photoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout photoPanelLayout = new javax.swing.GroupLayout(photoPanel);
        photoPanel.setLayout(photoPanelLayout);
        photoPanelLayout.setHorizontalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photoPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        photoPanelLayout.setVerticalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photoPanelLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        captureBtn.setActionCommand("capture");
        captureBtn.setBackground(new java.awt.Color(204, 204, 204));
        captureBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        captureBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        captureBtn.setLabel("CAPTURE");
        captureBtn.setName("captureBtn"); // NOI18N
        captureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captureBtnonCapture(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(captureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(photoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(captureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void captureBtnonCapture(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captureBtnonCapture
        try
        {
            System.out.println(photoCanvas.getSize());
            photoCanvas.setBounds(2, 2, photoPanel.getWidth()-4, photoPanel.getHeight()-4);
            ////photoCanvas.setSize(new Dimension(200,200));
            photoCanvas.setPhotoImg(webcam.getImage());
            photoCanvas.repaint();

            panel.stop();
            panel.start();

        }catch(Exception exc)
        {
        }
    }//GEN-LAST:event_captureBtnonCapture

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private java.awt.Button captureBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel photoPanel;
    // End of variables declaration//GEN-END:variables
}
