package CO1;
class StudentEntity {
    String name; int age; int rollNo; String course; int marks;
    void study(){ System.out.println(name+" is studying"); }
    void attendClass(){ System.out.println(name+" attends class"); }
    void writeExam(){ System.out.println(name+" writes exam"); }
}
public class CO1_10_StudentEntity {
    public static void main(String[] args) {
        StudentEntity s = new StudentEntity();
        s.name="Anu"; s.age=20; s.rollNo=101;
        s.study(); s.attendClass();
    }
}