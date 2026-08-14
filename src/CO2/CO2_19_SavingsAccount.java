package CO2;
class Bank19 { private long accNo; private double bal; Bank19(long a,double b){accNo=a;bal=b;} long getAcc(){return accNo;} double getBal(){return bal;} }
class Savings19 extends Bank19 { double rate; Savings19(long a,double b,double r){super(a,b);rate=r;} void show(){System.out.println("Account Number : "+getAcc()+"\nBalance : "+getBal()+"\nInterest Rate : "+rate+"%\nInterest Earned : "+(getBal()*rate/100));} }
public class CO2_19_SavingsAccount {
    public static void main(String[] args){ Savings19 s=new Savings19(100245,50000,5); s.show(); }
}