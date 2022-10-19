/*
15.WAP a java program that takes a number and returns the length of the number.

 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class LengthOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to calculate length");
        int input = scanner.nextInt();
        int length = calculateLength(input);
        System.out.println("the number of digits in "+ input+ " is "+length);
        
    }

    private static int calculateLength(int input) {
        int count = 0;
        while (input>0){
            input/=10;
            count++;
        }
        return count;
    }
}
