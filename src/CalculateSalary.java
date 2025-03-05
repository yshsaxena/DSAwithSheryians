import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char gender = sc.nextLine().charAt(0);
        int year = sc.nextInt();
        sc.nextLine();
        char qualification = sc.nextLine().charAt(0);

        if( gender == 'M' || gender == 'm'){
            if(year >= 10 && (qualification == 'P' || qualification == 'p')) {
                System.out.println("15000");
            }
            else if(year >= 10 && (qualification == 'U' || qualification == 'u')) {
                System.out.println("10000");
            }
            else if(year < 10 && (qualification == 'U' || qualification == 'u')) {
                System.out.println("10000");
            }
            else if(year < 10 && (qualification == 'P' || qualification == 'p')) {
                System.out.println("7000");
            }
        }
        else if( gender == 'F' || gender == 'f'){
            if(year >= 10 && (qualification == 'P' || qualification == 'p')) {
                System.out.println("12000");
            }
            else if(year >= 10 && (qualification == 'U' || qualification == 'u')) {
                System.out.println("9000");
            }
            else if(year < 10 && (qualification == 'U' || qualification == 'u')) {
                System.out.println("6000");
            }
            else if(year < 10 && (qualification == 'P' || qualification == 'p')) {
                System.out.println("10000");
            }
        }
    }
}
