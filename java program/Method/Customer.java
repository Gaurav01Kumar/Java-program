import java.util.Scanner;

class Bank{
   private double bal=2000;
  private int pwd;
    void CheckBalance(){
        Scanner s=new Scanner(System.in);
         System.out.print(" Enter Your Password");
         pwd=s.nextInt();
         if(pwd==123){
             System.out.println(" Your Total Balance = " + bal);
         }else{
             System.out.println("Your Password is incorrect ");
         }
    }
    void withDraw(){
        int money;
        Scanner s=new Scanner(System.in);
        System.out.print(" Enter Your Password");
        pwd=s.nextInt();
        if(pwd==123){
            System.out.print("Amount to be withdraw ");
            money=s.nextInt();
            if(money>bal){
                System.out.println("Your Balance is low ");
            }
            bal-=money;
            System.out.println(" Your Total Balance = " + bal);
        }else{
            System.out.println("Your Password is incorrect ");
        }

    }
}
public class Customer {
    public static void main(String[] args) {
        Bank b=new Bank();
        Scanner s=new Scanner(System.in);
        int ch;
        do{
            System.out.println("1 : Check Balance ");
            System.out.println("2 : Withdraw Money  ");
            System.out.print("Your Choice is -> ");
           ch= s.nextInt();
            switch(ch){
                case 1: b.CheckBalance();break;
                case 2:b.withDraw();break;
                default: System.out.println("your Choice is error ");
            }
        }while(ch<=2);
       

    }
}
