 class A extends Thread {
    private int  threadNO;
    public A(int i){
        this.threadNO=i;
    }
    @Override
    public void run(){
        countMe();
    }
    public void countMe(){
        try{
            for(int i=0;i<9;i++){
            
                System.out.println("the value of i is : " + i + "  and thread no is : " + threadNO);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println(e);
        }
       
    }

}

public class myCounter{
    public static void main(String[] args) throws InterruptedException {
        A count=new A(1);
        
        A count2=new A(2);
        long startTime=System.currentTimeMillis();
        System.out.println("using run ");
        System.out.println(startTime);
        count.start();;
        System.out.println("*******************");
        count2.start();
        Thread.sleep(4500);
        long endTime=System.currentTimeMillis();
        System.out.println("Ending time = " + endTime);
        System.out.println("Total time = "+ (endTime-startTime));
    }
}