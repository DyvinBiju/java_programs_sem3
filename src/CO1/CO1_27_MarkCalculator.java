package CO1;
import java.util.Scanner;
public class CO1_27_MarkCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=0; for(int i=1;i<=3;i++){System.out.print("Enter mark "+i+": ");t+=sc.nextInt();}
        System.out.println("Total = "+t); System.out.println("Average = "+(t/3.0));
        System.out.println(t/3.0>50?"Above 50":"50 or below");
        sc.close();
    }
}