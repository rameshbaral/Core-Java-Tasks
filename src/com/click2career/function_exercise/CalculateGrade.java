/*
20.Write a program which will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as
below:
Marks Grade
91-100 AA
81-90 AB


71-80 BB
61-70 BC
51-60 CD
41-50 DD
<=40 Fail
 */
package com.click2career.function_exercise;

import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks = scanner.nextInt();
        displayGrade(marks);
    }
    //prints grade for the provided marks input
    private static void displayGrade(int marks) {
        if(marks>90&&marks<100)
            System.out.println("Your grade is AA");
        else if(marks>80&&marks<=90)
            System.out.println("Your grade is AB");
        else if(marks>70&&marks<=80)
            System.out.println("Your grade is BB");
        else if(marks>60&&marks<=70)
            System.out.println("Your grade is BC");
        else if(marks>50&&marks<=60)
            System.out.println("Your grade is CD");
        else if(marks>40&&marks<=50)
            System.out.println("Your grade is DD");
        else
            System.out.println("FAIL");
    }

}
