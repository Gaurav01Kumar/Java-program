
class NewThread implements Runnable{
    Thread t;

    String name;
    NewThread(String sname){
        name=sname;
        t=new Thread(this,name);
        System.out.println("New Thread : " + t);
        t.start();
    }
    public void run(){
        System.out.println(" I am auto run function ");
    }

}
public class DemoJoin {
   public static void main(String[] args) throws InterruptedException {
    NewThread nt=new NewThread("Gaurav");
    Thread t3=new Thread();
    t3.start();
    
   } 
}
