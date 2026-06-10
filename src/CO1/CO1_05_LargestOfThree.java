package CO1;
import java.util.Scanner;
public class CO1_05_LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        int max = (a>b) ? ((a>c)?a:c) : ((b>c)?b:c);
        System.out.println("Largest = " + max);
        sc.close();
    }
}