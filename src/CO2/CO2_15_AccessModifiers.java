package CO2;
class AccessDemo { private int pvt=10; int def=20; protected int pro=30; public int pub=40; void inside(){System.out.println(pvt+def+pro+pub);} }
class DemoMulti { void hi(){System.out.println("Student object created");} }
public class CO2_15_AccessModifiers {
    public static void main(String[] args){ AccessDemo a=new AccessDemo(); a.inside(); System.out.println(a.def+" "+a.pro+" "+a.pub); DemoMulti d=new DemoMulti(); d.hi(); }
}