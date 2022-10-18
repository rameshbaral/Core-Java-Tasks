/*
32. Write a java program to calculate the average value of array elements.
 */
package com.click2career.array_exercise;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        findAverageOfElements(arr);
    }

    private static void findAverageOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        float avg = (float) sum / (float) (arr.length);
        System.out.println("Average: " + avg);
    }
}

