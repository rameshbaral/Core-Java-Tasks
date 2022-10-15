package com.click2career.datatypes_and_operator_exercise;

import java.util.Scanner;

public class AverageOfFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.printf("the average of three number is %.2f%n", (double)(a+b+c+d+e)/5);

    }
}
