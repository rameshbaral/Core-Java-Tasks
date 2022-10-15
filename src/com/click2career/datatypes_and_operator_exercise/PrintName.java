package com.click2career.datatypes_and_operator_exercise;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
//1.Write a program to take name input from the user and display Hello +name as output
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name ");
        String enteredName = sc.nextLine();
        System.out.println("your name is " + enteredName);
    }
}
