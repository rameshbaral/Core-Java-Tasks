/*
28. Write a Java method to count all words in a string
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:
Number of words in the string: 9
 */
package com.click2career.function_exercise;

public class CountNumberOfWordsInString {
    public static void main(String[] args) {
        String str = "he quick brown fox jumps over the lazy dog";
        int result = countWords(str);
        System.out.println("words number in string "+str+ " is "+ result);
    }
    //returns the number of words in string
    private static int countWords(String str) {
        // Check if the string is null
        // or empty then return zero
        if (str == null || str.isEmpty())
            return 0;

        // Splitting the string around
        // matches of the given regular
        // expression
        String[] words = str.split("\\s+");
        // Return number of words
        // in the given string
        return words.length;
    }
}
