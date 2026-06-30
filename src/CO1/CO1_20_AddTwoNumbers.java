package CO1;
import java.util.Scanner;
public class CO1_20_AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("First number: "); int a=sc.nextInt();
        System.out.print("Second number: "); int b=sc.nextInt();
        System.out.println("Sum = "+(a+b));
        sc.close();
    }
}