package CO1;
class Stud25 { static String college="ABC College"; String name; Stud25(String n){name=n;} void display(){System.out.println(name+" studies in "+college);} }
public class CO1_25_StaticVariable {
    public static void main(String[] args){ Stud25 s1=new Stud25("Anu"); Stud25 s2=new Stud25("Rahul"); s1.display(); s2.display(); }
}