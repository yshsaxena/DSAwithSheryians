import java.util.Scanner;

public class IsAutomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */

        int n = sc.nextInt();

        long squared = n * n;
        int original = n;
        int count = 0;

        while(n != 0){
            count++;
            n /= 10;
        }

        if(squared % Math.pow(10,count) == original ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
