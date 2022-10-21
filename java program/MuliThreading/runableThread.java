import java.util.Random;

class A implements Runnable {
    private int threadNo;

    public A(int n) {
        this.threadNo = n;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            try{
                Thread.sleep(random.nextInt(500));
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("The vlue of i : " + i + " and thread no is : " + threadNo);
        }

    }

}

public class runableThread {
    public static void main(String[] args) throws InterruptedException {
        // Thread t=new Thread(new A(1));
        // Thread t2=new Thread(new A(2));
        // long starttime=System.currentTimeMillis();
        // System.out.println(" Starting time : " + starttime);
        // t.start();
        // t2.start();
        // long endtime=System.currentTimeMillis();
        // System.out.println(" Starting time : " + endtime);
        //  System.out.println("Total Time to complete : " + (endtime-starttime));
     
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i=0;i<10;i++){
                    try{
                        Thread.sleep(500);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                    System.out.println(i);
                }
            }
        });
        thread.start();

}
}
