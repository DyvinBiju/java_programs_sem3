package CO4;
class MyRunnable implements Runnable { String n; MyRunnable(String s){n=s;} public void run(){ System.out.println(n+" running"); } }
public class CO4_08_RunnableBasics {
    public static void main(String[] args){ Thread t1=new Thread(new MyRunnable("Task-1")); Thread t2=new Thread(new MyRunnable("Task-2")); t1.start(); t2.start(); }
}