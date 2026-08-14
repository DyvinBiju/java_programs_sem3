package CO2;
class Student18 { protected int rollNo; protected String name; protected int marks; Student18(int r,String n,int m){rollNo=r;name=n;marks=m;} void displayStudent(){System.out.println("Roll No : "+rollNo+"\nName : "+name+"\nMarks : "+marks);} }
class PGStudent extends Student18 { String spec; int sem; PGStudent(int r,String n,int m,String s,int se){super(r,n,m);spec=s;sem=se;} void display(){displayStudent();System.out.println("Specialization : "+spec+"\nSemester : "+sem);} }
public class CO2_18_PGStudent {
    public static void main(String[] args){ PGStudent p=new PGStudent(21,"Neha",89,"AI & ML",2); p.display(); }
}