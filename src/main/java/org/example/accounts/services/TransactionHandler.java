package org.example.accounts.services;

import org.example.accounts.classes.BaseBankAccount;
import org.example.transactions.TransactionFactory;
import org.example.transactions.TransactionType;

public class TransactionHandler {
    private final TransactionValidation validation = new TransactionValidation();

    public void deposit(BaseBankAccount account, double amount) {
        validation.validateTransaction(amount);

        account.balance += amount;
    }

    public void withdraw(BaseBankAccount account, double amount) {
        validation.validateTransaction(amount);

        double newBalance = account.balance - amount;

        if (newBalance < 0)
            throw new IllegalArgumentException("Not enough balance");

        account.balance = newBalance;
    }
}
