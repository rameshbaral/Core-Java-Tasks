/*
h. Show 5 options to user
i. CREATE , READ , UPDATE , DELETE
ii. Let user choose any one of the option
iii. Under every option ask user the number of times
iv. Print the option name to the number of times that user enters.
v. If
a user enters the option which is not in the option list display TRY
AGAIN !!
 */

package com.click2career.conditional_statement_exercise;

import java.util.Scanner;

public class CRUD {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] options = {"CREATE", "READ", "UPDATE", "DELETE"};

    public static void main(String[] args) {

        int selectedOption;
        System.out.println("Enter 1 For CREATE \n 2 For READ \n 3 For UPDATE \n 4 For DELETE");
        //takes input from user and checks if correct option has been selected
        while (true) {
            selectedOption = scanner.nextInt();
            if (selectedOption >= 1 && selectedOption <= 4) {
                break;
            }
            else {
                System.out.println("TRY AGAIN !!");
                System.out.println("Enter\n 1 For CREATE \n 2 For READ \n 3 For UPDATE \n 4 For DELETE");
            }
        }
        System.out.println("How many times you want to perform operation \n ");
        int numberOfTimes = scanner.nextInt();
        operation(numberOfTimes,selectedOption);
    }

    public static void operation(int numberOfTimes, int selected) {
        for (int i = 0; i<numberOfTimes; i++){
            System.out.println(options[selected-1]);
        }
    }

}
