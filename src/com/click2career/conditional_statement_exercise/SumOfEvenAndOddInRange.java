package com.click2career.conditional_statement_exercise;

import java.util.Scanner;

public class SumOfEvenAndOddInRange {
    public static void main(String[] args) {
        int lowerLimit;
        int upperLimit;

        System.out.println("enter lower limit of number");
        Scanner sc = new Scanner(System.in);
        lowerLimit = sc.nextInt();
        System.out.println("enter the upper limit of range of number");
        upperLimit = sc.nextInt();
        printSumOfEvenAndOdd(lowerLimit,upperLimit);

    }
    public static void printSumOfEvenAndOdd(int lower, int upper){
        int oddSum = 0;
        int evenSum = 0;
        for(int i = lower; i<upper;i++){
            if(i%2== 0)
                evenSum = i+evenSum;
            else
                oddSum = i+oddSum;
        }
        System.out.println("sum of even number of lower range " + lower +" and upper range "+ upper+ " is "+evenSum);
        System.out.println("sum of even number of lower range " + lower +" and upper range "+ upper +" is "+oddSum);
    }

}
