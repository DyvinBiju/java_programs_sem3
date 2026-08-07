package CO2;
class UserAccount { private String username; private int age; UserAccount(String u,int a){username=u;setAge(a);} String getUsername(){return username;} void setAge(int n){ if(n>=0&&n<=120) age=n; else System.out.println("Error: Invalid age"); } int getAge(){return age;} }
public class CO2_14_Encapsulation {
    public static void main(String[] args){ UserAccount u=new UserAccount("rob",20); System.out.println(u.getUsername()+" "+u.getAge()); u.setAge(-5); }
}