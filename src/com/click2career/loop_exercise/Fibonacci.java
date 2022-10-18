/*
14. Write a program to print Fibonacci series of n terms where n is input by user :
Example Output : 0 1 1 2 3 5 8 13 24 ....
 */
package com.click2career.loop_exercise;

import java.util.Scanner;

public class Fibonacci {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter range of fibonacci number series");
        int range = sc.nextInt();
        printFibonacci(range);
    }

    private static void printFibonacci(int n) {
        //displays 0 if entered number is either 0 or 1
        if(n==0||n==1){
            System.out.println("0");
            return;
        }

        System.out.print("0\t1\t");
        int term1=0, term2=1;

        //iterates loop n-2 times because first two numbers of fibonacci series 0 and 1 are already displayed
        for(int i=1;i<n-1;i++){

            //calculate next by summation of previous two terms
            int nextTerm = term1+term2;
            //update term1 and term2
            term1 = term2;
            term2 = nextTerm;
            //print the new term
            System.out.print(nextTerm+"\t");
        }
        sc.close();
    }
    }


