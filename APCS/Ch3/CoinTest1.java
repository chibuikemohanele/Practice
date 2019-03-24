
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CoinTest1 extends JPanel
   implements ActionListener
{
  private Coin1 coin;

  public CoinTest1 ()
  {
    Image heads = (new ImageIcon("youngnaruto.jpeg")).getImage();
    Image tails = (new ImageIcon("oldernaruto.jpeg")).getImage();
    Image anime1 = (new ImageIcon("hinatanaruto.jpeg")).getImage();
    coin = new Coin1(heads, tails, anime1);

    Timer clock = new Timer(500, this);
    clock.start();
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = getWidth() / 2;
    int y = getHeight() / 2;
    coin.draw(g, x, y);
  }

  public void actionPerformed(ActionEvent e)
  {
    coin.flip();
    repaint();
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Flipping coin");
    w.setSize(600, 600);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    CoinTest1 panel = new CoinTest1();
    panel.setBackground(Color.WHITE);
    Container c = w.getContentPane();
    c.add(panel);

    w.setVisible(true);
  }
}
