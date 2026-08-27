package CO3;
class EmployeeS { String name; EmployeeS(String n){name=n;System.out.println("Employee Constructor");} void display(){System.out.println(name);} }
class ManagerS extends EmployeeS { String dept; ManagerS(String n,String d){super(n);dept=d;System.out.println("Manager Constructor");} void display(){super.display();System.out.println(dept);} }
public class CO3_08_SuperConstructor {
    public static void main(String[] args){ ManagerS m=new ManagerS("Arun","Sales"); m.display(); }
}