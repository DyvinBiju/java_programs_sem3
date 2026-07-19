package CO1;
public class CO1_Q04_SwitchQuiz {
    public static void main(String[] args){
        int day=3; switch(day){case 1:System.out.println("Mon");break;case 3:System.out.println("Wed");break;} // Q21 Wed
        System.out.println("Q22: without break executes next cases also");
        int x=1; switch(x){case 1: System.out.println("ok");break;} // Q23 A correct
    }
}