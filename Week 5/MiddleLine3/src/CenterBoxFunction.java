import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {
    public static void drawImage(Graphics graphics){

        int sqSize = 50;

        for (int i = 0; i < 4; i++) {
            drawSquare(sqSize, graphics);
            sqSize *=2;
        }
    }

    public static void drawSquare(int squareSize, Graphics graphics){
        graphics.drawRect(WIDTH/2-squareSize/2, HEIGHT/2-squareSize/2, squareSize, squareSize);
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