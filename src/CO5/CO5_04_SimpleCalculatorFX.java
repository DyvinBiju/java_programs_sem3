package CO5;
public class CO5_04_SimpleCalculatorFX {
    // File: SimpleCalculator.java - TextFields n1 n2, HBox buttonBox, resultLabel, setOnAction parseDouble
    public static void main(String[] args){
        double n1=10, n2=20; double result=n1+n2;
        System.out.println("Result = "+result);
        try{ double x=Double.parseDouble("abc"); }catch(NumberFormatException e){ System.out.println("Invalid number"); }
    }
}