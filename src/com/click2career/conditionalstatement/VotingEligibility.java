package com.click2career.conditionalstatement;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        final int MY_AGE = 23;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current age");
        int currentAge = sc.nextInt();
        if(currentAge < MY_AGE )
            System.out.println("you are not allowed to vote");
        else
            System.out.println("you are allowed to vote");
    }
}
