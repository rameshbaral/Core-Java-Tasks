/*
8. Create a function called sum(int num1 , int num2 , int num3) and inside the
function return the sum of three numbers and display it in the part from where the
function was called
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class DisplaySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        System.out.println("Sum of 3 numbers is "+ sumOfThreeNumber(firstNumber, secondNumber, thirdNumber));
    }
    //returns the sum of 3 numbers
    private static int sumOfThreeNumber(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber+secondNumber+thirdNumber;
    }
}
