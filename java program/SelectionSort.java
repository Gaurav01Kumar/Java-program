import java.util.Scanner;

public class SelectionSort {
    static void Sort(int arr[],int s){
      
    }
    public static void main(String[] args) {
        int arr[]=new int [5];
        Scanner st=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter your " +  i + " data : ");
            arr[i]=st.nextInt();
        }

        System.out.println("befor sorting");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        
          
        for(int i=0;i<5-1;i++)
        {
            int minIndex=i;
            int temp=arr[minIndex];
            for(int j=i+1;j<5;j++){
                if(arr[j]<arr[minIndex]){
                  
                    minIndex=j;
                }
               arr[minIndex]=arr[i];

                arr[j]=temp;
                
            }
            
        }
        System.out.println("After sorting ");
for(int i=0;i<5;i++){
    System.out.print(arr[i]+"  ");
}
    }
    
}
