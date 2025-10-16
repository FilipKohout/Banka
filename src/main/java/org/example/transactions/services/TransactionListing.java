package org.example.transactions.services;

import org.example.logs.LogList;
import org.example.logs.classes.Log;
import org.example.transactions.TransactionList;
import org.example.transactions.classes.Transaction;

import java.util.ArrayList;

public class TransactionListing {
    public void add(Transaction transaction) {
        TransactionList.transactions.add(transaction);
    }

    public void remove(Transaction transaction) {
        TransactionList.transactions.remove(transaction);
    }

    public ArrayList<Transaction> all() {
        return TransactionList.transactions;
    }
}
