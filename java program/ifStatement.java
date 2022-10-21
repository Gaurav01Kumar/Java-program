import java.util.Scanner;

public class ifStatement {
 public static void main(String[] args) {
     int password;
     Scanner s= new Scanner(System.in);
     System.out.print("Enter your password ");
     
     password=s.nextInt();
     if(password==205089){
         System.out.println("My Name is : Gaurav Kumar");
         System.out.println("MY Age is 20");
         System.out.println("My Roll no is 205089");
         System.out.println("I live in madhubani bihar ");
     }
 }    
}
