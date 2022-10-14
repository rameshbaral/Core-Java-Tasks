/*
h) Write a program for the restaurant console application. At first, an application
prints the menu for the items along with their prices and allows the customer to
choose from the list by taking input from the keyboard. Based on the customer’s
inputs, print the chosen items and total price.
For example: Let's say following is the list of items
1. Mo:Mo Chicken 150
2. Mo:Mo Buff 120
3. Mo:Mo Veg 100
4. Burger Chicken 150
If the customer chosen two items as Mo:Mo Chicken and Burger Chicken
then the console output should be as follows:
Chosen items:
1. Mo:Mo Chicken 150
2. Burger Chicken 150
Total price 300
 */

package com.click2career.conditionalstatement;

import java.util.Scanner;

public class RestaurantConsole {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();

    }

    public static void displayMenu() {
        int numberOfChoices;
        int totalPrice = 0;
        //displays menu options
        System.out.println("--------------------RESTAURANT MENU----------------------------\n" +
                "Choose 1. Mo:Mo Chicken 150\n" +
                "Choose 2. Mo:Mo Buff 120\n" +
                "Choose 3. Mo:Mo Veg 100\n" +
                "Choose 4. Burger Chicken 150"
        );
        System.out.println("number of choices option");
        numberOfChoices = sc.nextInt();

        //initializes the choice array
        int[] choices = new int[numberOfChoices];

        // takes the number of input from user
        for (int i = 0; i < numberOfChoices; i++) {
            System.out.println("Enter the items number as displayed on Menu");
            int currentChoice = sc.nextInt();
            while (true){
                if (!(currentChoice>=1 && currentChoice<=4)) {
                    System.out.println("enter the correct value in range 1 to 4");
                    currentChoice = sc.nextInt();
                }
                else{
                    choices[i] = currentChoice;
                    break;
                }
            }
        }

        //displays all choices with total price
        System.out.println("your choices are: ");
        for (int i = 0; i < numberOfChoices; i++) {
            switch (choices[i]) {
                case 1 -> {
                    totalPrice = totalPrice + 150;
                    System.out.println((i + 1) + " Mo:Mo Chicken @150");
                }
                case 2 -> {
                    totalPrice = totalPrice + 120;
                    System.out.println((i + 1) + " Mo:Mo Buff @120");
                }
                case 3 -> {
                    totalPrice = totalPrice + 100;
                    System.out.println((i + 1) + " Mo:Mo Veg @100");
                }
                case 4 -> {
                    totalPrice = totalPrice + 150;
                    System.out.println((i + 1) + " Burger Chicken @150");
                }
                default -> System.out.println((i + 1) + " Invalid input");
            }

        }
        System.out.println("Total price " + totalPrice);
    }


}



