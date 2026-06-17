package CO1;
import java.util.Scanner;
public class CO1_09_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        for(int i=1;i<=5;i++){ System.out.print("Mark "+i+": "); total+=sc.nextInt(); }
        double avg = total/5.0;
        String grade = avg>=90?"A+":avg>=75?"A":avg>=60?"B":avg>=40?"C":"F";
        System.out.println("Total = "+total);
        System.out.println("Average = "+avg);
        System.out.println("Grade = "+grade);
        sc.close();
    }
}