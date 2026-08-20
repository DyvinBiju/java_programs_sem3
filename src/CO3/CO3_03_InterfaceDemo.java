package CO3;
interface Printer { void print(); }
class Inkjet implements Printer { public void print(){System.out.println("Inkjet printing");} }
interface Startable { void start(); }
class CarI implements Startable { public void start(){System.out.println("Car started");} }
public class CO3_03_InterfaceDemo {
    public static void main(String[] args){ Printer p=new Inkjet(); p.print(); Startable s=new CarI(); s.start(); }
}