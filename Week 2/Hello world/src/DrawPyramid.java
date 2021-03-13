import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number of rows:");
        int num = scanner.nextInt();

        for (int row = 1; row < (num+1); row++) {
            for (int column = 1; column < (num*2) ; column++) {
                if (row+column<=num || row+column>=num+(row*2)){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }
}