/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loops;

/**
 * The Pattern1 class implements an application that displays
 * different patterns
 */
public class Pattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int height = 4;
        int count = 1, num = 1;
        //PRINT STARS (*)
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //PRINT 1 22 333 4444
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        
        //PRINT 1 121 12321 ...
         
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i - 1; k > 0; k--) {
                System.out.print(k);
            }
            System.out.println("");
        }
        
        //PRINT 1 010 10101 ....
        for (int i = 1; i <= height; i++) { 
            for (int k = 1; k <= num; k++) {
                System.out.print(count % 2);
                count++;
            }
            num += 2;
            System.out.print("\n");
        }
    }

}
