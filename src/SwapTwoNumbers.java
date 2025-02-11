import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main (String[] args) {
        /* Write your code here */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);


    }
}

