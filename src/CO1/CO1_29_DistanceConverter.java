package CO1;
import java.util.Scanner;
public class CO1_29_DistanceConverter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter distance in km: "); double km=sc.nextDouble();
        double m=km*1000, cm=m*100;
        System.out.println("Meters = "+m); System.out.println("Centimeters = "+cm);
        sc.close();
    }
}