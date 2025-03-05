import java.sql.SQLOutput;
import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int price = sc.nextInt();

        if( price >= 0 && price < 5000){
            System.out.println(price);
        }
        else if(price >= 5000 && price < 7000){
            System.out.println(price - price/20);
        }
        else if(price >= 7000 && price < 9000){
            System.out.println(price - price/10);
        }
        else{
            System.out.println(price - price/5);
        }
    }
}
