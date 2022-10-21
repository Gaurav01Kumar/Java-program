import java.lang.*;

 class ThreadClass   {
    public static void main(String[] args)throws InterruptedException {
        B t=new B();
        t.fun();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("Gaurav");
            
            Thread.sleep(1000);
        }
    }
   
  
}
class B extends Thread{
  @Override
    public  void run(){
        try{

         for(int i=0;i<5;i++){
            System.out.println("kumar");
            Thread.sleep(1000);
        }
        
    }catch(InterruptedException e){
        System.out.println(e);
       
    }
}  
void fun(){
    try{
        for(int i=0;i<5;i++){
            System.out.println("fun");
            Thread.sleep(1000);
        }
    }catch(InterruptedException e){
        e.printStackTrace();
        System.out.println("An error occured");
    }
}  
}
