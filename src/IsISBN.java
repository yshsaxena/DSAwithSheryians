import java.util.Scanner;

public class IsISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        long original = n;
        int factor = 1;
        int sum = 0;
        int count = 0;
        while(n != 0){
            long digit = n%10;
            sum += (int) (digit*factor);
            factor++;
            count++;
            n /= 10;
        }

        if( count == 10){
            if( sum % 11 == 0){
                System.out.println("true");
            }
            else{
                System.out.println("false");
                System.out.println();
            }
        }
        else{
            System.out.println("false");
        }
    }
}
