package com.click2career.conditional_statement_exercise;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        System.out.println("enter a character to check");
        c = sc.next().charAt(0);
        if(c=='a' || c=='A' ||c=='e' || c=='E' || c=='i' || c=='I' ||c=='o' || c=='O' || c=='u' || c=='U')
            System.out.println("entered character is vowel");
        else
            System.out.println("entered character is consonant");
    }
}
