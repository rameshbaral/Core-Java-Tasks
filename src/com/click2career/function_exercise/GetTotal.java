/*
33. Write a program with a method named getTotal that accepts two
integers as an argument and return its sum. Call this method from
main( ) and print the results
 */
package com.click2career.function_exercise;

public class GetTotal {
    public static void main(String[] args) {
        int arg1 = 2;
        int arg2 = 4;
        int sum = getTotal(arg1,arg2);
        System.out.println("the sum is "+sum);
    }

    private static int getTotal(int arg1, int arg2) {
        return arg1+arg2;
    }
}
