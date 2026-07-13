package CO1;
import java.util.Scanner;
public class CO1_28_ElectricityBill {
    public static void main(String[] args){
        final double RATE_PER_UNIT=7.5;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter units: "); int u=sc.nextInt();
        System.out.println("Electricity Bill = "+(u*RATE_PER_UNIT));
        sc.close();
    }
}