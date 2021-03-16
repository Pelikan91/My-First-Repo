import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawImage(Graphics graphics) {

        Color indigo = new Color(75, 0, 130);
        Color violet = new Color(143, 0, 255);
        Color[] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, indigo, violet};
        int a = 300;

        for (int i = 0; i < 7; i++) {
            a = a - 30;
            fillSquare(a, colors[i], graphics);
        }
    }

    public static void fillSquare(int size,Color color, Graphics graphics ){
        graphics.setColor(color);
        graphics.fillRect(WIDTH/2-size/2,HEIGHT/2-size/2 , size, size);
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