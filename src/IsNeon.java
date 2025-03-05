import java.util.Scanner;

public class IsNeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int squared = n * n;
        int sum = 0;

        while(squared != 0){
            int digit = squared % 10;
            sum+=digit;
            squared /= 10;
        }

        if(sum == n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

}
