package org.example.accounts.transactions;

import org.example.accounts.classes.BaseBankAccount;

public final class TransactionHandler {
    public static void deposit(BaseBankAccount account, double amount) {
        Validation.validateTransaction(amount);

        account.balance += amount;
    }

    public static void withdraw(BaseBankAccount account, double amount) {
        Validation.validateTransaction(amount);

        double newBalance = account.balance - amount;

        if (newBalance < 0)
            throw new IllegalArgumentException("Not enough balance");

        account.balance = newBalance;
    }
}
