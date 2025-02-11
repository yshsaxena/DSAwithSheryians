import java.util.Scanner;

public class SwapTwoNumberWithoutThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Write Code Here to Swap Numbers without Using a Third Variable */

        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

    }
}
