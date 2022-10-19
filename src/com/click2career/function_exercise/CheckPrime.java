/*
12.WAP that check a prime number boolean checkPrime(int testNumber)

 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int input = scanner.nextInt();
        boolean result = checkPrime(input);
        if(result)
            System.out.println(input+" is a prime number");
        else
            System.out.println(input+" is not a prime number");
    }

    private static boolean checkPrime(int input) {
        int flag = 0;
        for (int i = 2; i <input ; i++) {
            if(input%i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag>0)
            return false;
        else
            return true;
    }
}
