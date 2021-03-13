public class Todoprint {
    public static void main(String[] args) {

        StringBuilder url = new StringBuilder ("- Buy milk\n");
        String a = "My todo:\n";
        String b = "- Download games\n";
        String c = "   - Diablo";
        url.insert(0, a);
        url.insert(url.length(), b);
        url.insert(url.length(), c);
        System.out.println(url);
    }
}
