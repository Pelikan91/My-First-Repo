public class Takeslonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String quote2 = "always takes longer than";
        System.out.println(quote.substring(0,21) + quote2 + quote.substring(20,quote.length()-1));
    }
}