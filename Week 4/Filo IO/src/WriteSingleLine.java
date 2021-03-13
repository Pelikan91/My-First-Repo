import java.io.FileWriter;
import java.io.IOException;

public class WriteSingleLine {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter writer = new FileWriter("sry/assets/MyFile.txt");
            writer.write("Ladislav Pelikán");
            writer.close();

        } catch (IOException e) {
            System.err.println("Unable to write file: MyFile.txt");
        }

    }

}