package CO2;
class LibraryItem { public String title; protected String author; private double price; LibraryItem(String t,String a,double p){title=t;author=a;price=p;} double getPrice(){return price;} }
class Book extends LibraryItem { String publisher; int edition; Book(String t,String a,double p,String pu,int e){super(t,a,p);publisher=pu;edition=e;} void show(){System.out.println("Title : "+title+"\nAuthor : "+author+"\nPublisher : "+publisher+"\nEdition : "+edition+"\nPrice : "+getPrice());} }
public class CO2_21_LibraryBook {
    public static void main(String[] args){ Book b=new Book("Java Programming","Herbert Schildt",650,"McGraw Hill",12); b.show(); }
}