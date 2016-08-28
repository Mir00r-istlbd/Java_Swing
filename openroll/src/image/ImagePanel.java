/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel
{

    private BufferedImage image;

    public ImagePanel() {
       try 
       {                
          image = ImageIO.read(getClass().getResource("/image/form3.jpg"));
       } 
       catch (IOException ex) 
       {
            // handle exception...
       }
    }

    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters            
        g.setFont(new Font("TimesRoman", Font.PLAIN,12)); 
        g.setColor(Color.black);
        g.drawString("Copyright © ISTLBD LTD 2016",600,630);
    }

}