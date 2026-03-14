
import java.util.Scanner;


public class HWquadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X-Cordinate");
        int x = sc.nextInt();
        System.out.println("Enter the Y-Cordinate");
        int y = sc.nextInt();
        if(x==0 && y==0){
            System.out.println("Origin");
        }
        else if(y==0 && (x>0 || x<0)){
            System.out.println("X-Axis");
        }
        else if(x==0 && (y>0 || y<0)){
            System.out.println("Y-Axis");
        }
        else if(x>0 && y>0){
            System.out.println("First Quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("Second Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("Third Quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("Fourth Quadrant");
        }
         
    }
}
