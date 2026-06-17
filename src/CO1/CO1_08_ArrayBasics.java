package CO1;
import java.util.Scanner;
public class CO1_08_ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int sum=0, max=Integer.MIN_VALUE;
        for(int i=0;i<5;i++){ a[i]=sc.nextInt(); sum+=a[i]; if(a[i]>max)max=a[i]; }
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+(sum/5.0));
        System.out.println("Largest = "+max);
        sc.close();
    }
}