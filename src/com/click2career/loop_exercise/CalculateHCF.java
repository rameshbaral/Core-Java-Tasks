package com.click2career.loop_exercise;

import java.util.Scanner;

public class CalculateHCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber = scanner.nextInt();
        int hcf = calculateHCF(firstNumber,secondNumber);
        System.out.println("HCF Of "+firstNumber+" And "+ secondNumber+" is "+hcf);
    }

    private static int calculateHCF(int firstNumber, int secondNumber) {
        int hcf = 1;
        int small = firstNumber;
        if(firstNumber>secondNumber)
            small = secondNumber;
        for (int i = 1; i <= small; i++) {
            if(firstNumber%i == 0 && secondNumber%i == 0)
                hcf = i;
        }
        return hcf;
    }
}
