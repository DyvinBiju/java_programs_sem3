package CO3;
class Person { String name; Person(String n){name=n;} void displayName(){System.out.println(name);} }
class StudentT extends Person { String course; StudentT(String n,String c){super(n);course=c;} void show(){super.displayName();System.out.println(course);} }
class VehicleT { String brand; VehicleT(String b){brand=b;} }
class CarT extends VehicleT { String model; CarT(String b,String m){super(b);model=m;} void show(){System.out.println(brand+" "+model);} }
class EmpT { String name="Emp"; void display(){System.out.println(name);} }
class DevT extends EmpT { String name="Dev"; void display(){super.display();System.out.println(name);} }
public class CO3_09_SuperTasks {
    public static void main(String[] args){
        StudentT s=new StudentT("Anu","MCA"); s.show();
        CarT c=new CarT("Toyota","Innova"); c.show();
        DevT d=new DevT(); d.display();
    }
}