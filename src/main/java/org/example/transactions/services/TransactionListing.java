package org.example.transactions.services;

import com.google.inject.Inject;
import org.example.transactions.TransactionList;
import org.example.transactions.classes.Transaction;

import java.util.ArrayList;

public class TransactionListing {
    @Inject
    public TransactionList transactionList;

    public void add(Transaction transaction) {
        transactionList.transactions.add(transaction);
    }

    public void remove(Transaction transaction) {
        transactionList.transactions.remove(transaction);
    }

    public ArrayList<Transaction> all() {
        return transactionList.transactions;
    }
}
