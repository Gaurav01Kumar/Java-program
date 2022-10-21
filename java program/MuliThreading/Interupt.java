public class Interupt {
    public static int balance=0;
    public void withdraw(int amt){
 synchronized (this){
    if(balance<=0){
        try{
            System.out.println("waiting for blance updation ");
            wait();
        }catch(InterruptedException e){
            System.out.println("Interpted");
        }
        
      }
 }
 balance-=amt;
    }
    public void deposit(int amount) {
		System.out.println("We are depositing the amount "+amount);
		balance = balance + amount;
	 
      System.out.println("Amount got updated ");
	}
    public static void main(String[] args) {
        Interupt it=new Interupt();
        Thread thread1=new Thread(new Runnable() {
            public void run(){
                it.withdraw(100);
            }
        });
        thread1.start();
        Thread thread2=new Thread(new Runnable() {
            public void run(){
               try{
                Thread.sleep(2000);
               }catch(InterruptedException e){
                e.printStackTrace();
               }
               it.deposit(2000);
               thread1.interrupt();
            }
        });
        thread2.start();
    }
}
