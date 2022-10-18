/*
5. A person is eligible to vote if his/her age is greater than or equal to 18. Define a
method to find out if he/she is eligible to vote
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class IsEligibleToVote {
    //checks if the person is eligible to vote
    public void checkEligibility(int age){
        if(age>=18)
            System.out.println("you are eligible to vote");
        else
            System.out.println("You are not eligible to vote");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsEligibleToVote isEligibleToVote = new IsEligibleToVote();
        System.out.println("Enter your Age");
        int age = scanner.nextInt();
        isEligibleToVote.checkEligibility(age);
    }
}
