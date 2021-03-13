import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number of parameters:");
        double num = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Write parameter");
            int par = scanner.nextInt();
            sum = sum + par;
        }

        double av = sum/num;
        System.out.println("Sum = "+sum+" Average = "+av);
    }
}