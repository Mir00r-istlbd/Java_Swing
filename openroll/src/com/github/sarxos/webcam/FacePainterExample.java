package com.github.sarxos.webcam;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import org.openimaj.image.FImage;

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
 * Paint troll smile on all detected faces.
 * 
 * @author Bartosz Firyn (SarXos)
 */
public class FacePainterExample extends JFrame implements Runnable, WebcamPanel.Painter 
{

	private static final long serialVersionUID = 1L;

	private static final Executor EXECUTOR = Executors.newSingleThreadExecutor();
        
	private static final HaarCascadeDetector haarDetector = new HaarCascadeDetector("haarcascade_frontalface_alt.xml");
        private static final FKEFaceDetector faceDetector = new FKEFaceDetector(haarDetector);
        
	private static final Stroke STROKE = new BasicStroke(2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1.0f, new float[] { 1.0f }, 0.0f);

	private Webcam webcam = null;
	private WebcamPanel.Painter painter = null;
        private WebcamPanel panel = null;
	private List<DetectedFace> haar_faces = null;
        private List<KEDetectedFace> ked_faces = null;
        	
        
	public FacePainterExample() throws IOException 
        {
		super();                                                		
                
                
                
		webcam = Webcam.getDefault();
		webcam.setViewSize(WebcamResolution.VGA.getSize());
		webcam.open(true);
                
                
		panel = new WebcamPanel(webcam, false);
		panel.setPreferredSize(WebcamResolution.VGA.getSize());		
		panel.setFPSDisplayed(true);
		panel.setFPSLimited(true);
		panel.setFPSLimit(20);
		panel.setPainter(this);
		panel.start();
                
                
		painter = panel.getDefaultPainter();

		add(panel);

		setTitle("ICAO Face Capture");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);

		EXECUTOR.execute(this);
	}

	@Override
	public void run() 
        {
		while (true) 
                {
			if (!webcam.isOpen()) 
                        {
				return;
			}
                        
                        
                        BufferedImage bi = webcam.getImage();                                                                                               
                        ked_faces = faceDetector.detectFaces(Transforms.calculateIntensity(ImageUtilities.createMBFImage(bi, true)));                        
                        haar_faces = haarDetector.detectFaces(Transforms.calculateIntensity(ImageUtilities.createMBFImage(bi, true)));                            
                                                
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

	public static void main(String[] args) throws IOException 
        {
		new FacePainterExample();
	}
}
