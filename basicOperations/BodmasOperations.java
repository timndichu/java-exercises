package basicOperations;

import java.util.Scanner;

/**
 * The BodmasOperations class implements an application that
 * accepts 2 integers from the user and displays the sum, difference,
 * product and quotient
 */
public class BodmasOperations {

    public static void main(String[] args) {
        try{
            int first_integer, second_integer;
            int sum, difference, product;
            float quotient;
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the first integer: ");
            //Check if number inputted is an integer or not
            while (!input.hasNextInt()) {
                System.out.println("That's not an integer!");
                System.out.print("Re-enter the first integer: ");
                input.next(); 
            }
            first_integer = input.nextInt();
            System.out.print("Enter the second integer: ");
            //Check if number inputted is an integer or not
            while (!input.hasNextInt()) {
                System.out.println("That's not an integer!");
                System.out.print("Re-enter the second integer: ");
                input.next(); 
            }
            second_integer = input.nextInt();
            sum = first_integer + second_integer;
            difference = first_integer - second_integer;
            product = first_integer * second_integer;

            //Casting types
            quotient = (float) first_integer / (float) second_integer;

            System.out.printf("The sum is: %d\n", sum);
            System.out.printf("The difference is: %d\n", difference);
            System.out.printf("The product is: %d\n", product);
            System.out.printf("The quotient is: %f\n", quotient);
            
        }
        catch(Exception e) {
             System.out.print("Something went wrong.");
        }
      
    }
    
}
