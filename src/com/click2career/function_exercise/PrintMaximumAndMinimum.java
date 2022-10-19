/*
    18. Define two methods to print the maximum and minimum number respectively
among three numbers entered by the user.

 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class PrintMaximumAndMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
    //returns the highest of 3 numbers
    private static void getHighest(int firstNumber, int secondNumber, int thirdNumber) {
        int highest;
        if (firstNumber > secondNumber && firstNumber > thirdNumber) highest = firstNumber;
        else {
            highest = Math.max(secondNumber, thirdNumber);
        }
        System.out.println("the highest number is "+highest);
    }
    //prints the lowest of 3 numbers
    private static void getLowestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int lowest;
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            lowest = firstNumber;

        } else {
            lowest = Math.min(secondNumber, thirdNumber);
        }
        System.out.println("The lowest number is "+ lowest);
    }
}
