package CO4;
class Worker implements Runnable { String task; int loops; Worker(String t,int l){task=t;loops=l;} public void run(){ for(int i=1;i<=loops;i++) System.out.println(task+" : "+i); } }
public class CO4_10_ThreeWorkers {
    public static void main(String[] args){ new Thread(new Worker("A",3)).start(); new Thread(new Worker("B",3)).start(); new Thread(new Worker("C",3)).start(); }
}