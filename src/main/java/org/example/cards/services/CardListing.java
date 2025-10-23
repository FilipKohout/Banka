package org.example.cards.services;

import com.google.inject.Inject;
import org.example.cards.CardList;
import org.example.cards.classes.PaymentCard;

import java.util.Objects;

public class CardListing {
    @Inject
    CardList cardList;

    public void add(PaymentCard card) {
        cardList.cards.add(card);
    }

    public void remove(PaymentCard card) {
        cardList.cards.remove(card);
    }

    public PaymentCard find(String cardNumber) {
        for (PaymentCard card : cardList.cards) {
            if (Objects.equals(card.getCardNumber(), cardNumber)) {
                return card;
            }
        }

        return null;
    }
}
