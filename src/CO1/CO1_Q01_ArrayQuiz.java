package CO1;
public class CO1_Q01_ArrayQuiz {
    // Q1-Q8: arrays basics
    public static void main(String[] args){
        int[] a={10,20,30,40}; System.out.println(a[2]); // Q2 -> 30
        int[] nums={5,8,2,9}; for(int v:nums) System.out.print(v+" "); System.out.println();
        int[] x=new int[3]; System.out.println("default="+x[0]); // Q8 -> 0
        try{ int[] m=new int[5]; System.out.println(m[5]); }catch(ArrayIndexOutOfBoundsException e){ System.out.println("Q3: ArrayIndexOutOfBoundsException"); }
        System.out.println("Q1:C Q4:C Q5:A Q6:length Q7:a.length Q8:C");
    }
}