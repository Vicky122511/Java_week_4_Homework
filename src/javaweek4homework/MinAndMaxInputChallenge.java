package javaweek4homework;
/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxInputChallenge
{
    int num=1;


    public void calculation()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :  ");
        num=sc.nextInt();
        if(num>0)
        {

            while (num > 0)
            {
                int eno[] = new int[num];
                for (int i = 0; i < eno.length; i++)
                {
                    System.out.println("Number :");
                    eno[i] = sc.nextInt();
                }
                Arrays.sort(eno);
                System.out.println("Minimum Number is :" + eno[0]);
                System.out.println("Minimum Number is :" + eno[eno.length - 1]);
            }
        }
        else
        {
            System.out.println("Invalid Number");

        }
    }

    public static void main(String[] args)
    {
        MinAndMaxInputChallenge m1=new MinAndMaxInputChallenge();
        m1.calculation();
    }
}
