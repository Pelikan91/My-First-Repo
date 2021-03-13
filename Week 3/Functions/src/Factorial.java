public class Factorial {

    public static void main(String[] args) {
        int number = 5;
        System.out.println(calculateFactorial(number));
    }
    public static int calculateFactorial(int number) {
        int factorial = number * number -1 * number -2 * number -3 * number -4;
        return factorial;
    }
}