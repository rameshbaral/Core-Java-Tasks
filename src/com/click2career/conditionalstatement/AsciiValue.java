/*
e. Take a string input from the user and display the same string incrementing the
ascii value by 1. You should exclude the special characters.
Eg: abc$abc should be bcd$bcd

 */
package com.click2career.conditionalstatement;

import java.util.Scanner;

public class AsciiValue {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a string you want to convert");
        String input = scanner.nextLine();

        //checks if provided siting is empty
        if(input.length()<1){
            System.out.println("Empty string");
            return;
        }

        char[] arr = input.toCharArray();
        System.out.println("your Input value is "+input);

        //increments the ascii value  of every character of the array by 1
        for(int i=0;i<arr.length;i++){
            //fetches the ascii value of the character and stores it into an integer
            int asciiValue = (int)arr[i];

            //checks if the character is alphabet or not
            if((asciiValue>=65&&asciiValue<=90)||(asciiValue>=97&&asciiValue<=122)){
                arr[i]=(char)(asciiValue+1);
            }
        }

        //stores the updated character array into a new string
        String newValue = String.valueOf(arr);
        //displays the new result
        System.out.println("After incrementing the ascii value of the alphabets we get new result as: "+newValue);
    }

    }

