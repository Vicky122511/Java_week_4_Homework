package javaweek4homework;
/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class RightAngleTriangle {

    public static void main(String[] args) {
        RightAngleTriangle rightAngleTriangle8 = new RightAngleTriangle();
        rightAngleTriangle8.displayRightAngleTriangle();
    }

    private void displayRightAngleTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("@");
            }
            System.out.println();
        }
        scanner.close();

    }
}