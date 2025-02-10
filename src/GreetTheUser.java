import java.util.Scanner;

public class GreetTheUser {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Write Your Code Here */
        String name = sc.next();
        String age = sc.next();

        System.out.println("Hello " + name + " you are " + age + " years old.");
    }
}
