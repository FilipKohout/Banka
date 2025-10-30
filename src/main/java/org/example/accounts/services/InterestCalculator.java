package org.example.accounts.services;

import org.example.accounts.classes.SavingsBankAccount;

public class InterestCalculator {
    public double calculate(SavingsBankAccount savingsBankAccount) {
        double interestRate = savingsBankAccount.getInterestRate();
        double balance = savingsBankAccount.balance;
        return balance * interestRate / 100;
    }
}
