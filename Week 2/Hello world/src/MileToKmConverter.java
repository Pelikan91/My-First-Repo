import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter yout distance in miles");
        double distance = scanner.nextDouble();
        distance *= 1.609344;
        System.out.println("Your distance in kilometers " + distance);
    }
}
