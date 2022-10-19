/*
22. Write a value-returning method, isVowel that returns the value true if
a given character is a vowel, and otherwise returns false. In main()
method accept a string from the user and count the number of vowels in
that string.
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class IsVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character to check");
        String input = scanner.nextLine();
        int count = 0;
        //for each character of the input string checks if it is vowel or not
        for (char c : input.toCharArray()) {
            if (checkVowel(c)) {
                count++;
            }
        }
        System.out.println("There are " + count + " vowels in the given String.");
        scanner.close();

    }
    //checks if the input character is vowel
    public static boolean checkVowel(char c) {
        String str = String.valueOf(c);
        c = str.toLowerCase().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}
