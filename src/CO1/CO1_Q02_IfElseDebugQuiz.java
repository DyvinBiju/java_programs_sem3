package CO1;
public class CO1_Q02_IfElseDebugQuiz {
    public static void main(String[] args){
        int x=10; if(x>5) System.out.println("A"); else System.out.println("B"); // Q9 A
        int marks=85; if(marks>=90) System.out.println("A"); else if(marks>=75) System.out.println("B"); else System.out.println("C"); // Q11 B
        int age=20; if(age>=18); // Q12: extra semicolon bug demo
        System.out.println("Adult (bug: always prints due to ;)");
        int[] a={1,2,3}; try{ for(int i=0;i<=a.length;i++) System.out.println(a[i]); }catch(Exception e){ System.out.println("Q13: Loop condition error i<=length"); }
        int num=7; if(num%2==0) System.out.println("Even"); else System.out.println("Odd"); // Q14 fix = to ==
        int n=12; if(n%2==0) System.out.println("Even"); else System.out.println("Odd"); // Q15 Even
        System.out.println("Q10:C Q14:A");
    }
}