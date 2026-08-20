package CO3;
class Shape { String color="Red"; void displayColor(){System.out.println("The color of this shape is: "+color);} }
class Circle extends Shape { double radius=5.0; void calculateArea(){System.out.println("Area of the Circle: "+(Math.PI*radius*radius));} }
class Square extends Shape { double side=4.0; void calculateArea(){System.out.println("Area of the Square: "+(side*side));} }
public class CO3_02_HierarchicalShape {
    public static void main(String[] args){ Circle c=new Circle(); c.displayColor(); c.calculateArea(); Square s=new Square(); s.displayColor(); s.calculateArea(); }
}