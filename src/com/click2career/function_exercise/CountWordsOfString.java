/*
16.Write a java program to count all the words of a string . Example : I want to be a
software engineer. Output : 7
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class CountWordsOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string character ");
        String character = scanner.nextLine();
        int result = countWords(character);
        System.out.println("Word count is "+ result);
    }
    //returns the word count
    private static int countWords(String character) {
        String word[] = character.split(" ");
        return word.length;
    }
}
