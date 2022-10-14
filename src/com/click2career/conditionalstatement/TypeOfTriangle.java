package com.click2career.conditionalstatement;

import java.util.Scanner;

public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstSide, secondSide, thirdSide;
        System.out.println("enter the first side measurement");
        firstSide = sc.nextInt();
        System.out.println("enter the second side measurement");
        secondSide = sc.nextInt();
        System.out.println("enter the third side measurement");
        thirdSide = sc.nextInt();

        findTypeOfTriangle(firstSide,secondSide,thirdSide);
    }

    public static void findTypeOfTriangle(int side1, int side2, int side3){
        if(side1==side2 && side1 == side3 && side2 ==side3)
            System.out.println("tirangle is equilateral");
        if(side1==side2 || side1 == side3 || side2 == side3)
            System.out.println("triangle is isosceles ");
        else
            System.out.println("triangle is scalene  ");
    }
}
