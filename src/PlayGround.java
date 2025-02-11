import java.util.Scanner;

public class PlayGround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = sc.nextInt();

        System.out.println(age);
        System.out.println("Enter you name");
        String name = sc.next();
        String remaining = sc.next();
        System.out.println(name);
        System.out.println(remaining);
    }
}
