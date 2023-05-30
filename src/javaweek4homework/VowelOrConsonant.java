package javaweek4homework;
/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        VowelOrConsonant vowelOrConsonant3 = new VowelOrConsonant();
        vowelOrConsonant3.checkVowelOrConsonant();
    }

    private void checkVowelOrConsonant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character from alphabet");
        String input = scanner.next();
        scanner.close();
        char alphabet = input.toLowerCase().charAt(0);
        if (input.length() == 1 && Character.isLetter(alphabet)) {
            if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
                System.out.println(alphabet + " is vowel");
            } else {
                System.out.println(alphabet + " is consonant");
            }
        } else {
            System.out.println("Invalid input - Provide single alphabet only");
        }
    }
}
