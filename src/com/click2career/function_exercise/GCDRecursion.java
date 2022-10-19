/*
25. Write a method to find gcd using recursion.

 */
package com.click2career.function_exercise;

public class GCDRecursion {
    public static void main(String[] args) {
        int num1 = 8, num2 = 12;
        int result = findGCD(num1, num2);
        System.out.println("The greatest common divisor is "+result);

    }
    //returns the GCD using recursion
    private static int findGCD(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }
        if (num1 == num2) {
            return num1;
        }
        if (num1 > num2) {
            return findGCD(num1 - num2, num2);
        }
        return findGCD(num1, num2 - num1);
    }
}
