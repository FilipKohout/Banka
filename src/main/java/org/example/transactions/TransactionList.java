package org.example.transactions;

import com.google.inject.Singleton;
import org.example.logs.classes.Log;
import org.example.transactions.classes.Transaction;

import java.util.ArrayList;

@Singleton
public class TransactionList {
    public ArrayList<Transaction> transactions = new ArrayList<Transaction>();
}
