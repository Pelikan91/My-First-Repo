import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void drawImage(Graphics graphics) {
        int startx = 10;
        int starty = 10;

        for (int i = 0; i < 3; i++) {
            myThreeLines(startx, starty, graphics);
            startx = (startx + 15);
            starty = (starty - 15);
        }
    }

    public static void myThreeLines(int startx, int starty, Graphics graphics) {
        Point middle = new Point(WIDTH / 2, HEIGHT / 2);
        graphics.drawLine(startx, starty, WIDTH / 2, HEIGHT / 2);
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