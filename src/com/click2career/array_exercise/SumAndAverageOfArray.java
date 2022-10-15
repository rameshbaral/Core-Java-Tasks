/*
11.WAP to sum and average the elements of any array. Size of the array
should be defined by the user and also input should be provided by the
user
 */
package com.click2career.array_exercise;

import java.util.Scanner;

public class SumAndAverageOfArray {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] arr;
    public static void main(String[] args) {
        System.out.println("enter size of an array");
        int size = scanner.nextInt();
        readArrayElements(size);
        int sum = sumArrayElements(arr);
        float average = averageArrayElements(arr);
        System.out.println("sum of array is "+ sum+ " and average of array is "+ average);

    }
    //returns average of array elements
    private static float averageArrayElements(int[] arr) {
        int sum = sumArrayElements(arr);
        return sum/arr.length;
    }
    //returns sum of array elements
    private static int sumArrayElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //reads array elements from user
    private static void readArrayElements(int size) {
        System.out.println("enter " + size + "elements of array ");
        arr = new int[size];
        for (int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
    }
}
