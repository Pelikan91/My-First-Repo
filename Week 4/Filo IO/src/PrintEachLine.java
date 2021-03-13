import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src/assets/My-File.txt");

        try {
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines);
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }
     }
}