package loops;

import java.util.Scanner;

/**
 * The ReverseNumber class implements an application that an integer
 * from the user and displays the reverse of that number
 */
public class ReverseNumber {

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
            while (number != 0) {
                reverseNumber = reverseNumber * 10;
                reverseNumber = reverseNumber + number % 10;
                number = number / 10;
            }

            System.out.println("Reverse of input number is: " + reverseNumber);

        } catch (Exception e) {
            System.out.print("Something went wrong.");
        }

    }

}
