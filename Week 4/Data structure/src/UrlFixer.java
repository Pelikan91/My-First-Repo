public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        String urlFirst = "https:";
        String urlLast = "odds";
        System.out.println(urlFirst +url.substring(5, 38) + urlLast);
    }
}