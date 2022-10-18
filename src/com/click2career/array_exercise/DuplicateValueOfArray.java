/*
35. Write a java program to find the duplicate values of an array of string
values.
 */
package com.click2career.array_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateValueOfArray {
    public static void main(String[] args) {
        String[] str = {"ra", "banana", "mango", "apple"};
        findDuplicate(str);

    }

    //finds the duplicate value in the array  of string
    private static void findDuplicate(String[] str) {
        List<String> duplicate = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    duplicate.add(str[i]);
                }
            }
        }
        System.out.println("Duplicate Strings in " + Arrays.toString(str) + " : " + duplicate);
    }
}

