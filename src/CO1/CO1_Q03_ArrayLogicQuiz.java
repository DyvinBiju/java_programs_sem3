package CO1;
public class CO1_Q03_ArrayLogicQuiz {
    public static void main(String[] args){
        int[] a={4,7,1,9}; int max=a[0]; for(int i=1;i<a.length;i++) if(a[i]>max) max=a[i];
        System.out.println(max); // Q16 9
        int count=0; for(int v:a) if(v%2==0) count++; // Q17 even count
        System.out.println("evens="+count);
        int sum=0; for(int v:a) sum+=v; System.out.println("sum="+sum); // Q18 sum+=a[i]
        int[] b={5,8,2,9}; int target=2; for(int i=0;i<b.length;i++) if(b[i]==target) System.out.println(i); // Q19 2
        System.out.println("Q20: ==");
    }
}