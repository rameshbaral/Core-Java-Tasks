/*
d. Take two values fromNumber and toNumber. Your program should print based on
following criteria
i. Both fromNumber and toNumber should be greater than or equal to 0.
ii. If fromNumber is less than toNumber then print all the numbers from
fromNumber to toNumber ; inclusive fromNumber and exclusive
toNumber
iii. If fromNumber is greater than toNumber, swap the numbers and perform
the same process as above.
 */
package com.click2career.conditional_statement_exercise;

import java.util.Scanner;

public class FromToNumber {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int fromNumber = takeInput("enter fromNumber");
        int toNumber = takeInput("enter toNumber");

        //checks condition and prints the range of number
        if(fromNumber<toNumber){
            for (int i = fromNumber; i<=toNumber; i++){
                System.out.println(i);
            }
        }
        else {
            System.out.println("fromNumber>toNumber");
            int temp;
            temp = fromNumber;
            fromNumber = toNumber;
            toNumber = temp;
            for (int i = fromNumber; i<=toNumber; i++){
                System.out.println(i+"/n");
            }
        }
    }
    //takes input from user
    public static int takeInput(String prompt){
        System.out.println(prompt);
        int input;
        //checks if input is grater than zero
        while (true){
            input = sc.nextInt();
            if(!(input>=0))
                System.out.println("enter value grater than zero");
            else
                break;
        }
        return input;
    }
}
