package CO3;
abstract class VehicleA { String brand; VehicleA(String b){brand=b;} abstract void start(); }
class CarA extends VehicleA { CarA(String b){super(b);} void start(){System.out.println(brand+" car started");} }
public class CO3_06_AbstractVehicle {
    public static void main(String[] args){ VehicleA v=new CarA("Toyota"); v.start(); }
}