public class Greeting {
    public static void main(String[] args) {
        String al = "Green Fox";
        System.out.println(greet(al));
    }
    public static String greet(String input)  {
        String text = "Greetigs dear";
        return text + " " + input;
    }
}