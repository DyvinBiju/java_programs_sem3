package CO1;
import java.util.Scanner;
public class CO1_02_PersonalIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        sc.close();
    }
}