import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();

        int result = 12 / divisor;
        System.out.println(result);

        try {
            int i = 0 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}