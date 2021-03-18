import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class StarryNight {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0, WIDTH, HEIGHT);

        int numberOfStars = 200;

        for (int i = 0; i < numberOfStars; i++) {

            int randomNumber1 = (int) (Math.random() * 255);
            Color randomColor = new Color(randomNumber1, randomNumber1, randomNumber1);

            int randomSizeX = (int) (Math.random() * 310);
            int randomSizeY = (int) (Math.random() * 310);
            int squareSize = 5;
            graphics.setColor(randomColor);
            graphics.drawRect(randomSizeX, randomSizeY, squareSize, squareSize);

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