/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assign_ENE212_0076_2017;

import java.util.Scanner;

/**
 *
 * @author Timo
 * Sum_Average class is a program that prompts the user to enter three floating point
 * numbers and displays the sum and average.
 */
public class Sum_Average {
    //main class
    public static void main(String[] args) {
        /* 
        Encapsulate the code in a try catch so as to do proper error handling.
        This prevents our code from crashing.
        */
       try{
           //initialize variables
            float first_float, second_float, third_float, sum, average;
           
            //create an input Scanner object
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            //Check if number inputted is a float or not
            while (!input.hasNextFloat()) {
                System.out.println("That's not a float!");
                System.out.print("Re-enter the first float: ");
                input.next(); 
            }
            first_float = input.nextFloat();
            
            System.out.print("Enter the second float: ");
            //Check if number inputted is a float or not
            while (!input.hasNextFloat()) {
                System.out.println("That's not a float!");
                System.out.print("Re-enter the second float: ");
                input.next(); 
            }
            second_float = input.nextFloat();
            
            System.out.print("Enter the third float: ");
            //Check if number inputted is an float or not
            while (!input.hasNextFloat()) {
                System.out.println("That's not a float!");
                System.out.print("Re-enter the third float: ");
                input.next(); 
            }
            third_float = input.nextFloat();
            
            //calculate sum
            sum = first_float + second_float + third_float;
           
            //calculate average
            //Casting types
            average = (float) sum / (float) 3;
            System.out.printf("The sum is: %f\n", sum);
            System.out.printf("The average is: %f\n", average);
            
        }
        catch(Exception e) {
             System.out.print("Something went wrong.");
        }
    }
    
}
