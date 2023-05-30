package javaweek4homework;
/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci9 = new Fibonacci();
        fibonacci9.printFibonacci();
    }

    private void printFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of elements");
        int elements = scanner.nextInt();
        scanner.close();
        int firstTerm = 1, secondTerm = 1;
        System.out.println("Fibonacci Series till " + elements + " terms:");

        for (int i = 1; i <= elements; ++i) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
