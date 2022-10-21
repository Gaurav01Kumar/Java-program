

public class App {
    public static int counter =0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i=1;i<=1000;i++){
                    App.counter++;
                }
                System.out.println("Thread 1 is over ");
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i=1;i<=1000;i++){
                    App.counter++;
                }
                System.out.println("Thread 2 is over ");
            }
        });
        thread.start();
        thread2.start();
        Thread.sleep(2000);
        System.out.println("The Value of counter = " + App.counter);
    }
}
