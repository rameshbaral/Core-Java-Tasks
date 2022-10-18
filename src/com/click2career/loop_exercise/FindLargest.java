/*
19. Write a program to find the largest digit in a number. Example 12345 => output
 */
package com.click2career.loop_exercise;

public class FindLargest {
    public static void main(String[] args) {
        int number = 1234;
        findLargest(number);
    }
    //finds the largest in given input of number
    private static void findLargest(int number) {
        int largest = 0;
        int originalNumber = number;
        while (number>0){
            int rem = number%10;
            if(largest<rem)
            largest = rem;
            number /= 10;
        }
        System.out.println("the largest digit in number "+ originalNumber + " is "+largest);
    }
}
