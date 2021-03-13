import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dear farmer, how many chickens you have?");
        int chickens = scanner.nextInt();
        chickens *= 2;

        System.out.println("And how many pigs you have?");
        int pigs = scanner.nextInt();
        pigs *= 4;

        int legs = pigs + chickens;

        System.out.println("Your animals have " + legs + " legs.");
    }
}
