import java.util.Scanner;

public class cs{
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in) ;
     int i=1;
     while(i<=10){
      if(i==5){
         continue;
      }else if(i==9){
         break;
           
      }
      System.out.println(i);
      i++;
     }
        System.out.println("Program is succefully executed");
   } 
}
