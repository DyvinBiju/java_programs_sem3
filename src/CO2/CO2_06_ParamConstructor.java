package CO2;
class Stud6 { String name; int age; Stud6(String n,int a){name=n;age=a;} }
public class CO2_06_ParamConstructor {
    public static void main(String[] args){ Stud6 s1=new Stud6("Anu",20); Stud6 s2=new Stud6("Binu",22); System.out.println(s1.name); System.out.println(s2.name); }
}