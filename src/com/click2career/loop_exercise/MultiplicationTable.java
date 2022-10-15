/*
3. Write a program that prompts the user to input a positive integer. It should then print the
multiplication table of that number.
 */
package com.click2career.loop_exercise;

import java.util.Scanner;

public class MultiplicationTable {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int inputNumber = scanner.nextInt();
        printTable(inputNumber);
    }
    //prints the table
    public static void printTable(int num){
        System.out.println("the table of the number is as follows");
        for (int i = 1; i<=10; i++){
            System.out.printf(num+ "*" +i +"="+"%d%n",(i*num));
        }
    }
}
