import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number: ");
        int first = scanner.nextInt();
        System.out.println("Write second number: ");
        int second = scanner.nextInt();

        if (second<first){
            System.out.println("The second number should be bigger");
        } else { for (int i = first; i < second ; i++) {
            System.out.println(i);
        }
        }
    }
}