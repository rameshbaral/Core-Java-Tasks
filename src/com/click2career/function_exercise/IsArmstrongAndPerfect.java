/*
36. Write a program in java to check armstrong and perfect numbers using
the function.
Test Data :
Input any number: 371
Expected Output :
The 371 is an Armstrong number.
The 371 is not a Perfect number.
 */
package com.click2career.function_exercise;

public class IsArmstrongAndPerfect {
    //checks if provided number is armstrong or not
    public static boolean isArmstrong(int num) {
        String numString = String.valueOf(num);
        int digits = numString.length();
        int sum = 0;
        for (int i = 0; i < digits; i++) {
            int temp = Character.getNumericValue(numString.charAt(i));
            sum = sum + (int) Math.pow(temp, digits);
        }
        if (sum == num) {
            return true;
        }
        return false;
    }
    //checks if provided number is perfect or not
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 532;
        if (isArmstrong(num)) {
            System.out.println(num + " is an armstrong number.");
        } else {
            System.out.println(num + " is not an armstrong number.");
        }

        if (isPerfectNumber(num)) {
            System.out.println(num + " is perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
    }

