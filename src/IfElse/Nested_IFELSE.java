import java.util.Scanner;

public class Nested_IFELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number A");
        int a = sc.nextInt();
        System.out.println("Enter Number B");
        int b = sc.nextInt();
        System.out.println("Enter Number C");
        int c = sc.nextInt();
        if(a>=b){
            if(a>=c){
                System.out.print("A is the Greatest");
            }
            else{
                System.out.print("C is The Greatest");
            }
        }
        else{
            if(b>=c){
                System.out.println("B is the greatest");
            }
            else{
                System.out.println("C is the greatest");
            }
        }
    }
}
