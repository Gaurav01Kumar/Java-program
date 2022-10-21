public class Exeption{
    public static void main(String[] args){
        int a=10,b=0, c;
        System.out.println("main method start");
        try{
            System.out.println("Can't divide by zero ");
            c=a/b;
            System.out.println(c);
          
        }catch(Exception e){
            System.out.println(e);
            System.out.println("main method ended ");
          
        }
    }
}