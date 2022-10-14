package com.click2career.conditionalstatement;

import java.util.Scanner;

public class EqualityOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 Nos to compare ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        if (firstNumber == secondNumber)
            System.out.println("Numbers are equal");
        else
            System.out.println("Number are not equal");
    }
}
