package CO1;
import java.util.Scanner;
public class CO1_03_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: "); double a = sc.nextDouble();
        System.out.print("Enter b: "); double b = sc.nextDouble();
        System.out.println("Sum = " + (a+b));
        System.out.println("Difference = " + (a-b));
        System.out.println("Product = " + (a*b));
        System.out.println("Quotient = " + (b!=0 ? a/b : "undefined"));
        sc.close();
    }
}