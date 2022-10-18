/*
18. Write a program to check whether the number or string is palindrome or not.
 */
package com.click2career.loop_exercise;

import java.util.Scanner;

public class CheckPalindrome {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" Enter a number or string to check");
        String input = scanner.nextLine();
        checkPalindrome(input);

    }
    //checks if given input is palindrome or not
    private static void checkPalindrome(String input) {
        String reversedString = "";

        //loop to create a reversed string
        for(int i=(input.length()-1);i>=0;i--){
            reversedString = reversedString + input.charAt(i);
        }

        //if reversed string is equal to input string, it is palindrome otherwise not
        if(input.equalsIgnoreCase(reversedString)){
            System.out.println(input+" is a palindrome");
        }
        else{
            System.out.println(input+" is not a palindrome");
        }
        scanner.close();
    }
}
