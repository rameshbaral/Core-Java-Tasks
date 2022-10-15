/*
15. Wap to reverse the array.
 */
package com.click2career.array_exercise;

public class ReverseArray {
    public static int[] arr = {1,2,3,4,5};
    public static void main(String[] args) {

        int[] reversedArr = reverseArray(arr);
        System.out.println("original array");
        displayArrayElement(arr);
        System.out.println();
        System.out.println("reversed array");
        displayArrayElement(reversedArr);
    }
    //reverse the element of array
    private static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        int j = arr.length -1;
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[j];
            j--;
        }
        return reversed;
    }
    //displays element of array
    private static void displayArrayElement(int[] arr) {
        System.out.println("the elements of array are");
        for (int i = 0; i<arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
}
