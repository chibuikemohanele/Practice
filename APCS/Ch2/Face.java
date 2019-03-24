/***************
 * Face.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Makes my face
 ****************/
 import java.applet.Applet;
import java.awt.*;
public class Face extends Applet{
    public void paint (Graphics page){
        final int WIDTH = 600;
        final int HEIGHT = 400;

        setBackground (Color.blue);
        
        Color color1 = new Color (118, 78, 17);//head
        page.setColor (color1);
        page.fillOval (125, 50, 250, 300);

        Color color2 = new Color (255, 255, 255);//white part of eye
        page.setColor (color2);
        page.fillOval (186, 125, 30, 30);
        page.setColor (color2);
        page.fillOval (284, 125, 30, 30);

        Color color3 = new Color (0, 0, 0);
        page.setColor (color3);//black part of eye
        page.fillOval (193, 132, 15, 15);
        page.setColor (color3);
        page.fillOval (292, 132, 15, 15);

        page.setColor (color1);//ears
        page.fillOval (75, 125, 95, 110);
        page.setColor (color1);
        page.fillOval (330, 127, 95, 110);
        
        page.setColor (color3);//black hair
        page.fillRect (150, 15, 200, 100);
        
        page.setColor (color2);//white part of smile
        page.fillRect (176, 250, 150, 25);
        page.setColor (color3);//black lines teeth
        page.drawLine (176, 263, 325, 263);
        page.setColor (color3);
        page.drawLine (196, 250, 196, 275);
        page.setColor (color3);
        page.drawLine (216, 250, 216, 275);
        page.setColor (color3);
        page.drawLine (236, 250, 236, 275);
        page.setColor (color3);
        page.drawLine (256, 250, 256, 275);
        page.setColor (color3);
        page.drawLine (276, 250, 276, 275);
        page.setColor (color3);
        page.drawLine (296, 250, 296, 275);
        page.setColor (color3);
        page.drawLine (316, 250, 316, 275);
        
        Color color4 = new Color (88, 55, 6);
        page.setColor (color4);//creation of the nose
        page.fillOval (212, 153, 77, 73); 
        page.setColor (color1);
        page.fillRect (212, 150, 77, 40);
    }
}