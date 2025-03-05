import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //reading two input from user
        int a = sc.nextInt();
        int b = sc.nextInt();

        //will iterate the loop until both the value don't get equal
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }

        //printing the output
        System.out.println(a);


    }
}
