package javaweek4homework;
/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        TrianglePattern trianglePattern6 = new TrianglePattern();
        trianglePattern6.printTriangle();
    }

    private void printTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}