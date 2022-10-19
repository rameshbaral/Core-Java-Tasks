/*
29.Write a Java method to check whether a year (integer) entered by the user
is a leap year or not
Expected output:
Input a year: 2017
false
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("enter a year");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(isLeapYear(input));

    }
    //returns true if given input is a leap year
    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
