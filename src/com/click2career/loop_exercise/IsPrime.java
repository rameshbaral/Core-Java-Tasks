/*
8. Write a program that prompts the user to input a positive integer. It should then output a
message indicating whether the number is a prime number.
 */
package com.click2career.loop_exercise;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int input = scanner.nextInt();
        isPrime(input);


    }
    //checks if input number is prime or not
    private static void isPrime(int input) {
        int flag = 0;
        for (int i = 2; i <input ; i++) {
            if(input%i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag>0)
            System.out.println(input +" is not a prime number");
        else
            System.out.println(input + " is a prime number");
    }
}
