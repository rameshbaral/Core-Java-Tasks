/*
34. Write a program in java to swap two numbers using a function.
 */
package com.click2career.function_exercise;

public class SwapNumbers {
    int firstNumber;
    int secondNumber;

    public SwapNumbers(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public static void main(String[] args) {
        SwapNumbers obj = new SwapNumbers(1,2);
        System.out.println("before Swapping firstNumber "+obj.firstNumber+" secondNumber "+obj.secondNumber);
        obj.swap();
        System.out.println("after Swapping firstNumber "+obj.firstNumber+" secondNumber "+obj.secondNumber);
    }
    //swaps the given input of numbers
    private  void swap() {
        int temp = this.firstNumber;
        this.firstNumber = this.secondNumber;
        this.secondNumber = temp;
    }
}
