import java.util.Scanner;

public class IsPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean flag = false;

        for (int i = 2; i <= n/2 ; i++) {
            if (i * i == n) {
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
