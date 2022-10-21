package Method;
 public abstract class Animal{
    void legs(){
        System.out.println(" Animal have four legs ");
    }
    abstract void eat();
    abstract void sound();
}
 class Dog extends Animal{
   
void eat(){
    System.out.println("Dogs eat meat ");
}
void sound(){
    System.out.println("Dogs Barks ");
}
}
class Cow extends Animal{
 void eat(){
     System.out.println(" Cow eat grass ");
 }
 void sound(){
     System.out.println();
 }
}
public class Multiplevel {
    public static void main(String[] args) {
        
    }
}
