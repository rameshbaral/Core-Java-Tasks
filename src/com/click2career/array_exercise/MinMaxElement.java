/*
14. Find the minimum and maximum element in an array.
 */
package com.click2career.array_exercise;

public class MinMaxElement {
    public static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        int min = findLargestElement(arr);
        int max = findLargestElement(arr);
        System.out.println("the minimum element is "+ min + " maximum element is "+ max);
    }

    //finds the smallest element in the array
    private static int findSmallestElement(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (smallest>arr[i])
                smallest = arr[i];
        }
        return smallest;
    }
    //finds the largest element in the provided array
    private static int findLargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(largest<arr[i])
                largest = arr[i];
        }
        return largest;
    }
}
