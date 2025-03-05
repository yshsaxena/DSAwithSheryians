import java.util.Scanner;

public class IsHarshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int original = n;

        while(n != 0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }

        if(original % sum == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
