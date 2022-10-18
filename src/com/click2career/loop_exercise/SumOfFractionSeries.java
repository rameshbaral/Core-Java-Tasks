/*
15. Write a program to calculate the sum of the following series where n is input by
user. 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
where n is a positive integer and input by user
 */
package com.click2career.loop_exercise;

import java.util.Scanner;

public class SumOfFractionSeries {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter value of n");
        int n = scanner.nextInt();
        float result = calculateSum(n);
        System.out.println("the result is "+ result);
    }
    //calculates sum of the series
    private static float calculateSum(int n) {
        float sum = 0;
        for (float i = 1; i <=n; i++) {
            sum += (float)(1/i);
        }
        return sum;
    }
}
