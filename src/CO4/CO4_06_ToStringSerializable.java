package CO4;
import java.io.*;
class Employee6 implements Serializable { private static final long serialVersionUID=1L; String name; int id; Employee6(String n,int i){name=n;id=i;} public String toString(){return "Employee{name='"+name+"', id="+id+"}";} }
public class CO4_06_ToStringSerializable {
    public static void main(String[] args) throws Exception{
        Employee6 e=new Employee6("Anu",1); System.out.println(e);
        try(ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("emp.ser"))){ o.writeObject(e); }
        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("emp.ser"))){ System.out.println(in.readObject()); }
    }
}