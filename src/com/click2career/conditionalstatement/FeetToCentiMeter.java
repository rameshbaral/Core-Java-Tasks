package com.click2career.conditionalstatement;

import java.util.Scanner;

public class FeetToCentiMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in Feet");
        float height = sc.nextFloat();
        System.out.printf("your height in cm is %.2f%n cm", height*30);

    }
}
