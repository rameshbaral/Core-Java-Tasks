/*
38. Write a java program to find all pairs of elements in an array whose sum is
equal to a specified number.
 */
package com.click2career.array_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindPairEqualsToSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 7, 4, -5, 11, 5, 20};
        System.out.println("The Array is "+ Arrays.toString(arr));
        System.out.println("Enter a summation");
        int summation = scanner.nextInt();
        printPairSum(arr, summation);
    }
    //find all pairs of elements in an array whose sum is
    //equal to a specified number
    private static void printPairSum(int[] inputArray, int inputNumber) {
        System.out.println("Pairs of elements and their sum : ");

        for (int i =  0; i < inputArray.length; i++)
        {
            for (int j  = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+inputNumber);
                }
            }
        }
    }
}
