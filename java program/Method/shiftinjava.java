public class shiftinjava {
    public static void main(String[] args) {
        System.out.println("happy independece day ");
        System.out.println(6<<4);
        System.out.println(6>>1);
        System.out.println(5 ^3);
        System.out.println(7&1);

        //checking odd or even using bitwise operator 
        int n=32;
        System.out.println(isOdd(n));
    }
    public static boolean isOdd(int n){
        return (n&1)==1;
    }
}
