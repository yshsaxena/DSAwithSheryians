import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < T; i++) {
            System.out.println(isItemFound(arr,m));
        }


    }

    private static int isItemFound(int[] arr, int m) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == m) {
                return i;
            }
        }

        return -1;
    }
}
