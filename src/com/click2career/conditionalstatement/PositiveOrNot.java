package com.click2career.conditionalstatement;

import java.util.Scanner;

public class PositiveOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check");
        int number = sc.nextInt();
        if(number > 0)
            System.out.println(number+ " is positive");
        else if(number == 0)
            System.out.println(number + " is Zero");
        else
            System.out.println(number + " is negative");

    }
}
