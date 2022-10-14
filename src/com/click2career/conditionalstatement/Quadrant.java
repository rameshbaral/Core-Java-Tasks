package com.click2career.conditionalstatement;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.println("enter the value of X coordinate");
        x = sc.nextInt();
        System.out.println("enter the value of Y coordinate");
        y = sc.nextInt();
        if(x>0 && y>0)
            System.out.println("point lies on First Quadrant Q1");
        else if(x<0 && y>0)
            System.out.println("point lies on Second Quadrant Q2");
        else if(x<0 && y<0)
            System.out.println("point lies on third quadrant Q3");
        else
            System.out.println("point lies on fourth quadrant Q4");

    }
}
