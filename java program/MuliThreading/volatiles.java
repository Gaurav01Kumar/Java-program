public class volatiles {
   volatile public static int flag =0;
    public static void main(String[] args) {
        new Thread(new Runnable(){
      @Override 
      public void run(){
        while(true){
            if(flag==0){
                System.out.println("running");
            }else{
                break;
            }
        }
      }
        }).start();
        new Thread(new Runnable(){
            @Override 
            public void run(){
             try {
                Thread.sleep(3000);
             } catch (InterruptedException e) {
                System.out.println(e);
             }
             volatiles.flag=1;
             System.out.println("Flag value is updated ");
              
            }
              }).start();
    }
}
