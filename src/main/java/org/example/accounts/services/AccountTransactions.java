package org.example.accounts.services;

import org.example.accounts.classes.BaseBankAccount;
import org.example.transactions.TransactionFactory;
import org.example.transactions.TransactionType;
import org.example.transactions.services.TransactionHandler;

public class AccountTransactions {
    private TransactionFactory transactionFactory;
    private TransactionHandler transactionHandler;

    public AccountTransactions(TransactionFactory transactionFactory, TransactionHandler transactionHandler) {
        this.transactionFactory = transactionFactory;
        this.transactionHandler = transactionHandler;
    }

    public void deposit(BaseBankAccount account, double amount) {
        transactionFactory.createTransaction(amount, TransactionType.DEPOSIT, account, null);
        transactionHandler.deposit(account, amount);
    }

    public void withdraw(BaseBankAccount account, double amount) {
        transactionFactory.createTransaction(amount, TransactionType.WITHDRAWAL, account, null);
        transactionHandler.withdraw(account, amount);
    }
}
