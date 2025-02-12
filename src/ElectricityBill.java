import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int unit = sc.nextInt();

        double rate = 0.0, u100 = 420, u200 = 1020, u400 = 2620;
        if (unit > 0 && unit <= 100) {
            rate = unit * 4.2;
        }
        if (unit > 100 && unit <= 200) {
            rate = u100 + (unit -100) * 6;
        }
        if (unit > 200 && unit <= 400) {
            rate = u200 + (unit - 200) * 8;
        }
        if (unit > 400) {
            rate = u100 + (unit - 400) * 13;
        }

        System.out.println(rate);
    }
}
