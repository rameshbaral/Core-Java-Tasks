/*
19.Write a program to print the sum of two numbers entered by users defining your
own method.
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        sumTwoNumbers(firstNumber, secondNumber);

    }
    //returns the sum of the numbers
    private static void sumTwoNumbers(int firstNumber, int secondNumber) {
        System.out.printf("The sum of two numbers is %d%n ", (firstNumber+secondNumber));
    }
}
