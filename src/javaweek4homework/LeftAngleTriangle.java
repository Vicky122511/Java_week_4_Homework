package javaweek4homework;
/**
 * Display left angle triangle of * using nested for loops
 *      *
 *     * *
 *    * * *
 *   * * * *
 *  * * * * *
 */

import java.util.Scanner;

public class LeftAngleTriangle {
    public static void main(String[] args) {
        LeftAngleTriangle leftAngleTriangle15 = new LeftAngleTriangle();
        leftAngleTriangle15.displayLeftAngleTriangle();
    }

    private void displayLeftAngleTriangle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int row = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}