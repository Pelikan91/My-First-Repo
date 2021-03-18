import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics){

        int numberOfLines = 21;

        leftSideLine(numberOfLines, graphics);
        rightSideLine(numberOfLines, graphics);
        bottomSideLine(numberOfLines, graphics);

    }

    private static void bottomSideLine(int numberOfLines, Graphics graphics) {

        int bottomSideLineX1= 0;
        int bottomSideLineY1= 320;
        int bottomSideLineX2= 210;
        int bottomSideLineY2= 320;
        for (int i = 0; i < numberOfLines; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawLine(bottomSideLineX1, bottomSideLineY1, bottomSideLineX2, bottomSideLineY2);
            bottomSideLineX1 += 5;
            bottomSideLineY1 -= 10;
            bottomSideLineX2 -=5;
            bottomSideLineY2 -=10;

        }
    }

    private static void rightSideLine(int numberOfLines, Graphics graphics) {
        int rightSideLineX1= 210;
        int rightSideLineY1= 320;
        int rightSideLineX2= 105;
        int rightSideLineY2= 110;
        for (int i = 0; i < numberOfLines; i++) {

            graphics.setColor(Color.BLACK);
            graphics.drawLine(rightSideLineX1, rightSideLineY1, rightSideLineX2, rightSideLineY2);
            rightSideLineX1 -= 10;
            rightSideLineX2 -= 5;
            rightSideLineY2 += 10;
        }
    }

    private static void leftSideLine(int numberOfLines, Graphics graphics) {
        int leftSideLineX1= 0;
        int leftSideLineY1= 320;
        int leftSideLineX2= 105;
        int leftSideLineY2= 110;

        for (int i = 0; i < numberOfLines; i++) {
            graphics.setColor(Color.BLACK);
            graphics.drawLine(leftSideLineX1, leftSideLineY1, leftSideLineX2, leftSideLineY2 );

            leftSideLineX1 += 10;
            leftSideLineX2 += 5;
            leftSideLineY2 += 10;
        }
    }
    // Don't touch the code below
    static int WIDTH = 215;
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