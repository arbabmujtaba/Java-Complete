import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd is the Number");
        }
        
    }
}
