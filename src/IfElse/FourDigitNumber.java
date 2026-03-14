
import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>999 && a<10000){
            System.out.println("Four digit number");
        }
        else{
            System.out.println("Not a four digit number");
        }
        if(a%3==0 || a%5==0){
            System.out.println("Divisible by 3 or 5");
        }
        else{
            System.out.println("Not divisible by 3 or 5");
        }
    }

}
