package CO1;
import java.util.Scanner;
public class CO1_30_SalaryCalculator {
    public static void main(String[] args){
        final double DA_RATE=0.20, HRA_RATE=0.10;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter basic salary: "); double b=sc.nextDouble();
        double da=b*DA_RATE, hra=b*HRA_RATE;
        System.out.println("DA = "+da); System.out.println("HRA = "+hra); System.out.println("Gross Salary = "+(b+da+hra));
        sc.close();
    }
}