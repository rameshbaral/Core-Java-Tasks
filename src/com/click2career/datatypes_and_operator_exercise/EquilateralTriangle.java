package com.click2career.datatypes_and_operator_exercise;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter measurement of 3 sides ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && a==c && b==c)
            System.out.println("the triangle is equilateral");
        else
            System.out.println("triangle is scalane");


    }
}

