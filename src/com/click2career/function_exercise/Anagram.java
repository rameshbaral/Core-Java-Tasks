/*
38.Write a program in java to check whether two given strings are an
anagram.
Test Data :
Input the first String : spare
Input the second String : pears
Expected Output :
spare and pears are Anagram
 */
package com.click2career.function_exercise;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "spare", str2 = "pears";
        checkAnagram(str1,str2);

    }

    private static void checkAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if length is same
        if(str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }
}
