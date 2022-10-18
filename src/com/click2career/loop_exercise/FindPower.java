/*
5. Two numbers are entered through the keyboard. Write a program to find the value of one  number raised to the power of another. (Do not use Java built-in method)
 */
package com.click2career.loop_exercise;

import java.util.Scanner;

public class FindPower {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter a number");
        int number = scanner.nextInt();
        System.out.println("Enter raised power");
        int power = scanner.nextInt();
        int result = getNumberRaisedPower(number, power);
        System.out.println("result is "+  result);
    }
    //finds the number raised power
    private static int getNumberRaisedPower(int number, int power) {
        int result = 1;
        if (power == 0)
            return result;
        else {
            for (int i = 0; i < power; i++) {
                result *= number;
            }
            return result;
        }
    }
}
