import java.util.*;


public class Calculator {
    public static void main (String args[]) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter a number: ");
        b = sc.nextInt();

        int sum = a +b;
        int diff = a - b;
        int pro = a * b;
        int quo = b/a;

        System.out.println("sum: "+sum);
        System.out.println("Difference: "+diff);
        System.out.println("Product: "+pro);
        System.out.println("Quotient: "+quo);
    }
}