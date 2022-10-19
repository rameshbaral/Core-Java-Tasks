/*
17.Create a function that returns true when both the parameters are equal
else return false. isSameNum(4, 8) ➞ false
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class CheckParameters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first parameter ");
        int firstParameter = scanner.nextInt();
        System.out.println("enter second parameter ");
        int secondParameter = scanner.nextInt();
        boolean result = checkParameter(firstParameter, secondParameter);
        if (result)
            System.out.println("parameters are equal");
        else
            System.out.println("parameters are not equal");
    }
    //checks for input parameter equality
    private static boolean checkParameter(int firstParameter, int secondParameter) {
        return (firstParameter==secondParameter);
    }
}
