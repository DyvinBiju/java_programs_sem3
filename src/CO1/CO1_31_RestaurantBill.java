package CO1;
import java.util.Scanner;
public class CO1_31_RestaurantBill {
    public static void main(String[] args){
        final double GST_RATE=0.05, SC_RATE=0.10;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter food cost: "); double f=sc.nextDouble();
        double gst=f*GST_RATE, s=f*SC_RATE;
        System.out.println("GST = "+gst); System.out.println("Service Charge = "+s); System.out.println("Final Bill = "+(f+gst+s));
        sc.close();
    }
}