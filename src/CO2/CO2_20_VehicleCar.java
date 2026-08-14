package CO2;
class Vehicle20 { public String company; protected String model; String fuelType; Vehicle20(String c,String m,String f){company=c;model=m;fuelType=f;} }
class Car20 extends Vehicle20 { Car20(String c,String m,String f){super(c,m,f);} void show(){System.out.println("Company : "+company+"\nModel : "+model+"\nFuel Type : "+fuelType);} }
public class CO2_20_VehicleCar {
    public static void main(String[] args){ Car20 c=new Car20("Toyota","Innova","Diesel"); c.show(); }
}