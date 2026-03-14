
import java.util.Scanner;


public class Printing_The_Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int a = sc.nextInt();
        System.out.println("Enter B Number");
        int b = sc.nextInt();
        System.out.println("Enter C Number");
        int c = sc.nextInt();
        if(b==c && b>c){
            System.out.println("A and B both are Equal And Greater Than C");
        }
        else if(b==c && b>a){
            System.out.println("B and C are Both Equal And Greater Than A");
        }
        else if(a==c && a>b){
            System.out.println("A and C are Both equal And Greater Than B");
        }
        else if(a>b && a>c){
            System.out.println("A is the greatest");
        }
        else if(b>a && b>c){
            System.out.println("B is the greatest");
        }
        else if(c>a && c>b) {
            System.out.println("C is the Greatest");
        }
        else if(a==b && b==c){
            System.out.println("All are Equal");
        }
        
    }
}
