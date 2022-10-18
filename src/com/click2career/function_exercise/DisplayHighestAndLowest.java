/*
7. Create a function called averageNumber(int num1 , int num2 , int num3) and
inside the function display the highest and lowest among three numbers.
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class DisplayHighestAndLowest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int firstNumber= scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        averageNumber(firstNumber,secondNumber,thirdNumber);

    }
    //prints the highest and lowest number
    private static void averageNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int highest;
        int lowest;
        highest = getHighest(firstNumber, secondNumber, thirdNumber);
        System.out.println("The highest number is "+highest);
        lowest = getLowestNumber(firstNumber,secondNumber, thirdNumber);
        System.out.println("the lowest number is "+lowest);
    }

    //returns the highest of 3 numbers
    private static int getHighest(int firstNumber, int secondNumber, int thirdNumber) {
        int highest;
        if (firstNumber > secondNumber && firstNumber > thirdNumber) highest = firstNumber;
        else {
            highest = Math.max(secondNumber, thirdNumber);
        }
        return highest;
    }
    //returns the lowest of 3 numbers
    private static int getLowestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int lowest;
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            lowest = firstNumber;

        } else {
            lowest = Math.min(secondNumber, thirdNumber);
        }
        return lowest;
    }
}
