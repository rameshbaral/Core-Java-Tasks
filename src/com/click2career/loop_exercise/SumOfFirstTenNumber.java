/*
2. Write a program to calculate the sum of the first 10 natural numbers.
 */
package com.click2career.loop_exercise;

public class SumOfFirstTenNumber {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=10; i++ ){
            sum +=i;
        }
        System.out.println("the sum of first 10 number is "+ sum);
    }
}
