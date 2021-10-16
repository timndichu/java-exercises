/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functions;

import java.util.Scanner;

public class MaxFinder {
//user defined function public

    void findMax() {
        Scanner input = new Scanner(System.in);
        double val1 = input.nextDouble();// Java API library
        double val2 = input.nextDouble();// for keyboard inp
        double val3 = input.nextDouble();// function called w
        input.close();
        double result = max(val1, val2, val3); // user defined
        System.out.println("Maximum value is: " + result);
    }
//user defined function

    public double max(double n1, double n2, double n3) {
        double maximum = n1;
        if (n2 > maximum) {
            maximum = n2;
        }
        if (n3 > maximum) {
            maximum = n3;
        }
        return maximum;
    }
//user defined static function

    public static void doubleRange() {
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
    }

    public static void main(String[] args) {
        MaxFinder maxFinder = new MaxFinder();
        maxFinder.findMax();
        MaxFinder.doubleRange();

    } //end of MaxFinderApp class
}// end of MaxFinder class
