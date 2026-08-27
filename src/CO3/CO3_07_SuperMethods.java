package CO3;
class AnimalS { String name="Animal"; void eat(){System.out.println("Animal is eating");} }
class DogS extends AnimalS { String name="Dog"; void eat(){super.eat(); System.out.println("Dog is eating"); System.out.println(super.name+" vs "+name);} }
public class CO3_07_SuperMethods {
    public static void main(String[] args){ DogS d=new DogS(); d.eat(); }
}