package CO3;
class StudO { String name="Anu"; public String toString(){return "StudO("+name+")";} }
public class CO3_04_ObjectClassDemo {
    public static void main(String[] args){ StudO a=new StudO(); StudO b=new StudO(); System.out.println(a.toString()); System.out.println(a.equals(b)); System.out.println(a.getClass().getName()); System.out.println(a.hashCode()); }
}