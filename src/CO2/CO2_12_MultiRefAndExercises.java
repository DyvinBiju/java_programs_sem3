package CO2;
class Stud12 { int length; String name; int rollNo; }
public class CO2_12_MultiRefAndExercises {
    public static void main(String[] args){
        Stud12 b1=new Stud12(); b1.length=20; System.out.println(b1.length); // Task1
        // Task2 error demo: Stud12 s; s.rollNo=10; -> needs new
        Stud12 a=new Stud12(); Stud12 b=a; a.name="Rahul"; System.out.println(b.name); // Task3 shared ref
        Stud12 s1=new Stud12(); Stud12 s2=new Stud12(); s1.name="Anu"; s2.name="Binu"; System.out.println(s1.name+" "+s2.name);
        try{ Stud12 n=null; System.out.println(n.name);}catch(NullPointerException e){ System.out.println("NullPointerException"); }
    }
}