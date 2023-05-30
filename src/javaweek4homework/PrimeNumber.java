package javaweek4homework;

/**
 * Write a programme to input any number and check if it is prime or not.
 (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 17.... are the prime numbers.)
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber12 = new PrimeNumber();
        primeNumber12.checkPrime();
    }

    private void checkPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number ");
        int number = scanner.nextInt();
        scanner.close();
        if (isPrime(number)) {
            System.out.println("Enter number is prime " + number);
        } else {
            System.out.println("Enter number is not prime " + number);
        }

    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

}
