/*
9. WAP to check whether a number is even or odd using function. The function name
should be isEven(int parameter), which returns true if the number is even and
return false if the number is odd.

 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class IsEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to check");
        int inputNumber = scanner.nextInt();
        boolean result = isEven(inputNumber);
        if(result)
            System.out.println(inputNumber+" is even");
        else
            System.out.println(inputNumber+ " is odd");
    }
    //returns true if input number is even else returns false
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

}
