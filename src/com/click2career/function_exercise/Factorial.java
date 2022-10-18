/*
6. Write a program to print the factorial of a number by defining a method
getFactorial(int number).

 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class Factorial {
    //calculates the factorial of the provided nunber
    private  int getFactorial(int num) {
        int fact = 1;
        for (int i=1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factorial factorial = new Factorial();
        System.out.println("Enter the number to calculate factorial");
        int input = scanner.nextInt();
        int result = factorial.getFactorial(input);
        System.out.println("the factorial of "+ input+ " is "+ result);
    }
}
