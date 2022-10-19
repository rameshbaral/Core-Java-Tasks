/*
21.Write a method that takes as input a non-negative integer and returns true
if the number is a palindrome; otherwise, it returns false. Also write a
program to test your method.
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a positive number");
        int number = scanner.nextInt();
        //checks if positive number is entered
        while (true) {
            if(number>0)
                break;
            else{
                System.out.println("enter positive number");
                number = scanner.nextInt();
            }
        }
        boolean result = checkPalindrome(number);
        if(result)
            System.out.println("the number is palindrome");
        else
            System.out.println("the entered number is not palindrome");


    }
    //returns true if the input number is palindrome
    private static boolean checkPalindrome(int number) {
        String numString = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder(numString);
        String newString = String.valueOf(stringBuilder.reverse());
        if (numString.equals(newString)) {
            return true;
        }
        return false;
    }

}
