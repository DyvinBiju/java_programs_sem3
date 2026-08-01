package CO2;
class Stud8 { String name; int age; Stud8(){name="Unknown";age=0;} Stud8(String n){name=n;} Stud8(String n,int a){name=n;age=a;} }
public class CO2_08_ConstructorOverloading {
    public static void main(String[] args){ Stud8 a=new Stud8(); Stud8 b=new Stud8("Anu"); Stud8 c=new Stud8("Binu",21); System.out.println(a.name+" "+b.name+" "+c.name); }
}