package com.click2career.array_exercise;

import java.util.HashSet;
import java.util.Set;

public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = {1,-1,3,-1,4,5,6};
        checkSum(arr);

    }

    /**
     * Checks if any sub array has equal sum or not
     * @param array parent array
     * @return true if subarray has 0 sum otherwise false
     */
    public static boolean isSubArraySumZero(int[] array) {
        int sum = 0;
        Set<Integer> set = new HashSet<Integer>();
        //traverse all elements
        for (int i = 0; i < array.length; i++) {
            //calculates sum
            sum += array[i];
            //return true if
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map, this means there are some elements in between which cancel each other
            // as a result sum is constant or repeated
            if (array[i] == 0 || sum == 0 || set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    public static void checkSum(int[] arr){
        if (isSubArraySumZero(arr)) {
            System.out.println("Yes, the array has a sub array with sum equal to zero");
        } else {
            System.out.println("No, the array doesn't have a sub array with sum equal to zero");
        }
    }
}
