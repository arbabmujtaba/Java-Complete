
import java.util.Scanner;




public class ProfitLoss {
    public static void main(String[] args) {
        // Scanner cp = new Scanner(System.in);
        // System.out.println("Enter a Number:");
        // Scanner sp = new Scanner(System.in);
        // System.out.println("Enter Another Number:");
        // int Costprice = cp.nextInt();
        // int SellingPrice = sp.nextInt();

        // // Else if ladder
        // if(Costprice>SellingPrice){
        //     System.out.println("Loss");
        //     System.out.println(SellingPrice-Costprice);
        // }
        // if(Costprice<SellingPrice){
        //     System.out.println("Profit");
        //     System.out.println(SellingPrice-Costprice);
        // }
        // if(Costprice == SellingPrice){
        //     System.out.println("No Profit No Loss");
        //     System.out.println(Costprice-SellingPrice);
        // }
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();
        if(a%5==0){
            System.out.println("Riya");
        }
        if(a%3==0){
            System.out.println("banu");
        }
        if(a%5==0 && a%3==0){
            System.out.println("Apurva");
        }
        if(a%5!=0 && a%3!=0){
            System.out.println("Isha");
        }
    }
}