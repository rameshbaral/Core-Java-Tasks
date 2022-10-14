package com.click2career.datatypesandoperator;

import java.util.Scanner;

public class PerimeterAndAreaOfCircle {
    public static void main(String[] args) {
        final double PI = 3.1415926536;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of length and breadth");
        int radius = sc.nextInt();
        System.out.printf("the area of circle is %.2f%n",PI*(radius*radius));
        System.out.printf("the perimeter of circle  is %.2f%n", 2*PI*radius);
    }
}
