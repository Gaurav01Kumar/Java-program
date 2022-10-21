import java.util.Scanner;

class A{
    void changeCase(String name){
        System.out.println("Your Previous name " + name + " After change " + name.toLowerCase());
    }
}
public class exapmle {
     public static void main(String[] args) {
         String str;
         A a=new A();
         Scanner s= new Scanner(System.in);
         str=s.nextLine();
         a.changeCase(str);
     }
}
