/*
7. Write a program that reads a range of numbers as input, and iterates it then prints the sum
of the even and odd integers.
Eg : 1 10
 */
package com.click2career.loop_exercise;
import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting Limit of range of Numbers ");
        int start = scanner.nextInt();
        System.out.println("Enter the final Limit of range of numbers ");
        int finish = scanner.nextInt();
        printSumOfEvenAndOdd(start, finish);

    }
    //prints the sum of even and odd number
    private static void printSumOfEvenAndOdd(int start, int finish) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = start; i <=finish; i++) {
            if(i%2==0)
                sumEven += i;
            else
                sumOdd +=i;
        }
        System.out.println("the sum of even integer is " + sumEven + " sum of odd integer is "+ sumOdd);
    }
}
