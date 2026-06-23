package CO1;
class Box16 {
    double length,width,height;
    Box16(double l,double w,double h){length=l;width=w;height=h;}
    double calculateVolume(){return length*width*height;}
    void display(){System.out.println("Length : "+length);System.out.println("Width : "+width);System.out.println("Height : "+height);System.out.println("Volume : "+calculateVolume());}
}
public class CO1_16_BoxDemo {
    public static void main(String[] args) {
        Box16 b1=new Box16(10,5,4); Box16 b2=new Box16(6,3,2);
        System.out.println("Box 1 Details"); b1.display();
        System.out.println("\nBox 2 Details"); b2.display();
    }
}