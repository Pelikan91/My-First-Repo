import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me 6 integers in row, please");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        int number6 = scanner.nextInt();

        int sum = (number1 + number2 + number3 + number4 + number5 + number6);

        System.out.println("Sum: " + sum);

        int average = sum;
        average /= 6;
        System.out.println("average: " + average);
    }
}
