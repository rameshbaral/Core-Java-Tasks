/*
11. WAP that displays all the odd numbers from range void displayOddNumbers(int
start , int end)

 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class DisplayOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number");
        int start = scanner.nextInt();
        System.out.println("Enter the ending number");
        int end = scanner.nextInt();
        displayOddNumbers(start, end);
    }
    //displays the list of odd numbers
    private static void displayOddNumbers(int start, int end) {
        System.out.println("list of odd numbers ");
        for (int i = start; i <=end; i++) {
            if (!(i%2==0))
                System.out.print(i+", ");

        }
    }
}
