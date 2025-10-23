package org.example.accounts.services;

import com.google.inject.Inject;
import org.example.accounts.classes.BaseBankAccount;
import org.example.transactions.TransactionFactory;
import org.example.transactions.TransactionType;
import org.example.transactions.services.TransactionHandler;

public class AccountTransactions {
    @Inject
    private TransactionFactory transactionFactory;
    @Inject
    private TransactionHandler transactionHandler;

    public void deposit(BaseBankAccount account, double amount) {
        transactionFactory.createTransaction(amount, TransactionType.DEPOSIT, account, null);
        transactionHandler.deposit(account, amount);
    }

    public void withdraw(BaseBankAccount account, double amount) {
        transactionFactory.createTransaction(amount, TransactionType.WITHDRAWAL, account, null);
        transactionHandler.withdraw(account, amount);
    }
}
