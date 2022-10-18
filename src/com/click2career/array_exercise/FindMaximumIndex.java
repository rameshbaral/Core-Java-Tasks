/*
31. Find the maximum index.
 */
package com.click2career.array_exercise;

public class FindMaximumIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        findMaxIndex(arr);
    }
    //finds the maximum index of array
    private static void findMaxIndex(int[] arr) {
        System.out.println("The maximum index of the array is " + (arr.length - 1));

    }
}
