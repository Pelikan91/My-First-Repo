public class Reverse {
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        for (int i = toBeReversed.length() -1; i >= 0; i--) {
            System.out.print(toBeReversed.charAt(i));
        }
    }
}
