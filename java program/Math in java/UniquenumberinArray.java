public class UniquenumberinArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,5,4,3,2,78,87,78,87,001};
        System.out.println("Unique element in array " +ans(arr));
    }
    private static  int ans(int []arr){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
