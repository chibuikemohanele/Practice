import java.awt.Image;
import java.awt.Graphics;

public class Coin1
{
    private Image p1, p2, p3;
    int side;
    public Coin1(Image pic1, Image pic2, Image pic3)
    {
        p1 = pic1;
        p2 = pic2;
        p3 = pic3;
        side = 1;
    }

    public void flip()
    {
        side++;
        if (side > 3)
        side = 1;
    }

    public void draw(Graphics g, int x, int y)
    {
        if (side == 1)
        {
            int w = p1.getWidth(null);
            int h = p1.getHeight(null);
            g.drawImage(p1, x - w /2, y - h/2, null);
        }
        else if (side == 2)
        { 
            int w = p2.getWidth(null);
            int h = p2.getHeight(null);
            g.drawImage(p2, x - w /2, y - h/2, null);
        }
        else
        {
            int w = p3.getWidth(null);
            int h = p3.getHeight(null);
            g.drawImage(p3, x - w /2, y - h/2, null);
        }
    }
}
