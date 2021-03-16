import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void drawImage(Graphics graphics) {

        Point[] p1 = {
                new Point(10,10),
                new Point(290,10),
                new Point(290,290),
                new Point(10,290),
                new Point(10,10)
        };

        Point[] p2= {
                new Point(50,100),
                new Point(70,70),
                new Point(80,90),
                new Point(90,90),
                new Point(100,70),
                new Point(120,100),
                new Point(120,100),
                new Point(85,130),
                new Point(50,100),
        };

        connect(p1, graphics);
        connect(p2, graphics);

    }
    public static void connect(Point[] points, Graphics graphics){
        graphics.setColor(Color.green);
        for (int counter = 0; counter < points.length-1; counter++) {
            graphics.drawLine(points[counter].x, points[counter].y, points[counter+1].x, points[counter+1].y);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}