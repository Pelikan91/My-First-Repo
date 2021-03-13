public class SecondsInADay {
    public static void main(String[] args) {

        int currentHours = 12;
        int currentMinutes = 36;
        int currentSeconds = 50;

        int secondsInADay = currentHours * 3600 + currentMinutes * 60 + currentSeconds;
        System.out.println("The remaining seconds of a day: " + secondsInADay + ".");
    }
}