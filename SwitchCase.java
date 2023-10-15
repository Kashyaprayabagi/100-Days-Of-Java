import java.util.Scanner;

public class SwitchCase {
    //Using Switch Case in Java
    public static void main (String args[]) {
        //rewriting calculator code using switch case
        int a,b,ans;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Number: ");
        a = sc.nextInt();

        System.out.print("Enter A Number: ");
        b = sc.nextInt();

        System.out.print("Enter the opertation (+,-,*,/): ");
        String symb = sc.next();

        switch (symb) {
            case "+":
                ans = a + b;
                System.out.println(ans);
                break;

            case "-":
                ans = b - a;
                System.out.println(ans);
                break;
            
            case "*":
                ans = b * a;
                System.out.println(ans);
                break;
            
            case "/":
                ans = b / a;
                System.out.println(ans);
                break;

            default:
            System.out.println("Invalid Expression!");
                break;
        }
        
    }
}
