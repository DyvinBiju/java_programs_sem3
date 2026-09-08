package CO4;
class CountdownThread extends Thread { public void run(){ for(int i=5;i>=1;i--){ System.out.println(i); try{Thread.sleep(200);}catch(InterruptedException e){} } } }
public class CO4_07_ThreadExtends {
    public static void main(String[] args){ CountdownThread t1=new CountdownThread(); CountdownThread t2=new CountdownThread(); t1.start(); t2.start(); }
}