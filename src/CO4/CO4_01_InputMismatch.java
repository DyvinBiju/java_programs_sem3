package CO4;
import java.util.*;
public class CO4_01_InputMismatch {
    public static void main(String[] args){
        Scanner sc=new Scanner("25 abc");
        System.out.println(sc.hasNextInt()); System.out.println(sc.nextInt());
        System.out.println(sc.hasNextInt()); System.out.println(sc.next());
        try{ Scanner s2=new Scanner(System.in); }catch(Exception e){System.out.println(e);}
        sc.close();
        try{ int age=Integer.parseInt("abc"); }catch(NumberFormatException e){ System.out.println("Enter number only"); }
    }
}