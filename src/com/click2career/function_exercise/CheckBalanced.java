/*
40. An array is called balanced if it’s even number elements (a[0],a[2],etc.) are even
and its odd numbered elements (a[1],a[3],etc.) are odd. Write a function named
Balanced that accepts an array of integers and returns 1 if the array is balanced
otherwise it returns 0.
 */
package com.click2career.function_exercise;

public class CheckBalanced {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4};
        int result = checkBalance(arr);
        if (result == 1)
            System.out.println("the array is balanced");
        else
            System.out.println("the array is unbalanced");

    }

    private static int checkBalance(int[] arr) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (!(arr[i] % 2 == 0)) {
                    flag = 1;
                    break;
                }

            }
            if (i % 2 != 0) {
                if (arr[i] % 2 == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0)
            return 1;
        else return 0;
    }

}
