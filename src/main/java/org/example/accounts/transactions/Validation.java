package org.example.accounts.transactions;

import org.example.utils.Consts;

public final class Validation {
    public static void validateTransaction(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Negative amount");

        if (amount > Consts.MAX_TRANSACTION_AMOUNT)
            throw new IllegalArgumentException("Amount exceeds limit");
    }
}
