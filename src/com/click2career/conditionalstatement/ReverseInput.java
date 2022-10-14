package com.click2career.conditionalstatement;

import java.util.Scanner;

public class ReverseInput {
    public static void main(String[] args) {
        int num=0;
        int originalNumber = 0;

        int reversedNumber =0;

        System.out.println("Input number that you want to reverse ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        originalNumber = num;


        while( num != 0 )
        {
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + num%10;
            num = num/10;

        }
        System.out.println("The reversed output of"+ num+" number is  "+reversedNumber);

    }

    }

