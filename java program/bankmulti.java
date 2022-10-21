import java.util.Scanner;

 class bankmulti extends Thread {
    int amount=0;
    public void run(){
        try{
            System.out.println("Please wait while fetching your Balance...... ");
            Thread.sleep(2000);
              System.out.println("Your Balnce is = " + amount);
            
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
    void Deposit(){
        int money;
        Scanner ip=new Scanner(System.in);
        System.out.print("Your Deposit Amount : ");
        money = ip.nextInt();
        amount+=money;
    }
    void Withdraw(){
        int money;
        Scanner ip=new Scanner(System.in);
        System.out.print("Your Withdraw Amount : ");
        money = ip.nextInt();
        if(money > amount){
            System.out.println("Insufficent Balance ");
            return;
        }else{
            amount-=money;
        }

    }
            public static void main(String[] args)  {
                bankmulti bm=new bankmulti();
                
               Scanner ip=new Scanner(System.in);
               int opt;
               do{

               
               System.out.println("1 : Withdraw ");
               System.out.println(" 2 : Deposit ");
               System.out.println("3 : Check Balance ");
               System.out.print("Your Choice [1-3] : ");
               opt=ip.nextInt();
               switch(opt){
                case 1 : bm.Withdraw();bm.start(); break;
                case 2 : bm.Deposit();bm.start(); break;
                case 3 :bm.start(); break;
                default:System.out.println("Invalid Choice ");

               }
            }while(opt<=3);
}
}
