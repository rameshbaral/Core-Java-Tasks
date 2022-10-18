/*
    22. Find the first non-repeating element in a given array of integers.

 */
package com.click2career.array_exercise;

public class NonRepeatingElement {
    public static void main(String[] args) {
        // initializes  array
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        //checks for first non repeating element in array
        //outer loop to traverse all the elements
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            //inner loop to traverse all the elements coming after index i
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag==0) {
                System.out.println("First Non Repeating element of array is "+arr[i] );
                break;
            }
        }

    }
}
