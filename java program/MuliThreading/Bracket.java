
class brac{
    synchronized public void generator(){
        for(int i=0;i<10;i++){
            if(i<=5){
                System.out.print("[");
            }else{
                System.out.print("]");
            }
          
        }
        System.out.println();
    }
}
public class Bracket {
    public static void main(String[] args) {
        brac b=new brac();
      new Thread(new Runnable() {
         @Override
         public void run(){
            for(int i=0;i<5;i++){
                b.generator();
            }
         }
      }).start();
      new Thread(new Runnable() {
        @Override
        public void run(){
           for(int i=0;i<5;i++){
               b.generator();
           }
        }
     }).start();
    }
}
