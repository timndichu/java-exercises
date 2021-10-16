/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functions;

import java.util.Scanner;

/**
 * The TempConversion class implements an application that accepts a temperature
 * reading in Fahrenheit from the user and displays the converted temperature in
 * Celsius *
 *
 */
public class TempConversion {

   // Return the converted temp
    public static double convertTemp(double temp) {
        double result;
        result = 5.0/9.0 * (temp-32);
        return result;
    }

    public static void main(String[] args) {
          try {
            double temp = 0;
           
            Scanner input = new Scanner(System.in);

            System.out.print("Enter temperature in Fahrenheit: ");
            //Check if number inputted is an integer or not
            while (!input.hasNextInt() && !input.hasNextDouble() && !input.hasNextFloat()) {
                System.out.println("That's not a valid number!");
                System.out.print("Re-enter the temperature: ");
                input.next();
            }
            temp =  input.nextFloat();
            System.out.println("The converted temp is: " + convertTemp(temp) + " Celsius");

        } catch (Exception e) {
            System.out.print("Something went wrong.");
        }
    }

}
