import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WritingFiles {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        content.add("First line of my file");
        Path filePath = Paths.get("assets/new-file.txt");

        try {
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }
}