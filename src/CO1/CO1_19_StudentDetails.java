package CO1;
import java.util.Scanner;
public class CO1_19_StudentDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll number: "); int r=sc.nextInt();
        System.out.print("Enter mark: "); double m=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter name: "); String n=sc.nextLine();
        System.out.println("\nStudent Details");
        System.out.println("Roll No : "+r); System.out.println("Name : "+n); System.out.println("Mark : "+m);
        sc.close();
    }
}