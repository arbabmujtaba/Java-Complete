
import java.util.Scanner;


public class PrintingSquare {
    public static void main(String[] args) {
        double square;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number ");
        double number = sc.nextDouble();
        square = number * number;
        System.out.println("The square is " + square);
    }
}
    