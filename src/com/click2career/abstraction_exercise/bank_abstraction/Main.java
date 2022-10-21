/*
2. Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150
and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and
'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
Call this method by creating an object of each of the three classes.
 */
package com.click2career.abstraction_exercise.bank_abstraction;

public class Main {
    public static void main(String[] args) {
        BankA bankA = new BankA(1000);
        System.out.println("The balance at Bank A is "+bankA.getBalance());
        BankB bankB = new BankB(2000);
        System.out.println("The balance at Bank A is "+bankB.getBalance());
        BankC bankC = new BankC(3000);
        System.out.println("The balance at Bank C is "+bankC.getBalance());
    }
}
