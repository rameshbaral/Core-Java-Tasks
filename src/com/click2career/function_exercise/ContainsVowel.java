/*
23. Write a method that takes input string from the user and return true if
it contains vowels otherwise false.
 */

package com.click2career.function_exercise;

import java.util.Scanner;

public class ContainsVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean result = checkVowel(input);
        if(result)
            System.out.println("Contains Vowel");
        else
            System.out.println("Does not contains vowel");
    }

    private static boolean checkVowel(String input) {
        for (char c : input.toCharArray()) {
            if (IsVowel.checkVowel(c)) {
                return true;
            }
        }
        return false;
    }
}
