import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        System.out.println("Write a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num%2==0) {
            for (int row = 1; row < num / 2 + 1; row++) {
                System.out.println(" ");
                for (int column = 1; column < num + 1; column++) {
                    if (row + column >= num / 2 + 1 && row + column < num / 2 + row * 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
            for (int row = num/2+1; row < num+1; row++) {
                for (int column = 1; column < num + 1; column++) {
                    if (row + column >= row * 2 - num/2 && row + column <= num * 2 - num / 2) {
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            for (int row = 1; row <= num / 2; row++) {
                System.out.println(" ");
                for (int column = 1; column <= num + 1; column++) {
                    if ((row + column >= num / 2 + 2 && row + column <= (num / 2) + row * 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println("");
            for (int row = num / 2 + 2; row < num + 1; row++) {
                for (int column = 1; column < num + 1; column++) {
                    if (row + column >= row * 2 - num / 2 && row + column <= num * 2 - num / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}