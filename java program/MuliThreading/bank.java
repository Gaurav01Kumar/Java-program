import javax.sound.midi.Soundbank;

public class bank {
    static public int blance=0;

    public void withdrwa(int amt){

        synchronized (this) {
        if (blance <= 0) {
            try {
                System.out.println("Waiting for balance updation ");
               // wait(2000);
               wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       
    }
    blance-=amt;
    System.out.println("withdraw succefuly and the current balance = " + blance);
    }
    public void deposit(int amt){
        System.out.println("We are deposting the amount ");
        blance+=amt;
        synchronized (this){
            notify();
        }
    }

    public static void main(String[] args) {
        bank b=new bank();
       Thread thread1= new Thread(new Runnable() {
            @Override
            public void run(){
                b.withdrwa(200);
            }
        });
        thread1.setName("thread1");
        thread1.start();
       Thread thread2= new Thread(new Runnable() {
            @Override
            public void run(){
                try{
                    Thread.sleep(3000);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
                b.deposit(2000);
            }
        });
        thread2.setName("thread2");
        thread2.start();
    }
}
