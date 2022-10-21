package com.click2career.abstraction_exercise.bank_abstraction;

public class BankC extends Bank{
    Integer balance;

    public BankC(Integer balance) {
        this.balance = balance;
    }
    //returns the balance
    @Override
    Integer getBalance() {
        return balance;
    }
}
