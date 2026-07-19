package CO1;
public class CO1_Q05_CombinedQuiz {
    public static void main(String[] args){
        int[] marks={35,60,80}; for(int m:marks) System.out.println(m>=40?"Pass":"Fail"); // Q24 A
        System.out.println("Q25: compare every element with others");
        int[] a={5,-2,0}; if(a[1]<0) System.out.println("Negative"); else System.out.println("Not Negative"); // Q26 Negative
        for(int i=0;i<a.length;i++) if(a[i]<0) a[i]=0; // Q27 a[i]=0
        System.out.println("Q28: a[i][j]");
        int[][] m={{1,2},{3,4}}; System.out.println(m[1][0]); // Q29 3
        int[] arr={1,2}; for(int v:arr) System.out.println(v); // Q30 enhanced for
    }
}