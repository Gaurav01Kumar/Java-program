
class Brackets {
   synchronized public static void genterate(String threadCode){
        for(int i=0;i<10;i++){
            if(i<=5){
                System.out.print("[");
            }else{
                System.out.print("]");
            }
        }
        System.out.println("Generate by thread : "+ threadCode);
    }
}
public class staticSynch {
    public static void main(String[] args) throws InterruptedException {
        
        
        new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i=0;i<5;i++){
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                    Brackets.genterate("thread1");
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i=0;i<5;i++){
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                    Brackets.genterate("thread 2");
                }
            }
        }).start();
    }
}
