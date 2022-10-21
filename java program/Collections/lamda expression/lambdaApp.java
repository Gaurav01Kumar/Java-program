
interface lambda{
    public void demo();
}

public class lambdaApp {
    public static void main(String[] args) {
        // lambda lambda=new lambda(){
        //     @Override
        //     public void demo(){
        //         System.out.println("good morning ");
        //     }
        // };
        lambda lambda=()->{
            System.out.println("hello world");
            System.out.println("what is your name ");
        };
        lambda.demo();
    }
    
}
