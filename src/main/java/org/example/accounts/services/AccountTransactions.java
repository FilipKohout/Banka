package org.example.accounts.services;

import org.example.accounts.classes.BaseBankAccount;
import org.example.transactions.TransactionFactory;
import org.example.transactions.TransactionType;

public class AccountTransactions {
    private final TransactionFactory transactionFactory = new TransactionFactory();
    private final TransactionHandler transactionHandler = new TransactionHandler();

    public void deposit(BaseBankAccount account, double amount) {
        transactionFactory.createTransaction(amount, TransactionType.DEPOSIT, account, null);
        transactionHandler.deposit(account, amount);
    }

    public void withdraw(BaseBankAccount account, double amount) {
        transactionFactory.createTransaction(amount, TransactionType.WITHDRAWAL, account, null);
        transactionHandler.withdraw(account, amount);
    }
}
