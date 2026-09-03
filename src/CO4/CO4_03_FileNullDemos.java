package CO4;
import java.io.*;
public class CO4_03_FileNullDemos {
    public static void main(String[] args){
        File f=new File("test.txt");
        try{ if(f.createNewFile()) System.out.println("File created"); else System.out.println("File exists"); }catch(IOException e){System.out.println(e);}
        String s=null; try{System.out.println(s.length());}catch(NullPointerException e){System.out.println("NullPointer caught");}
    }
}