package CO1;
import java.util.Scanner;
public class CO1_22_StudentResult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Name: "); String n=sc.nextLine();
        System.out.print("Mark1: "); int m1=sc.nextInt();
        System.out.print("Mark2: "); int m2=sc.nextInt();
        System.out.print("Mark3: "); int m3=sc.nextInt();
        int total=m1+m2+m3;
        System.out.println("Name: "+n); System.out.println("Total = "+total); System.out.println("Average = "+(total/3.0));
        sc.close();
    }
}