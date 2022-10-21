

public class numberPrint {
    public static void main(String[] args) {
        //print the number 1 to 10 
        print(1);

    }
    static void print(int n){
        if(n>5){
            return;
        }
     System.out.println(n);
     print(n+1);
    }
}
