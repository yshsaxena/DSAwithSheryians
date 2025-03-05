import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {34,56,23,-78,78,-1};

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if( arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            if(arr[minIndex] != arr[i]){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
