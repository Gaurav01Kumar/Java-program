import java.util.Scanner;

public class elseIf {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int marks;
        
        System.out.println("Enter your marks ");
        marks=s.nextInt();
        if(marks>100){
            System.out.println("Marks under 100");
        }
        else  if(marks>=60 && marks<100){
          System.out.println("First Division");
      }
      else if(marks >=45 && marks<60){
          System.out.println("Second Division");
      }else if(marks>=30 && marks<45){
          System.out.println("Third Division ");
      }else{
          System.out.println("Fail ");
      }
    }
}
