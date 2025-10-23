package org.example.transactions.services;

import org.example.utils.Consts;

public class TransactionValidation {
    public void validateTransaction(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Negative amount");

        if (amount > Consts.MAX_TRANSACTION_AMOUNT)
            throw new IllegalArgumentException("Amount exceeds limit");
    }
}
