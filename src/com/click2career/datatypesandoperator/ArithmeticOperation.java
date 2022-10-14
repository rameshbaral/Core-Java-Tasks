package com.click2career.datatypesandoperator;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number1 <= 0 || number2 <= 0) {
            System.out.println("Enter number grater than zero");
        } else {
            System.out.printf("sum is %d%n ", number1 + number2);
            System.out.printf("difference is %d%n ", number1 - number2);
            System.out.printf("product is %d%n ", number1 * number2);
            System.out.printf("Quotient is is %.2f%n ", (double) number1 / number2);
            System.out.printf("Reminder is %d%n", number1 % number2);
        }
    }
}
