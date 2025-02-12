import java.util.Scanner;

public class ValidVoter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Hello " + name  + ", you are a Voter.");
        }
        else{
            System.out.println("Hello " + name  + ", you will be eligible to vote in " + (18 - age) + " years");
        }
    }
}
