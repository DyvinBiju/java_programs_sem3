package CO1;
class Student12 { String name; int age; }
public class CO1_12_CreateObject {
    public static void main(String[] args) {
        Student12 s1 = new Student12();
        System.out.println("Reference s1 created, object: "+s1);
        System.out.println("name="+s1.name+" age="+s1.age);
    }
}