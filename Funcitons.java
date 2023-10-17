import java.util.Scanner;

public class Funcitons {
    // public static int rectangle_area(int l,int b) {
    //     int area = l * b;
    //     return area;
    // }

    // public static void main (String args[]) {
    //     Scanner sc = new Scanner(System.in);

    //     int len = sc.nextInt();
    //     int wid = sc.nextInt();

    //     System.out.println(rectangle_area(len, wid));
    // }

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
    

