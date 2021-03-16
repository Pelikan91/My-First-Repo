import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void drawImage(Graphics graphics) {

        for (int verticalCoor = 0; verticalCoor <= HEIGHT / 20; verticalCoor++) {
            drawLine(0, verticalCoor * 20, graphics);
            drawLine(WIDTH, verticalCoor * 20, graphics);
        }
        for (int horizontalCoor = 0; horizontalCoor <= WIDTH / 20; horizontalCoor++) {
            drawLine(horizontalCoor * 20, 0, graphics);
            drawLine(horizontalCoor * 20, HEIGHT, graphics);
        }
    }

    public static void drawLine(int x, int y, Graphics graphics) {
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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