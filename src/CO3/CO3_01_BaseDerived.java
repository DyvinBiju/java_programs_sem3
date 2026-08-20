package CO3;
class Base { private int i; public void seti(int a){i=a;System.out.println("value of i is set to "+i);} public int geti(){System.out.println(" the current value of i is "+i+" and it is returned ");return i;} public void finalize(){System.out.println("Garbage Collected");} }
class Derived extends Base { private int j; public void setj(int a){j=a;System.out.println("value of j is set to "+j);} public int getj(){System.out.println(" the current value of j is "+j+" and it is returned ");return j;} }
public class CO3_01_BaseDerived {
    public static void main(String[] args){
        System.out.println(" working with base class object"); Base b=new Base(); b.seti(10); System.out.println(" received in main as -> "+b.geti()); System.gc();
        System.out.println(" working with derived class object"); Derived d=new Derived(); d.seti(20); System.out.println(" received as -> "+d.geti()); d.setj(30); System.out.println(" j received as -> "+d.getj());
    }
}