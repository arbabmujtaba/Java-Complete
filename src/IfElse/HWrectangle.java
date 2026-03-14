
import java.util.Scanner;


public class HWrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        int length = sc.nextInt();
        System.out.println("Enter Breadth");
        int Breadth = sc.nextInt();
        int area = length*Breadth;
        int perimeter = 2*(length+Breadth);
        if(area>perimeter){
            System.out.println("Area Is Greater");
            System.out.println(area);
        }
        else if(perimeter>area){
            System.out.println("Perimeter Is Greater");
            System.out.println(perimeter);
        }
    }
}
