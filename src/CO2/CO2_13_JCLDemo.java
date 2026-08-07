package CO2;
import java.util.Scanner; import java.util.Random;
public class CO2_13_JCLDemo {
    public static void main(String[] args){
        System.out.println("Math pow="+Math.pow(2,3)+" sqrt="+Math.sqrt(16));
        Random dice=new Random(0); System.out.println("roll="+(dice.nextInt(6)+1));
        System.out.println("Scanner/Random/Math demo ok");
    }
}