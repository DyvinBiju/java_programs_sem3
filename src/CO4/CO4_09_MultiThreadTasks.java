package CO4;
class NumberPrinter implements Runnable { public void run(){ for(int i=1;i<=5;i++) System.out.println((i%2==0?"Even ":"Odd ")+i); } }
class TimerTask2 implements Runnable { public void run(){ for(int i=0;i<5;i++){ System.out.println("Tick"); try{Thread.sleep(300);}catch(InterruptedException e){System.out.println("interrupted");break;} } } }
class MyThread extends Thread { public void run(){ System.out.println("run() called"); } }
public class CO4_09_MultiThreadTasks {
    public static void main(String[] args) throws Exception{
        new Thread(new NumberPrinter()).start();
        Thread t=new Thread(new TimerTask2()); t.start(); Thread.sleep(400); t.interrupt();
        MyThread m=new MyThread(); m.run(); m.start();
    }
}