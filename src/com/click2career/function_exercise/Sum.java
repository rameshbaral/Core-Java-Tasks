/*
2. Write a program with a method named getTotal that accepts two integers as an
argument and return its sum. Call this method from main( ) and print the results.
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class Sum {
    //returns the sum of two input parameter
    public int getTotal(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two number ");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        Sum sum = new Sum();
        int total = sum.getTotal(firstNum,secondNum);
        System.out.println("the result is "+total);
    }

}
