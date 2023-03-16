import javax.swing.*;
import java.awt.*;

class Self_Portrait
{
   public static void main(String[] args)
   {
      PortraitFrame frame = new PortraitFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

class PortraitFrame extends JFrame
{
   public PortraitFrame()
   {
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      PortraitPanel panel = new PortraitPanel();
      getContentPane().add(panel);
   }
   public static final int DEFAULT_WIDTH = 300;
   public static final int DEFAULT_HEIGHT = 300;
}

class PortraitPanel extends JPanel
{
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);
      final int MID = 150;
      final int TOP = 50;
      Color clr=new Color(181, 101, 29);
        page.setColor(clr);

        page.drawOval(100,100,250,300);
        page.fillOval(100,100,250,300);
        page.setColor(Color.black);

        page.drawOval(160,185,40,25);
        page.fillOval(160,185,40,25);

        page.drawOval(250,185,40,25);
        page.fillOval(250,185,40,25);

        page.drawLine(240,245,240,275);
        page.drawArc(210,275,30,10,0,-180);

        page.drawArc(175,300,100,50,0,-180);

        page.fillOval(150,75,200,100);
        page.setColor(Color.black);
   }
}