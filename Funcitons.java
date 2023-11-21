import java.util.Scanner;

public class Funcitons {
    public static int rectangle_area(int l,int b) {
        int area = l * b;
        return area;
    }

    // public static void main (String args[]) {
    //     Scanner sc = new Scanner(System.in);
        
    //     System.out.print("Enter Length: ");
    //     int len = sc.nextInt();

    //     System.out.print("Enter Width: ");
    //     int wid = sc.nextInt();

    //     System.out.println("The area is: "+rectangle_area(len, wid));
    // } }

    //finding factorial

    public static void factorial(int n) {
           int fact = 1;
           for (int i = 2; i <= n; i++) {
            fact = fact * i;
           }
           System.out.println(fact);
           }

    
    public static void main (String args[]) {
        factorial(5);
    }
}
    

