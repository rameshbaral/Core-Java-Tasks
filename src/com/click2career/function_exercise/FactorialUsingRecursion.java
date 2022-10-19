/*
24. Write a method to find factorial using recursion.

 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int input = scanner.nextInt();
        int result = factorial(input);
        System.out.println("factorial of "+input+" is "+result);
    }

    private static int factorial(int input) {
        int n = input;
        if(input == 0 || input == 1)
            return 1;
        else{
            return n*factorial(n-1);
        }

    }
}
