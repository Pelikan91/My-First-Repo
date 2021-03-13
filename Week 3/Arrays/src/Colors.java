import java.util.Arrays;

public class Colors {

    public static void main(String[] args) {

        String[][] colors = {{"lime", "forest green", "olive", "pale green", "spring green"},{"orange red", "red", "tomato"},{"orchid", "violet", "pink", "hot pink"}};

        for (String[] col:colors) {
            System.out.println(Arrays.toString(col) + " "); //ikdyz uz je colors String, tak musim pouzit tuhle variantu
        }
    }
}