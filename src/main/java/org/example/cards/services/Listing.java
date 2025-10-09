package org.example.cards.services;

import org.example.cards.PaymentCardList;
import org.example.cards.classes.PaymentCard;

import java.util.Objects;

public class Listing {
    public static void add(PaymentCard card) {
        PaymentCardList.cards.add(card);
    }

    public static void remove(PaymentCard card) {
        PaymentCardList.cards.remove(card);
    }

    public static PaymentCard find(String cardNumber) {
        for (PaymentCard card : PaymentCardList.cards) {
            if (Objects.equals(card.getCardNumber(), cardNumber)) {
                return card;
            }
        }

        return null;
    }
}
