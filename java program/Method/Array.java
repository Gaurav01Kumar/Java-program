import java.util.Scanner;



public class  Array {
    public static void main(String[] args) {
        int arr[]=new int[10];
        TakeData(arr,10);
    }
   public static void TakeData(int arr[],int size){
        A a=new A();
        int sum=0;
        Scanner d=new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=d.nextInt();
          sum+=arr[i];
        }
        a.display(sum);
    }
    
}
 class A{
    void display(int sum){
        System.out.println("Sum of data is = " + sum);
    }
}
