import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int unit = sc.nextInt();

        double rate = 0.0;
        while (unit > 0){
            if(unit <= 100){
                rate += unit * 4.2;
            }
            if ( unit > 100 && unit <= 200){
                unit -=  100;
                rate += unit * 6;
            }
            if( unit > 200 && unit <= 400){
                unit -= 200;
                rate += unit * 8;
            }
            if( unit > 400){
                unit -= 400;
                rate += unit * 13;
            }


        }
        System.out.println(rate);
    }
}
