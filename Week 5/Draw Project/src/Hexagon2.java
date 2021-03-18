import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon2 {

    public static void mainDraw(Graphics graphic) {
        Scanner scanner = new Scanner(System.in);
        int hexagonSize;

        int hexagonSideSize = 32;
        int hexagonHeight = 2*heightOfSymmetricTriangle(hexagonSideSize);
        int maxHexInLineCount = maxHexesInLine(CANVAS_SIZE, hexagonSideSize);
        int lineOffset = 0;
        graphic.setColor(Color.GREEN);

        System.out.println("Zadej číslo 1 - 5: ");
        hexagonSize = scanner.nextInt();
        while (hexagonSize > maxHexInLineCount) {
            System.out.println("Sorry, já chci 1 - 5: ");
            hexagonSize = scanner.nextInt();
        }

        for (int hexes = 1; hexes <= hexagonSize; hexes++) {
            drawHexagonsLine(hexes, lineOffset, hexagonSideSize, hexagonHeight, graphic);
            lineOffset += hexagonHeight/2;
        }
        lineOffset += hexagonHeight/2;

        for (int hexes = 1; hexes <= hexagonSize-2; hexes++) {
            drawHexagonsLine(hexagonSize, lineOffset, hexagonSideSize, hexagonHeight, graphic);
            lineOffset += hexagonHeight;
        }

        for (int hexes = hexagonSize; hexes > 0; hexes--) {
            drawHexagonsLine(hexes, lineOffset, hexagonSideSize, hexagonHeight, graphic);
            lineOffset += hexagonHeight/2;
        }
    }

    public static void drawHexagonsLine(int hexesCount, int offsetY, int hexSideLength, int hexHeight, Graphics graphic) {
        int length;
        int[] arangements = new int[hexesCount];
        int[] offsetsX = new int[hexesCount];
        int centerAxle = CANVAS_SIZE/2;

        for (int i = 0; i < hexesCount; i++) {
            arangements[i] = i*2*hexSideLength + hexSideLength*i;
        }
        length = arangements[arangements.length-1] + 2*hexSideLength;
        for (int i = 0; i < hexesCount; i++) {
            offsetsX[i] = arangements[i] + centerAxle - length/2;
        }
        for (int i = 0; i < hexesCount; i++) {
            drawHexagon(hexSideLength, offsetsX[i], offsetY, graphic);
            if ((i > 0)&&(i < hexesCount)) {
                graphic.drawLine(
                        hexSideLength*2 + offsetsX[i-1],
                        offsetY + hexHeight/2,
                        hexSideLength*3 + offsetsX[i-1],
                        offsetY + hexHeight/2
                );
            }
        }
    }

    public static void drawHexagon(int hexagonSideSize, int offsetX, int offsetY, Graphics graphic) {
        int heigthOfTrianglePart = heightOfSymmetricTriangle(hexagonSideSize);
        int ax = offsetX;
        int ay = heigthOfTrianglePart + offsetY;
        int bx = hexagonSideSize/2 + offsetX;
        int by = offsetY;
        graphic.drawLine(ax, ay, bx, by);
        int cx = bx + hexagonSideSize;
        int cy = by;
        graphic.drawLine(bx, by, cx, cy);
        int dx = cx + hexagonSideSize/2;
        int dy = cy + heigthOfTrianglePart;
        graphic.drawLine(cx, cy, dx, dy);
        int ex = cx;
        int ey = 2*heigthOfTrianglePart + offsetY;
        graphic.drawLine(dx, dy, ex, ey);
        int fx = ex - hexagonSideSize;
        int fy = ey;
        graphic.drawLine(ex, ey, fx, fy);
        graphic.drawLine(fx, fy, ax, ay);
    }

    public static int heightOfSymmetricTriangle(int triangleSide) {
        double angleRad = 30 * Math.PI / 180;
        return (int) (Math.cos(angleRad) * triangleSide);
    }

    public static int maxHexesInLine(int canvasSize, int hexSideSize) {
        int result = 0;
        int numOfHexes = 0;
        int numOfSpaces;
        int width;
        while (true) {
            numOfHexes++;
            numOfSpaces = numOfHexes - 1;
            width = numOfHexes * hexSideSize*2 + numOfSpaces * hexSideSize;
            if (width < canvasSize) { result = numOfHexes; }
            else { break; }
        }
        return result;
    }

    public static int CANVAS_SIZE = 480;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("LinePlay");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(CANVAS_SIZE, CANVAS_SIZE));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            this.setBackground(Color.BLACK);
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}