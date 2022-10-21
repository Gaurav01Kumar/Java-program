import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b, c;
        char op;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1St number .. ");
        a = s.nextInt();
        System.out.print("Your operation");
        op = s.next().charAt(0);
        System.out.print("Enter 2nd number .. ");
        b = s.nextInt();
        switch (op) {
            case '+':
                c = a + b;
                System.out.println("Sum of Your number is = " + c);
                break;
            case '-':
                c = a - b;
                System.out.println("Subtract of Your number is = " + c);
                break;
            case '*':
                c = a - b;
                System.out.println("Multiply of Your number is = " + c);
                break;
            case '/':
                c = a - b;
                System.out.println("Divide of Your number is = " + c);
                break;
            default:
                System.out.println("Invalid Choice ");
        }

    }
}
