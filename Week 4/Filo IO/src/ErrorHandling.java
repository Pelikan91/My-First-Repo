import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();

        try {
            int result = 12 / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }
}