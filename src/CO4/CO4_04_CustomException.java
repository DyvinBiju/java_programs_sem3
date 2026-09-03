package CO4;
class NegativeValueException extends Exception { NegativeValueException(String m){super(m);} }
class InvalidAgeException extends Exception { InvalidAgeException(String m){super(m);} }
public class CO4_04_CustomException {
    static void setAge(int a) throws InvalidAgeException { if(a<0||a>150) throw new InvalidAgeException("Invalid age "+a); }
    public static void main(String[] args){
        try{ if(-5<0) throw new NegativeValueException("negative"); }catch(NegativeValueException e){System.out.println(e.getMessage());}
        try{ setAge(200); }catch(InvalidAgeException e){System.out.println(e.getMessage());}
        finally{ System.out.println("finally always executes"); }
    }
}