package CO1;
public class CO1_32_ArrayDemos {
    public static void main(String[] args){
        int[] marks={85,90,78,88};
        System.out.println("length="+marks.length);
        for(int i=0;i<marks.length;i++) System.out.println(marks[i]);
        for(int m:marks) System.out.println("each:"+m);
        String[] names={"Anu","Binu","Cathy"};
        System.out.println(names[1]);
        int[][] matrix={{1,2,3},{4,5,6}};
        System.out.println(matrix[1][2]);
    }
}