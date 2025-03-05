import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        int sum = 0;

        System.out.print(0 + " ");
        System.out.print(1 + " ");

        for (int i = 0; i < n-2; i++) {
            sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
        }
    }
}
