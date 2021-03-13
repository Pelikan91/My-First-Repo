import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteMultipleLines {
    public static void main(String[] args) throws IOException {
        myFirstMultipleLines("src/assets/Testing.txt", "text", 4);
    }

    private static void myFirstMultipleLines(String multiFile, String word, int number) {
        for (int i = 0; i < number; i++) {
            content.add(word);
        }
        Path filepath = Paths.get(multiFile);

        try {
            Files.write(filepath, content);

            catch (IOException e;
        }
    }
}