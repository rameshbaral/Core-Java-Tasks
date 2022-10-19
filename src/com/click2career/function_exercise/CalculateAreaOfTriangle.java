/*
31.Write Java methods to calculate the area of a triangle.
Expected Output:
Input Side-1: 10
Input Side-2: 15
Input Side-3: 20
The area of the triangle is 72.6184377413890

 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class CalculateAreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of side-1 of triangle");
        float side1 = scanner.nextFloat();
        System.out.println("enter the value of side-2 of triangle");
        float side2 = scanner.nextFloat();
        System.out.println("enter the value of side-3 of triangle");
        float side3 = scanner.nextFloat();
        calculateArea(side1,side2,side3);

    }
    //calculates and prints area of triangle of given input
    private static void calculateArea(float a, float b, float c) {
        float s = (float) (a + b + c) / 2;
        float underRoot = (float) (s * (s - a) * (s - b) * (s - c));
        float area = (float) Math.pow(underRoot, 0.5f);
        System.out.println("The area of the triangle is "+area);
    }
}
