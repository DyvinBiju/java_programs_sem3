package CO3;
class Calculator { int add(int a,int b){return a+b;} double add(double a,double b){return a+b;} }
class Animal { void sound(){System.out.println("generic");} }
class Dog extends Animal { void sound(){System.out.println("Dog barks");} }
public class CO3_05_Polymorphism {
    public static void main(String[] args){ Calculator c=new Calculator(); System.out.println(c.add(2,3)+" "+c.add(2.5,3.5)); Animal a=new Dog(); a.sound(); }
}