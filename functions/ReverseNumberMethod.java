package functions;

import java.util.Scanner;

/**
 * The ReverseNumber class implements an application that an integer
 * from the user and displays the reverse of that number
 */
public class ReverseNumberMethod {
     // Return the converted temp
    public static int reverseTheNumber(int num) {
        int reverseNumber = 0;
         while (num != 0) {
                reverseNumber = reverseNumber * 10;
                reverseNumber = reverseNumber + num % 10;
                num = num / 10;
            }
         return reverseNumber;
    }
    public static void main(String[] args) {
        try {
            int number = 0;
            int reverseNumber = 0;
            Scanner input = new Scanner(System.in);

            System.out.print("Enter number: ");
            //Check if number inputted is an integer or not
            while (!input.hasNextInt()) {
                System.out.println("That's not an integer!");
                System.out.print("Re-enter the number: ");
                input.next();
            }
            number = input.nextInt();
            reverseNumber = reverseTheNumber(number);

            System.out.println("Reverse of the input number is: " + reverseNumber);

        } catch (Exception e) {
            System.out.print("Something went wrong.");
        }

    }

}
