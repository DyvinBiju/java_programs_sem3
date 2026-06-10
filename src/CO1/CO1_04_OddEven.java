package CO1;
import java.util.Scanner;
public class CO1_04_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
        sc.close();
    }
}