/*
36. Write a java program to find the second smallest element in an array.

 */
package com.click2career.array_exercise;

public class FindSecondSmallestElement {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 4, 6, 8, 10};
        findSecondSmallestElement(arr);

    }
    //finds the second-smallest element of provided array
    private static void findSecondSmallestElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second smallest element: " + arr[1]);
    }
}

