package CO1;
import java.util.Scanner;
public class CO1_18_ReadNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=input.nextInt();
        System.out.println("Your age is "+age);
        input.close();
    }
}