package org.example.cards.services;

import com.google.inject.Inject;
import org.example.accounts.classes.BaseBankAccount;
import org.example.transactions.services.TransactionHandler;
import org.example.cards.classes.PaymentCard;
import org.example.transactions.TransactionFactory;
import org.example.transactions.TransactionType;

public class CardTransactions {
    @Inject
    public TransactionFactory transactionFactory;
    @Inject
    public TransactionHandler transactionHandler;

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
