/*
42.Create a simple java method to read String from users and manipulate that
data(like concatenation).
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class ConcatString {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        stringConcat();
    }
    // read String from users and manipulate that
    //data by concatinatin
    private static void stringConcat() {
        System.out.println("enter 2 strings ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String concatString = str1+str2;
        System.out.println(concatString);
    }
}

