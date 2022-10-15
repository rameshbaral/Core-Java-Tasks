/*
17. Find the occurrence of an integer in the array.
 */
package com.click2career.array_exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OccurrenceOfInteger {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, -6, -7, 10};

    public static void main(String[] args) {
        System.out.println("enter number you want to check");
        int check = scanner.nextInt();
        checkOccurrence(check, arr);
    }

    public static void checkOccurrence(int num, int[] arr) {
        int count = 0;
        //loop to find the occurance
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println("Our Array is "+ Arrays.toString(arr));
        System.out.println("The element " + num + " occurs " + count + " times in our array.");
    }

}
