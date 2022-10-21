import java.util.Scanner;


public class table {
    public static void main(String [] arg) {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to print table ");
        x= s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(x + " X " + i+ " = " + (x*i));
        }
    }
}
