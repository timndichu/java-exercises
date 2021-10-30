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
public class MonthsOfTheYear {
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
            
            if(month_number==1) {
                month_name = "January";
            }
            else if(month_number==2) {
                 month_name = "February";
            }else if(month_number==3) {
                 month_name = "March";
            }else if(month_number==4) {
                 month_name = "April";
            }else if(month_number==5) {
                 month_name = "May";
            }else if(month_number==6) {
                 month_name = "June";
            }else if(month_number==7) {
                month_name = "July";
            }else if(month_number==8) {
                 month_name = "August";
            }else if(month_number==9) {
                month_name = "September";
            }else if(month_number==10) {
                month_name = "October";
            }else if(month_number==11) {
                 month_name = "November";
            }else if(month_number==12) {
                 month_name = "December";
            }
            else {
                System.out.printf("%d is an invalid month number\n", month_number);
            }
            
             System.out.printf("Month number %d is %s \n", month_number, month_name);
             }
        catch(Exception e) {
             System.out.print("Something went wrong.");
        }
    }
    
}
