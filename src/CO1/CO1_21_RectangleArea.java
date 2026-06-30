package CO1;
import java.util.Scanner;
public class CO1_21_RectangleArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Length: "); double l=sc.nextDouble();
        System.out.print("Breadth: "); double b=sc.nextDouble();
        System.out.println("Area = "+(l*b));
        sc.close();
    }
}