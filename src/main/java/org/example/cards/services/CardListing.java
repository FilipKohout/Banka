package org.example.cards.services;

import org.example.cards.CardList;
import org.example.cards.classes.PaymentCard;

import java.util.Objects;

public class CardListing {
    public void add(PaymentCard card) {
        CardList.cards.add(card);
    }

    public void remove(PaymentCard card) {
        CardList.cards.remove(card);
    }

    public PaymentCard find(String cardNumber) {
        for (PaymentCard card : CardList.cards) {
            if (Objects.equals(card.getCardNumber(), cardNumber)) {
                return card;
            }
        }

        return null;
    }
}
