import java.util.Scanner;

public class  HwExample {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("calling the function");
        takeInput(obj);
    }
    static void takeInput(Scanner obj){
        String name;
        int age;
        String courses;
        System.out.print("Enter Your Name - ");
        name=obj.nextLine();
        System.out.print("Enter Your Age - ");
        age=obj.nextInt();
        System.out.print("Enter Your Courses - ");
        courses=obj.nextLine();
        outPut(name,age,courses);
    }
}
