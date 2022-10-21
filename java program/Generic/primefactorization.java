

import java.util.Scanner;

public class primefactorization {
    public static void prime_factors(int n){
        int power = 0;
        for (int i = 2; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                while (n % i == 0) {
                    power++;
                    n /= i;
                }
                System.out.print(i);
                if (power > 1)
                    System.out.print("^" + power);
                if (n > 1)
                    System.out.print(" x ");
                power = 0;
            }
            if (i == 2) i--;
        }
        if (n > 1)
            System.out.print(n);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number ");
        n=sc.nextInt();
        
        prime_factors(n);
    }
}
