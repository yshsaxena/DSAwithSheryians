import java.util.Scanner;

public class BinarySearch {
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
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int middle = (start + end)/2;

            if(m == arr[middle]){
                return middle;
            }
            else if (m > arr[middle]){
                start = middle + 1;
            }
            else if( m < arr[middle]){
                end = middle - 1;
            }
        }

        return -1;
    }
}
