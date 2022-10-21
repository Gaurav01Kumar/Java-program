



 class A implements Runnable{
    private int counter;
    A(int i){
        this.counter=i;
    }
    @Override
    public void run(){
        
        for(int i=0;i<5;i++){
        try {
            Thread.sleep(2000);
               
            }catch(InterruptedException e) {
                e.printStackTrace();
        } 
        System.out.println("This is thread no = " + counter + " and the value is i = " + i);
        }
    }
}
public class runable {
    
    public static void main(String[] args) throws InterruptedException {
        Thread t1= new Thread(new A(1));
        Thread t2= new Thread(new A(2));
        t1.start();
        t2.start();
         

    }
}
