/*
27. Find the sum of the series 2 +22 + 222 + 2222 + .. n terms
number_of_terms = 5
So series will become 2 + 22+ 222+ 2222+ 22222

 */
package com.click2career.loop_exercise;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = scanner.nextInt();
        calculateSum(n);
    }

    private static void calculateSum(int n) {
        int sum = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            sum = sum*10 +2;
            total =total+sum;
            System.out.print(sum+ " +");
        }
        System.out.println(" ="+total);
    }
}
