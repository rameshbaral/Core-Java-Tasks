/*
17. Write a program to find the sum of digits in a number. Example : 123 = (1+2+3)
 */
package com.click2career.loop_exercise;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        int number = 412324242;
        int result = findSumOfDigitInNumber(number);
        System.out.println("the sum of digits of number "+number+" is "+result);
    }
    //returns sum of digits of number provided as input
    private static int findSumOfDigitInNumber(int number) {
        int sum = 0;
        while (number>0){
            int rem = number%10;
            sum +=rem;
            number /= 10;
        }
        return sum;
    }

}
