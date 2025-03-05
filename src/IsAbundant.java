import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IsAbundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int original = n;
        int divisor = 1;
        int sum = 0;
        while(divisor < n){
            if(n % divisor == 0){
                sum+=divisor;
            }
            divisor++;
        }
        if(sum > n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
