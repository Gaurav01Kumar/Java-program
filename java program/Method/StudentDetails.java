
public class StudentDetails {
    String name="Gaurav ";
    int age=20;
    int weight=49;
    void eat(){
        System.out.println("I am eating ");
    }
    void Sleep(){
        System.out.println("I am sleeping ");
    }
    public static void main(String[] args) {
   StudentDetails s=new StudentDetails();
   System.out.println(" Name = " + s.name);
   System.out.println(" Age = " + s.age);
   System.out.println(" Weight = "+ s.weight);
   s.eat();
   s.Sleep();
    }
}
