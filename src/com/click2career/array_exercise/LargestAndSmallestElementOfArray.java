/*
12.WAP to find the largest and smallest element in the array.
 */
package com.click2career.array_exercise;

import java.util.Scanner;

public class LargestAndSmallestElementOfArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int largest = findLargestElement(arr);
        int smallest = findSmallestElement(arr);
        System.out.println("the largest element is "+largest+" and the smallest element is "+smallest);
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
