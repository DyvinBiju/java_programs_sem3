package CO1;
public class CO1_24_NaturalSumRecursion {
    static int sumFn(int n){ if(n==1) return 1; return n+sumFn(n-1); }
    public static void main(String[] args){ System.out.println(sumFn(10)); }
}