package org.example.cards.services;

import org.example.accounts.classes.BaseBankAccount;
import org.example.accounts.services.AccountTransactions;
import org.example.accounts.services.TransactionHandler;
import org.example.accounts.services.TransactionValidation;
import org.example.cards.classes.PaymentCard;
import org.example.transactions.TransactionFactory;
import org.example.transactions.TransactionType;

public class CardTransactions {
    private final TransactionFactory transactionFactory = new TransactionFactory();
    private final TransactionHandler transactionHandler = new TransactionHandler();

    public void deposit(PaymentCard card, double amount) {
        BaseBankAccount account = card.getBankAccount();

        transactionFactory.createTransaction(amount, TransactionType.DEPOSIT, account, card);
        transactionHandler.deposit(account, amount);
    }

    public void withdraw(PaymentCard card, double amount) {
        BaseBankAccount account = card.getBankAccount();

        transactionFactory.createTransaction(amount, TransactionType.DEPOSIT, account, card);
        transactionHandler.deposit(account, amount);
    }
}
