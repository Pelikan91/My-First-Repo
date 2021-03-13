import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a first number:");
        int fir = scanner.nextInt();
        System.out.println("Write a second number:");
        int sec = scanner.nextInt();
        if (fir < sec){
            System.out.println(sec);
        } else {
            System.out.println(fir);
        }
    }
}