import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
    public static void drawImage(Graphics graphics){

        Random random = new Random();
        int x = random.nextInt(20);
        int y = random.nextInt(20);

        for (int i = 0; i < 4; i++) {
            int w = random.nextInt(50);
            int h = random.nextInt(50);
            Color myColor = new Color(x, y, w*3);
            graphics.setColor(myColor);
            graphics.drawRect(x,y,w+10,h+10);
            x += 60;
            y += 60;
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