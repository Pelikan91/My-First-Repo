import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.green);
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = HEIGHT / 2;
        drawFunc1Q(x1, y1, x2, y2, graphics);
        graphics.setColor(Color.magenta);
        x1 = HEIGHT / 2;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        drawFunc1Q(x1, y1, x2, y2, graphics);
        graphics.setColor(Color.RED);
        x1 = HEIGHT / 2;
        y1 = 0;
        x2 = HEIGHT / 2;
        y2 = HEIGHT / 2;
        drawFunc2Q(x1, y1, x2, y2, graphics);
        graphics.setColor(Color.black);
        x1 = HEIGHT;
        y1 = 0;
        x2 = HEIGHT / 2;
        y2 = 0;
        drawFunc2Q(x1, y1, x2, y2, graphics);
        graphics.setColor(Color.BLUE);
        x1 = HEIGHT / 2;
        y1 = HEIGHT / 2;
        x2 = 0;
        y2 = HEIGHT / 2;
        drawFunc3Q(x1, y1, x2, y2, graphics);
        graphics.setColor(Color.YELLOW);
        x1 = 0;
        y1 = HEIGHT / 2;
        x2 = 0;
        y2 = HEIGHT;
        drawFunc3Q(x1, y1, x2, y2, graphics);
        graphics.setColor(Color.CYAN);
        x1 = HEIGHT / 2;
        y1 = HEIGHT / 2;
        x2 = HEIGHT / 2;
        y2 = HEIGHT;
        drawFunc4Q(x1, y1, x2, y2, graphics);
        graphics.setColor(Color.DARK_GRAY);
        x1 = HEIGHT;
        y1 = HEIGHT / 2;
        x2 = HEIGHT / 2;
        y2 = HEIGHT / 2;
        drawFunc4Q(x1, y1, x2, y2, graphics);
    }

    public static void drawFunc1Q(int x1, int y1, int x2, int y2, Graphics graphics) {
        for (int i = 0; i < HEIGHT; i++) {
            x2 += 5;
            y1 += 5;
            if (y1 < HEIGHT / 2 && x2 < HEIGHT / 2) {
                graphics.drawLine(x1, y1, x2, y2);
            }
        }
    }

    public static void drawFunc3Q(int x1, int y1, int x2, int y2, Graphics graphics) {
        for (int i = 0; i < HEIGHT; i++) {
            x2 += 5;
            y1 += 5;
            if (y1 < HEIGHT && x2 < HEIGHT / 2) {
                graphics.drawLine(x1, y1, x2, y2);
            }
        }
    }

    public static void drawFunc2Q(int x1, int y1, int x2, int y2, Graphics graphics) {
        for (int i = 0; i < HEIGHT; i++) {
            x2 += 5;
            y1 += 5;
            if (y1 < HEIGHT / 2 && x2 < HEIGHT) {
                graphics.drawLine(x1, y1, x2, y2);
            }
        }
    }

    public static void drawFunc4Q(int x1, int y1, int x2, int y2, Graphics graphics) {
        for (int i = 0; i < HEIGHT; i++) {
            x2 += 5;
            y1 += 5;
            if (y1 < HEIGHT && x2 < HEIGHT) {
                graphics.drawLine(x1, y1, x2, y2);
            }
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
            mainDraw(graphics);
        }
    }
}