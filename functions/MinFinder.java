/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functions;

import java.util.Scanner;

/**
 *
 * @author Timo
 * Class to find the minimum value among 3 numbers
 */
public class MinFinder {

   void findMin() {
        Scanner input = new Scanner(System.in);
        double val1 = input.nextDouble();// Java API library
        double val2 = input.nextDouble();// for keyboard inp
        double val3 = input.nextDouble();// function called w
        input.close();
        double result = min(val1, val2, val3); // user defined
        System.out.println("Maximum value is: " + result);
    }
//user defined function

    public double min(double n1, double n2, double n3) {
        double minimum = n1;
        if (n2 < minimum) {
            minimum = n2;
        }
        if (n3 < minimum) {
            minimum = n3;
        }
        return minimum;
    }
//user defined static function

    public static void doubleRange() {
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
    }
     public static void main(String[] args) {
        MinFinder minFinder = new MinFinder();
        minFinder.findMin();
        MinFinder.doubleRange();

    } //end of MaxFinderApp class
}
