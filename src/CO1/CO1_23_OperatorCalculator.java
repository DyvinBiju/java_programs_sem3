package CO1;
import java.util.Scanner;
public class CO1_23_OperatorCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a: "); double a=sc.nextDouble();
        System.out.print("b: "); double b=sc.nextDouble();
        System.out.print("Op (+-*/): "); char op=sc.next().charAt(0);
        double r = op=='+'?a+b:op=='-'?a-b:op=='*'?a*b:op=='/'?(b!=0?a/b:Double.NaN):Double.NaN;
        System.out.println("Result = "+r);
        sc.close();
    }
}