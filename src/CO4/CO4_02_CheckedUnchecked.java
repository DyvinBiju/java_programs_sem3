package CO4;
import java.io.*;
public class CO4_02_CheckedUnchecked {
    public static void main(String[] args){
        try{ FileReader fr=new FileReader("nope.txt"); }catch(FileNotFoundException e){ System.out.println("Checked: FileNotFoundException"); }
        try{ String s=null; System.out.println(s.length()); }catch(NullPointerException e){ System.out.println("Unchecked: NullPointerException"); }
        try{ int x=1/0; }catch(ArithmeticException e){ System.out.println("Unchecked: /0"); }
    }
}