/*
25. Find the factorial of a largest number in an array.
 */

package com.click2career.array_exercise;

import java.util.Arrays;

public class FactorialOfLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int largestElement = findLargestElement(arr);
        int factorial = calculateFactorial(largestElement);
        System.out.println("The largest element of array is "+ largestElement+" and it's factorial is "+ factorial);

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

    //calculates the factorial of the provided number
    private static int calculateFactorial(int num) {
        int fact = 1;
        for (int i=1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }
}

