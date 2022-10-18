/*
4. Write a program to print the circumference and area of a circle of radius entered
by the user by defining your own method
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class ProductOfTwoNumber {
    //returns product of two number
    public int productOfTwoNumber(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two number ");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        ProductOfTwoNumber productOfTwoNumber = new ProductOfTwoNumber();
        int total = productOfTwoNumber.productOfTwoNumber(firstNum,secondNum);
        System.out.println("the result is "+total);
    }

}
