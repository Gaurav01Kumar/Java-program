import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int number;
         System.out.println("Enter a number ");
         number=s.nextInt();
        // int rem=0;
        // while(number>0){
        //     rem=rem*10+number%10;
        //     number=number/10;
        // }
        // System.out.println("Your reverse number is = " + rem);
        // double x=Math.pow(4,4);
        // System.out.println(x);
        System.out.println(findPow(number));

    }
    static boolean findPow(int n){
        int i=1;
        while(i<=n){
            double temp=Math.pow(4,i);
            if(temp==n){
                return true;
            }
            i++;
        }
        return false;
    }
    static void messsage(){
        System.out.println("Good morning , i am a package ");
    }
}
