/*
14.WAP to print the multiplication table of a number using a function
printMultiplication(int inputNumber)

 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class PrintMultiplicationTable {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int inputNumber = scanner.nextInt();
        printMultiplication(inputNumber);
    }
    //prints the table
    public static void printMultiplication(int num){
        System.out.println("the table of" + num +"is as follows");
        for (int i = 1; i<=10; i++){
            System.out.printf(num+ "*" +i +"="+"%d%n",(i*num));
        }
    }
}
