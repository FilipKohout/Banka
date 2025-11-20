package org.example.accounts.services;

import org.example.utils.Consts;

import java.util.Random;

public class AccountGenerator {
    private final Random random = new Random();

    private String generateAccountNumber() {
        String number = "";

        for (int i = 0; i < Consts.ACCOUNT_NUMBER_LENGTH; i++)
            number += random.nextInt(10);

        return number + "/" + Consts.ACCOUNT_NUMBER_BANK_CODE;
    }

    public String generateUniqueAccountNumber() {
        String accountNumber;

        do {
            accountNumber = generateAccountNumber();
        } while (false);
        // NOT IMPLEMENTED: check if account number is unique

        return accountNumber;
    }
}
