package CO2;
class BankAcc { String name; double balance; BankAcc(String n,double b){name=n;balance=b;} void display(){System.out.println(name+" "+balance);} }
class StudM { int mark; StudM(int m){mark=m;} }
public class CO2_16_PassingObjects {
    static void deposit(BankAcc a,double amt){a.balance+=amt;}
    static void withdraw(BankAcc a,double amt){if(a.balance>=amt)a.balance-=amt;else System.out.println("Insufficient");}
    static void update(StudM s){s.mark=95;}
    public static void main(String[] args){
        BankAcc a1=new BankAcc("Robins",50000); deposit(a1,5000); withdraw(a1,500); a1.display();
        StudM st=new StudM(70); System.out.println("Before:"+st.mark); update(st); System.out.println("After:"+st.mark);
    }
}