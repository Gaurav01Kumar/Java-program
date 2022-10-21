import java.util.Scanner;

public class palindrone {
    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.print(" Enter a number ");
        num = s.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+ " ");
        for(int i=1;i<=num;i++){
            int c=a+b;
            a=b;
            b=c;
            
            System.out.print(c+ " ");
        }
      
    }
}
