public class findIthbit {
    public static void main(String[] args) {
           boolean n=10100101;
           System.out.println(ans(n));
    }
    private static boolean ans(int n){
        return n& (1<<(n-1));
    }
}
