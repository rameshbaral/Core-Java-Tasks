/*
10.WAP to create an integer array of size 10 , read the array elements from the
user and display the array elements.
 */
package com.click2career.array_exercise;

import java.util.Scanner;

public class ReadAndDisplayArray {
    private static Scanner scanner = new Scanner(System.in);
    private static Integer[] arr;
    public static void main(String[] args) {
        System.out.println("Enter an array element of 10 integer");
        arr = readArrayElement(10);
        displayArrayElement(arr);
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
