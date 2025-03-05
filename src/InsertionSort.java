import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {34,56,23,-78,78,-1};

        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int key = arr[i];

            while(j >= 0 && arr[j] > key)
                arr[j+1] = arr[j--];

            arr[j+1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}
