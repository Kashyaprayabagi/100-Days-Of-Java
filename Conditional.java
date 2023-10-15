import java.util.Scanner;

public class Conditional {
    public static void main (String args[]) {
        //An if-else program
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Age to Know If You Can Vote...");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote!!!.");
        }
        else if (age < 18) {
            System.out.println("Sorry! You cannot vote.");
        }
        else {
            System.out.println("Invalid Information");
        }
    
    }
}
