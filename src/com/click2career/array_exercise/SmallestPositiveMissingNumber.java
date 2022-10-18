/*
30. Find the smallest positive missing number.
Example:
Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing
number is 6.
 */
package com.click2career.array_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestPositiveMissingNumber {
    private static Scanner scanner = new Scanner(System.in);
    private static Integer[] arr;

    public static void main(String[] args) {
        System.out.println("enter the number of elements in array");
        Integer arraySize = scanner.nextInt();
        arr = readArrayElement(arraySize);
        getSmallestPositiveMissingNumber(arr);

    }
    //Finds the smallest positive missing number in an array
    private static void getSmallestPositiveMissingNumber(Integer[] arr) {
        int n = arr.length;
        //sorts array
        Arrays.sort(arr);
        //initializes number as the maximum number + 1
        int num = arr.length + 1;
        //traverse array backward
        for (int i = arr.length - 1; i >= 0; i--) {
            //if given index doesn't contain a number which is (index+1), assign it to num
            if (arr[i] != (i + 1)) {
                num = (i + 1);
            }
        }
        System.out.println("Smallest positive missing number is " + num);
    }

    //displays element of array
    private static void displayArrayElement(Integer[] arr) {
        System.out.println("the elements of array are");
        for (int i = 0; i<arr.length; i++ ){
            System.out.println(arr[i]);
        }
    }
    //reads array elements from user
    private static Integer[] readArrayElement(Integer size) {
        System.out.println("enter "+ size + " elements of array");
        arr = new Integer[size];
        for (int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

}
