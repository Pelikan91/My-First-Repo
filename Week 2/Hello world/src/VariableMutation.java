public class VariableMutation {
    public static void main(String[] args) {

        int a = 3 + 10;
        System.out.println(a);

        int b = 100 - 7;
        System.out.println(b);

        int c = 44 * 2;
        System.out.println(c);

        int d = 125 / 5;
        System.out.println(d);

        int e = 8;
        e *= e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        System.out.println(f1 > f2);

        int g1 = 350;
        int g2 = 200;
        System.out.println(g2 * 2 > g1);

        int h = 135798745;
        h /= 11;
        boolean divisor11 = false;
        System.out.println(divisor11);

        int i1 = 10;
        int i2 = 3;
        System.out.println(true && true);

        int j = 1521;
        System.out.println(true && false);
    }
}
