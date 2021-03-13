import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many girls came:");
        int girls = scanner.nextInt();
        System.out.println("Write how many boys came:");
        int boys = scanner.nextInt();

        if (girls==0){
            System.out.println("Sausage party");
        } else if (girls==boys && girls+boys>20){
            System.out.println("The party is excellent");
        } else if (girls+boys>20 && boys!=girls){
            System.out.println("Quite a cool party!");
        } else if (girls+boys<20){
            System.out.println("Average party...");
        }
    }
}