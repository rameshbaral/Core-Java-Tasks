/*
19. Count pairs with given sum
Example:
Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation:
arr[0] + arr[1] = 1 + 5 = 6
and arr[1] + arr[3] = 5 + 1 = 6.
 */
package com.click2career.array_exercise;

import java.util.Scanner;

public class CountPairs {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter size of array");
        int arrSize = scanner.nextInt();
        System.out.println("enter " + arrSize + " elements of array");
        int[] arr = readArrayElement(arrSize);
        displayArrayElement(arr);
        System.out.println("enter value of summation of 2 elements of array");
        int sum = scanner.nextInt();
        int resultCount = checkSum(arr, sum);
        System.out.println("the number of pairs satisfying condition is " + resultCount);

    }

    //checks for satisfying pair of elements of array
    private static int checkSum(int[] arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum)
                    count += 1;
            }

        }
        return count;
    }

    //reads array elements from user
    private static int[] readArrayElement(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    //displays element of array
    private static void displayArrayElement(int[] arr) {
        System.out.println("the elements of array are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

