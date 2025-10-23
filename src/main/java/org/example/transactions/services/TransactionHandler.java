package org.example.transactions.services;

import com.google.inject.Inject;
import org.example.accounts.classes.BaseBankAccount;

public class TransactionHandler {
    @Inject
    public TransactionValidation validation;

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
