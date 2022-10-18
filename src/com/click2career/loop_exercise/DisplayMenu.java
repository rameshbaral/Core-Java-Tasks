/*
32. Write a program to display menu :
1. Continue
2. Exit
If 1 is chosen then reshow the above menu.
If 2 is chosen, print how many times option 1 was chosen and terminate the program.
If any other value is provided as input then print invalid input and reshow the above
menu.
 */
package com.click2career.loop_exercise;

import java.util.Scanner;

public class DisplayMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int count = 0;
        //displays menu in repeat until 2 is pressed
        while (true){
            System.out.println("Press 1 To Continue\n Press 2 to Exit");
            input = scanner.nextInt();
            if(input == 1)
                count++;
            else if(input==2) {
                System.out.println("Option 1 was chosen "+ count+ " times");
                break;
            }
            else {
                System.out.println("enter correct input");
            }
        }
    }

}
