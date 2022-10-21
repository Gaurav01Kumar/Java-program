import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class SwapAleranate {
    static void Swapa(int arr[],int size){
        for(int i=0;i<size;i++){
           
            if(i+1<size){
                int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i]=temp;
            
            }
        }
        System.out.println("after swap");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int unique(int arr[],int s){
 int ans=0;
 for(int i=0;i<s;i++){
    ans=ans^arr[i];
 }
 return ans;
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            Scanner s=new Scanner(System.in);
            arr[i]=s.nextInt(); 
        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Before swap");
        Swapa(arr, 5);

        System.out.println("\n Uniuqe element is " + unique(arr, 5));
    }
    
}
