import java.util.Scanner;

public class CopyArrayAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int [] copy = new int[arr.length];

        for (int i = 0; i < n; i++) {
            copy[n-i-1] = arr[i];
        }

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

    }
}
