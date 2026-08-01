package CO2;
class Stud10 { int roll; String name; Stud10(int r,String n){roll=r;name=n;} void display(){System.out.println(roll+" "+name);} }
public class CO2_10_SimpleStudent {
    public static void main(String[] args){ Stud10 s1=new Stud10(101,"Rahul"); s1.display(); }
}