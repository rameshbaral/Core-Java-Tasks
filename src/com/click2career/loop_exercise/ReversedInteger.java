/*
6. Write a program that prompts the user to input an integer and then outputs the number with
the digits reversed. For example, if the input is 12345, the output should be 54321.

 */
package com.click2career.loop_exercise;

import java.util.Scanner;

public class ReversedInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int inputNumber = scanner.nextInt();
        System.out.println("Input number is "+ inputNumber);
        int reversedNumber = reverseNumber(inputNumber);
        System.out.println("the reversed digit is "+ reversedNumber);
    }
    //finds reverse of given input number
    private static int reverseNumber(int inputNumber) {
        int inputSum =0;
        while (inputNumber !=0){
            inputSum = inputSum*10 + inputNumber%10;
            inputNumber /=10;
        }
        return inputSum;
    }

}
