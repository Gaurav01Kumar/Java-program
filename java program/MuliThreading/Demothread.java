
class NewThread extends Thread{
    @Override
    public void run(){
        count();
    }
public void count(){
    System.out.println("this is count function ");
    for(int i=0;i<=10;i++){
        System.out.print(i+ " ");
    }
}
}
public class Demothread {
    public static void main(String[] args) throws InterruptedException{
         NewThread t=new NewThread();Thread t1=new Thread();
        
        System.out.println();
         
        t.start();
        Thread.sleep(1000);
        System.out.println("This is main function");
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.print(i+ " ");
        }
       
      
        
        
        
    }
}
