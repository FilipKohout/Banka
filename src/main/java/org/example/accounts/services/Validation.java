package org.example.accounts.services;

import org.example.utils.Consts;

public final class Validation {
    public void validateTransaction(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Negative amount");

        if (amount > Consts.MAX_TRANSACTION_AMOUNT)
            throw new IllegalArgumentException("Amount exceeds limit");
    }
}
