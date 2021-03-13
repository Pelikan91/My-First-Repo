import java.util.Scanner;

class GuesTheNumber {
    public static void main(String[] args) {
        int num = 52;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number!");
        int guess = scanner.nextInt();
        while (num!=guess){
            if (num<guess){
                System.out.println("The stored nuber is smaller");
            } else if (num>guess) {
                System.out.println("The stored number is higher.");
            }
            System.out.println("Guess the number again!");
            guess = scanner.nextInt();
        }
        System.out.println("You found the number: "+num);
    }

}