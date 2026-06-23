package CO1;
class Student14 { String name; }
public class CO1_14_MultipleObjects {
    public static void main(String[] args) {
        Student14 s1=new Student14(); Student14 s2=new Student14();
        s1.name="Anu"; s2.name="Rahul";
        System.out.println(s1.name); System.out.println(s2.name);
    }
}