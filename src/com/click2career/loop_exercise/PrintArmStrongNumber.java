/*
13. Write a program to print out all Armstrong numbers between 1 and 500. If the sum of cubes
of each digit of the number is equal to the number itself, then the number is called an
Armstrong number.
For example, 153 = ( 1 * 1 ) + ( 5 * 5 * 5 * 5 * 5 ) + ( 3 * 3 * 3 )

 */
package com.click2career.loop_exercise;

public class PrintArmStrongNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong number between 1 and 500 is ");
        printArmstongNumber(1, 500);
    }

    private static void printArmstongNumber(int start, int finish) {
        for (int i = start; i <= finish; i++) {
            int sum;
            //executes if number has 3 digits in it
            if (i > 99) {
                //finds the digits in the ones, tens and hundred places
                int hundred = i / 100;
                int tens = (i % 100) / 10;
                int ones = (i % 100) % 10;
                //now calculates the sum of square of individual digit in the number
                sum = (hundred * hundred * hundred) + (tens * tens * tens) + (ones * ones * ones);
                //executes if the sum is equal to the number itself
                if (i == sum) {
                    System.out.print(", " + i);
                }
            }
            //executes if number has 2 digits in it
            else if (i <= 99 && i > 9) {
                //finds the digits in the ones and tens places
                int ones = i % 10;
                int tens = i / 10;
                //now calculates the sum of square of individual digit in the number
                sum = (tens * tens) + (ones * ones);
                //executes if the sum is equal to the number itself
                if (i == sum) {
                    System.out.print(", " + i);
                }
            }
            //executes if number has a single digit in it
            else {
                //a number containing single digit is a palindrome
                if(i==1)
                    System.out.print(i);
                else
                    System.out.print(", " + i);
            }
        }
    }

}

