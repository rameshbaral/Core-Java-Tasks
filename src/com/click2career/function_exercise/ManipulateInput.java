/*
41.Create a simple java method to read integers from users and manipulate that
data(like addition).

 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class ManipulateInput {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        manipulateInput();
    }
    //reads input from user and manipulate that data
    private static void manipulateInput() {
        System.out.println("enter two integers");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        input1++;
        input2++;
    }
}
