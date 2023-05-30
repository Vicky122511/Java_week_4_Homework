package javaweek4homework;
/** Write a program in Java to display the pattern like a diamond.
 While loop

 *                   *
 *                  ***
 *                 *****
 *                *******
 *               *********
 *              ***********
 *             *************
 *              ***********
 *               *********
 *                *******
 *                 *****
 *                  ***
 *                   *
 */

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Diamond diamond14 = new Diamond();
        diamond14.printDiamond();
    }

    private void printDiamond() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        scanner.close();
        int m, n;

        for (m = 1; m <= number; m++) {
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (m = number - 1; m > 0; m--) {
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
