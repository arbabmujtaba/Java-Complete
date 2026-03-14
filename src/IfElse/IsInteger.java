import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        double n = sc.nextDouble();

        int x = (int) n;

        if (n - x > 0) {
            System.out.println("Number is not an Integer");
        } else {
            System.out.println("Number is an Integer");
        }

        sc.close();
    }
}