/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assign_ENE212_0076_2017;

import java.util.Scanner;

/**
 *
 * @author Timo
 * MonthsOfTheYear class is a program that prompts the user to enter a number
 * that corresponds to a month in a year and displays the month name
 */
public class MonthsOfTheYearSwitch {
   //main class
    public static void main(String[] args) {
         /* 
        Encapsulate the code in a try catch so as to do proper error handling.
        This prevents our code from crashing.
        */
       try{
           //initialize variables
            int month_number;
            String month_name = "";
           
            //create an input Scanner object
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the month number: ");
            //Check if number inputted is a float or not
            while (!input.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.print("Re-enter the month number: ");
                input.next(); 
            }
            month_number = input.nextInt();
            
           switch (month_number) {
               case 1:
                 month_name = "January";
                   break;
               case 2:
                    month_name = "February";
                   break;
               case 3:
                  month_name = "March";
                   break;
               case 4:
                   month_name = "April";
                   break;
               case 5:
                     month_name = "May";
                   break;
               case 6:
                       month_name = "June";
                   break;
               case 7:
                      month_name = "July";
                   break;
               case 8:
                      month_name = "August";
                   break;
               case 9:
                    month_name = "September";
                   break;
               case 10:
                    month_name = "October";
                   break;
               case 11:
                   month_name = "November";
                   break;
               case 12:
                   month_name = "December";
                   break;
               default:
                   System.out.printf("%d is an invalid month number\n", month_number);
                   break;
           }
            System.out.printf("Month number %d is %s \n", month_number, month_name);
             }
        catch(Exception e) {
             System.out.print("Something went wrong.");
        }
    }
    
}
