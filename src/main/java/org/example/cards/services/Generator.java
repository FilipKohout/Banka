package org.example.cards.services;

import org.example.utils.Consts;

import java.util.Random;

public final class Generator {
    private static final Random random = new Random();

    private static String generateCardNumber() {
        String number = "";

        for (int i = 0; i < Consts.CARD_NUMBER_LENGTH; i++)
            number += random.nextInt(10);

        return number + Consts.CARD_NUMBER_BANK_CODE;
    }

    public static String generateUniqueCardNumber() {
        String cardNumber;

        do {
            cardNumber = generateCardNumber();
        } while (false);
        // NOT IMPLEMENTED: check if card number is unique

        return cardNumber;
    }

    public static String generateCCVNumber() {
        String number = "";

        for (int i = 0; i < 3; i++)
            number += random.nextInt(10);

        return number;
    }
}
