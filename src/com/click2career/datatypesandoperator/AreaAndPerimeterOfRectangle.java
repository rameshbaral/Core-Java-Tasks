package com.click2career.datatypesandoperator;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of length and breadth");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        System.out.printf("the area of rectangle is %d%n", (length*breadth));
        System.out.printf("the perimeter of rectangle is %d%n", 2*(length+breadth));

    }
}
