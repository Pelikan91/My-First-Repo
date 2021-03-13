public class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 24;
        int output1 = 0;
        if (a % 2 == 0) {
            output1++;
        }
        System.out.println(output1);

        int b = 13;
        String output2 = "";
        if (10 < b && b < 20) {
            output2 = "Sweet!";
        } else if (b < 10) {
            output2 = "Less!";
        } else {
            output2 = "More!";
        }
        System.out.println(output2);

        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        if (isBonus==true){
            c = c;
        } else if  (credits > 50 && isBonus == false) {
            c -= 2;
        } else if (credits < 50 && isBonus == false) {
            c -= 1;
        }
        System.out.println(c);

        int d = 8;
        int time = 120;
        String output3 = "";

        if (d%4==0 && time<200){
            output3 = "check";
        } else if (time>200){
            output3 = "Time out";
        } else {
            output3 = "Run Forest Run!";
        }
        System.out.println(output3);

    }
}