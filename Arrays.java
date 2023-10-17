import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int a;
        //Array with numbers
        //type[] arrayname = new type[size]

         int[] numbers = new int[5];
        //     numbers[0] = 0;
        //     numbers[1] = 1;
        //     numbers[2] = 2;
        //     numbers[3] = 3;
        //     numbers[4] = 4;

        // for (int i = 0; i< 5; i++) {
        //     System.out.println(numbers[i]);
        // }

       for (int i = 0; i< 5; i++) {
        System.out.print("Enter Number: ");
            a = sc.nextInt();
            numbers[i] = a;
       }

       System.out.println("The numbers are: "); 
       for (int i = 0; i < 5; i++) {
        System.out.println(numbers[i]);
       }
 

        

    }
}
