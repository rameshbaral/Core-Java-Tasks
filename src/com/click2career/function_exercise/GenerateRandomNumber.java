/*
27. Write a method to generate a random number.
 */
package com.click2career.function_exercise;

import java.util.Random;

public class GenerateRandomNumber {
    public static int generateRandom(){
        Random random = new Random();
        return random.nextInt();
    }

    //Prints a random number
    public static void performTask() {
        System.out.println(generateRandom());
    }
}