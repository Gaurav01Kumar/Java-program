
class name{
   synchronized public void  Name(){
        for(int i=0;i<5;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
public class synchromethod {
    public static void main(String[] args) {
        name n=new name();
        new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i=0;i<5;i++){
                    n.Name();
                }
            
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i=0;i<5;i++){
                    n.Name();
                }
            
            }
        }).start();
    }
}
