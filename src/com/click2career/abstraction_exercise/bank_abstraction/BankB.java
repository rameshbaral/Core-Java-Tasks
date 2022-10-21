/*
2. Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150
and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and
'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
Call this method by creating an object of each of the three classes.
 */
package com.click2career.abstraction_exercise.bank_abstraction;

public class BankB extends Bank {
    Integer balance;

    public BankB(Integer balance) {
        this.balance = balance;
    }

    @Override
    Integer getBalance() {
        return balance;
    }
}
