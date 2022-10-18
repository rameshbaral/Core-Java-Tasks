/*
16. Write a program that generates a random number and asks the user to guess what the
number is. If the user's guess is higher than the random number, the program should display
"Too high, try again." If the user's guess is lower than the random number, the program
should display "Too low, try again." The program should use a loop that repeats until the
user correctly guesses the random number.

 */
package com.click2career.loop_exercise;

import java.util.Scanner;

public class GuessRandomNumber {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //generates random number between 1 and 100
        int randomNumber = (int)(Math.random()*100);
        //System.out.println(randomNumber);

        System.out.println("enter a random guess");
        //run until user enters correct value
        while (true){
            int input = scanner.nextInt();
            //checks if input is correct and breaks out of loop if correct input is provided
            if (input==randomNumber){
                System.out.println("you guessed it correct");
                break;
            }
            //checks if input is less than random number and prompts user to enter lower value
            else if(randomNumber<input){
                System.out.println("Too high, try again.");
            }
            //prompts users to enter higher value
            else
                System.out.println("Too low, try again.");
        }
    }
}
