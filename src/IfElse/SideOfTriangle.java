import java.util.Scanner;

public class SideOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ist side of Triangle");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd side of Triangle");
        int b = sc.nextInt();
        System.out.println("Enter the Third side of Triangle");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }   
}
