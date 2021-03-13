import java.io.*;
import java.util.Scanner;

public class CountLines {

    public static void main(String[] args) throws IOException {

        int count = 0;

        try {
            File file = new File("src/assets/My-File.txt");

            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
            System.out.println("Total Number of Lines: " + count);

            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}