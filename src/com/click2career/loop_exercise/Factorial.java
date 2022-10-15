/*
4. Write a program to find the factorial value of any number entered through the keyboard.
 */
package com.click2career.loop_exercise;

import java.util.Scanner;

public class Factorial {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the number to calculate a factorial");
        int number = scanner.nextInt();
        System.out.println("the factorial of the number is "+calculateFactorial(number));
    }

    private static int calculateFactorial(int num) {
        int fact = 1;
        for (int i=1; i<=num; i++){
           fact = fact * i;
        }
        return fact;
    }

}
