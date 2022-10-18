/*
33. Write a java program to remove a specific element from an array.
 */
package com.click2career.array_exercise;

import java.util.Arrays;

public class RemoveSpecificElement {
    public static int arr[] = {1, 2, 3, 4, 5};
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before deletion: " + Arrays.toString(arr));
        removeAnElementInArray(arr, num);


    }

    private static void removeAnElementInArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
        int[] smallArray = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            smallArray[i] = arr[i];
        }
        arr = smallArray;
        System.out.println("After deletion: " + Arrays.toString(arr));
    }
}
