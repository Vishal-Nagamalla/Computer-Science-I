import javax.swing.*;
import java.awt.*;

class Snowman
{
   public static void main(String[] args)
   {
      SnowmanFrame frame = new SnowmanFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

/**
   A frame that contains a message panel
*/
class SnowmanFrame extends JFrame
{
   public SnowmanFrame()
   {
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      SnowmanPanel panel = new SnowmanPanel();
      getContentPane().add(panel);
   }
   public static final int DEFAULT_WIDTH = 300;
   public static final int DEFAULT_HEIGHT = 300;
}

class SnowmanPanel extends JPanel
{
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);
      final int MID = 150;
      final int TOP = 50;

      setBackground (Color.cyan);

      page.setColor (Color.white);
      page.fillOval (MID-20, TOP, 40, 40);
      page.fillOval (MID-35, TOP+35, 70, 50);
      page.fillOval (MID-50, TOP+80, 100, 60);

      page.setColor (Color.black);
      page.fillOval (MID-10, TOP+10, 5, 5);
      page.fillOval (MID+5, TOP+10, 5, 5);

      page.drawArc (MID-10, TOP+20, 20, 10, 190, 160);

      page.drawLine (MID-25, TOP+60, MID-50, TOP+40);
      page.drawLine (MID+25, TOP+60, MID+50, TOP+40);

      page.drawLine (MID-20, TOP+5, MID+20, TOP+5);
      page.fillRect (MID-15, TOP-20, 30, 25);
   }
}