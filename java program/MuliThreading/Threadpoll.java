import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class App extends Thread{
      private String name ;
      public App(String name){
        this.name=name;
      }
      @Override
      public void run(){
        System.out.println("Starting thread : "+ name);
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Ending thread : " + name);
      }

}

public class Threadpoll {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        App thread1=new App("thread1");
        App thread2=new App("thread2");
        App thread3=new App("thread3");
        App thread4=new App("thread4");
        // thread1.start();
        // thread2.start();
        // thread3.start();
        // thread4.start();
        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.shutdown();
    }
    
}
