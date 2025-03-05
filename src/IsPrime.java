import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n <= 1) System.out.println("Not Prime");
        boolean flag = false;
        for (int i = 2; i <= n/2; i++) {
            if( n % i == 0){
                flag = true;
            }
        }

        if(flag == false){
            System.out.println("Prime");
        }
        else
            System.out.println("Not Prime");
    }
}
