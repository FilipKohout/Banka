package org.example.utils;

import java.util.Random;

public final class Generator {
    private static final Random random = new Random();

    private static String generateAccountNumber() {
        String number = "";

        for (int i = 0; i < Consts.ACCOUNT_NUMBER_LENGTH; i++)
            number += random.nextInt(10);

        return number + "/" + Consts.ACCOUNT_NUMBER_BANK_CODE;
    }

    public static String generateUniqueAccountNumber() {
        String accountNumber;

        do {
            accountNumber = generateAccountNumber();
        } while (false);
        // NOT IMPLEMENTED: check if account number is unique

        return accountNumber;
    }
}
