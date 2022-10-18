/*
28. WAP to find the frequency of each digit in a given integer.
Sample Output:
Input any number: 122345
The frequency of 0 = 0
The frequency of 1 = 1
The frequency of 2 = 2
The frequency of 3 = 1
The frequency of 4 = 1
The frequency of 5 = 1
The frequency of 6 = 0
The frequency of 7 = 0
The frequency of 8 = 0
The frequency of 9 = 0
 */
package com.click2career.loop_exercise;

import java.util.Scanner;

public class FrequencyOfEachDigit {
    public static void main(String[] args) {
        System.out.println("Enter the user input number");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        checkFrequencyOfDigits(userInput);
    }
    //checks frequency of each digit in the user Input
    private static void checkFrequencyOfDigits(int userInput) {
        int originalNumber = userInput;
        int digitNumber = 0;
        while (userInput > 0) {
            userInput = userInput / 10;
            digitNumber++;
        }
        for (int i = 0; i < 10; i++) {
            int frequencyCounter = 0;
            int secondDummyNumber = originalNumber;
            for (int j = 0; j < digitNumber; j++) {
                int digit = secondDummyNumber % 10;
                secondDummyNumber = secondDummyNumber / 10;
                if (digit == i) {
                    frequencyCounter++;
                }
            }
            System.out.println("The frequency of " + i + " = " + frequencyCounter);
        }
    }
    }


