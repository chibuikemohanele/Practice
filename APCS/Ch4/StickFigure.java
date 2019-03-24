/***********
 * @author chibuikem Ohanele
 * StickFigure.java
 * Represents a graphical stick figure.
 * @version 1.0
 **********/
import java.awt.*;
public class StickFigure{
    private int baseX;
    private int baseY;
    private Color color;
    private int height;

    public StickFigure(int center, int bottom, Color shade, int size){
        baseX = center;
        baseY = bottom;
        color = shade;
        height = size;
    }
    
    public void draw(Graphics page){
        int top = baseY - height;
        page.setColor (color);
        page.drawOval (baseX-10, top, 20, 20);
        
        page.drawLine (baseX, top+20, baseX, baseY-30);
        
        page.drawLine(baseX, baseY-30, baseX-15, baseY);
        page.drawLine(baseX, baseY-30, baseX+15, baseY);
        
        page.drawLine(baseX, baseY-70, baseX-25, baseY-70);
        page.drawLine(baseX, baseY-70, baseX+25, baseY-85);
    }
}