import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number:");
        int num = scanner.nextInt();

        for (int column = 0; column < num; column++) {
            for (int row = 0; row < num ; row++) {
                if (column==0 || row==0 || column==row || column==(num-1) || row==(num-1) || column==num-row-1){
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}