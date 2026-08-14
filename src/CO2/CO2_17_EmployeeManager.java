package CO2;
class Employee17 { int id; String name; double salary; Employee17(int i,String n,double s){id=i;name=n;salary=s;} void displayEmployee(){System.out.println("ID : "+id+"\nName : "+name+"\nSalary : "+salary);} }
class Manager17 extends Employee17 { String dept; double bonus; Manager17(int i,String n,double s,String d,double b){super(i,n,s);dept=d;bonus=b;} void displayManager(){displayEmployee();System.out.println("Department : "+dept+"\nBonus : "+bonus);} }
public class CO2_17_EmployeeManager {
    public static void main(String[] args){ Manager17 m=new Manager17(101,"Arun",50000,"Sales",15000); m.displayManager(); }
}