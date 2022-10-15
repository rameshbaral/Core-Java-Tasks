/*
13. Create a array with elements
and then find and display using functions
a. All the even numbers of an array
b. All the odd numbers of an array
c. All the prime numbers
d. All the negative numbers of an array
e. All the numbers exactly divisible by 5
f. Largest element in the array
g. Second largest element in the array
h. Sum of all the numbers
i. Sum of all the prime numbers
j. Copy all the negative numbers in separate array
k. Copy all the positive numbers in a separate array and increment every
element by 10
 */
package com.click2career.array_exercise;

import java.util.Arrays;

public class ArrayElementsOperation {
    private static int[] arr = {1, 2, 3, 4, 5, 6, -6, -7, 10};

    public static void main(String[] args) {
        displayEven(arr);
        displayOdd(arr);
        displayPrime(arr);
        displayDivisibleBy5(arr);
        displayNegative(arr);
        displayLargestElement(arr);
        displaySecondLargestElement(arr);
        displaySum(arr);
        displayPrimeSum(arr);
        copyNegative(arr);
        copyPositiveAndIncrementByTen(arr);
    }

    // finds and displays even numbers in an array
    public static void displayEven(int[] arr) {
        System.out.print("Even numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    // finds and displays All the odd numbers of an array
    public static void displayOdd(int[] arr) {
        System.out.print("Odd numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    // finds and displays All the prime numbers
    public static void displayPrime(int[] arr) {
        System.out.print("list of prime numbers is ");
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] < 2 || arr[i] % j == 0)
                    flag = 1;
                break;
            }
            if (flag == 0 && arr[i] >= 2)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // finds and displays the negative numbers of an array
    public static void displayNegative(int[] arr) {
        System.out.print("Negative numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    // finds and displays the  numbers divisible by 5
    public static void displayDivisibleBy5(int[] arr) {
        System.out.print("Numbers exactly divisible by 5 in the array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    // finds and display the largest number of an array
    public static void displayLargestElement(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Largest number in the array: " + arr[arr.length - 1]);
    }

    // finds and display the second-largest number of an array
    public static void displaySecondLargestElement(int[] arr) {
        Arrays.sort(arr);
        System.out.println("The second largest element in the array is " + arr[arr.length - 2]);
    }

    // finds and display the sum of all the elements inside an array
    public static void displaySum(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        System.out.println("The sum of all the elements in the array is " + sum);
    }

    // finds and display the sum of all the elements inside an array
    public static void displayPrimeSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] < 2 || arr[i] % j == 0)
                    flag = 1;
                break;
            }
            if (flag == 0 && arr[i] >= 2)
                sum += arr[i];
        }
        System.out.println("Sum of the number prime numbers is "+sum);
        System.out.println();
    }

    // finds and display all the negative numbers in a separate array
    public static void copyNegative(int[] arr) {
        //usr filter() to filter out the negative numbers and reassign them to our array
        arr = Arrays.stream(arr).filter(x -> x < 0).toArray();
        System.out.println("Negative elements in separate array " + Arrays.toString(arr));
    }

    // finds and displays all the positive numbers in a separate array and increments each element by 10
    public static void copyPositiveAndIncrementByTen(int[] arr) {
        //usr filter() to filter out the positive numbers
        arr = Arrays.stream(arr).filter(x -> x > 0).toArray();
        //loop to increment each element by 10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 10;
        }
        System.out.println("Positive elements in separate array with each element incremented by 10 " + Arrays.toString(arr));
    }






}
