
/*
27. Find maximum sum subarray
 */
package com.click2career.array_exercise;

public class MaximumSumSubArray {

    public static void main(String[] args) {

        //array initialization and value assignment
        int[] arr = {3, 4, -3, 7, 2, 4, -2, 2, 4, 5};
        findMaxSum(arr);
    }
    //finds the maximum sum and prints it
    public static void findMaxSum(int[] arr){
        //initially assigns value to maxsum and sum equal to first element
        int maxSum = arr[0];
        int sum = arr[0];
        //loop through each element to find the sum
        for (int i = 0; i < arr.length; i++) {
            if (sum < 0) {
                sum = arr[i];
            } else {
                sum = sum + arr[i];
            }
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println("The maximum possible sum of sub-array is " + maxSum);

    }
}
