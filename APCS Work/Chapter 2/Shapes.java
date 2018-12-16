/***************
 * Shapes.java
 * @author Chibuikem Ohanele
 * @version 1.0
 * Draws shapes and fills those shapes with colors
 ****************/
import javax.swing.JApplet;
import java.awt.*;

public class Shapes extends JApplet
{
    public void init()
    {
        // Set the background color	
        getContentPane().setBackground (Color.yellow);
    }

    public void paint (Graphics page)
    {
        // Declare size constants
        final int MAX_SIZE = 300;
        final int PAGE_WIDTH = 600;
        final int PAGE_HEIGHT = 400;

        // Declare variables
        int x, y;    // x and y coordinates of upper left-corner of each shape
        int width, height; // width and height of each shape 

        super.paint(page);
        page.setColor (Color.blue); // Set the color for the next shape to be drawn
        x = 50;// Assign the corner point and width and height
        y = 40;
        width = 100;
        height = 200;
        page.fillRect(x, y, width, height);// Draw the rectangle
        
        page.setColor (Color.red);
        x = 50;
        y = 40;
        width = 100;
        height = 150;
        page.fillOval(x, y, width, height);
        
        page.setColor (Color.black);
        x = 25;
        y= 120;
        width = 200;
        height = 40;
        page.fillRect (x, y, width, height);
        
        page.setColor (Color.white);
        x = 100;
        y = 300;
        width = 50;
        height = 100;
        page.fillOval (x, y, width, height);
      
    }
}
