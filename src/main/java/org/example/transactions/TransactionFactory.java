package org.example.transactions;

import org.example.accounts.classes.BaseBankAccount;
import org.example.cards.classes.PaymentCard;
import org.example.logs.LogFactory;
import org.example.logs.LogType;
import org.example.transactions.classes.Transaction;
import org.example.transactions.services.TransactionListing;

public class TransactionFactory {
    public LogFactory logFactory;
    public TransactionListing listing;

    public TransactionFactory(LogFactory logFactory, TransactionListing listing) {
        this.logFactory = logFactory;
        this.listing = listing;
    }

    public Transaction createTransaction(double amount, TransactionType type, BaseBankAccount bankAccount, PaymentCard paymentCard) {
        logFactory.createLog(
                LogType.TRANSACTION,
                "type " + type + "; amount " + amount + "; account " + bankAccount.getAccountNumber() +
                (paymentCard != null ? "; card " + paymentCard.getCardNumber() : "")
        );

        Transaction transaction = new Transaction(
            java.util.UUID.randomUUID().toString(),
            "",
            amount,
            bankAccount,
            paymentCard,
            TransactionStatus.COMPLETED,
            type
        );

        listing.add(transaction);
        return transaction;
    }
}
