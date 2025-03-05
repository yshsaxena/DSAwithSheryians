import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("Undefined");
        } else if (b < 0) {
            double power = 1.0;

            for (int i = 1; i <= Math.abs(b); i++) {
                power *= (double)a;
            }
            System.out.println(1.0/power);
        } else {
            long power = 1;

            for (int i = 1; i <= b; i++) {
                power *= a;
            }

            System.out.println(power);
        }


    }
}
