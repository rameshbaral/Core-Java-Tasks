/*
4. Write a program to print the circumference and area of a circle of radius entered
by the user by defining your own method.
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class AreaAndCircumference {
    public static final Float PI = 3.141592653f;
    //returns area and circumference of entered radius of circle
    public void printAreaAndCircumference(Float radius){
        float circumference = 2*PI*radius;
        float area = PI*radius*radius;
        System.out.println("the circumference of circle is "+ circumference+ " and area of circle is "+ area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaAndCircumference areaAndCircumference = new AreaAndCircumference();
        System.out.println("enter the radius of circle");
        Float radius = scanner.nextFloat();
        areaAndCircumference.printAreaAndCircumference(radius);
    }
}
