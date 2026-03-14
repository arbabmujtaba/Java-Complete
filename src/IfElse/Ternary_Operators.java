
import java.util.Scanner;



public class Ternary_Operators {
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // System.out.println( a + " " + "This is concatinated Terenary operator: " + ((a%2==0) ? "even" : "Odd"));// we can use this in form of string i mean this whole becomes a string when used with plus signs 


        //Anothr form of terenary operator is that 

        int Check = (a%3 == 0 ) ? 100 : 0 ;
        System.out.println(Check);

        // Nested turnary Operator
        String Nested = (A>=B)? ((A>=C) ? "A is bigger":"C is the biggest") : ((B>=C) ? "B is the Greatest":"C is The Greatest");
        System.out.println(Nested);
    }
}
