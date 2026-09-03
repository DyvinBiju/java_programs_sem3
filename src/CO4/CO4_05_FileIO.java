package CO4;
import java.io.*; import java.util.Scanner;
public class CO4_05_FileIO {
    public static void main(String[] args){
        try(PrintWriter w=new PrintWriter("out.txt")){ w.println("Line 1: Java"); w.println("Line 2: Python"); }catch(IOException e){System.out.println(e);}
        try(Scanner sc=new Scanner(new File("out.txt"))){ while(sc.hasNextLine()) System.out.println(sc.nextLine()); }catch(IOException e){System.out.println(e);}
        try{ Thread.sleep(100); }catch(InterruptedException e){ System.out.println("Sleep interrupted"); }
    }
}