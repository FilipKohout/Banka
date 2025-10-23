package org.example.cards;

import org.example.cards.classes.PaymentCard;
import org.example.cards.services.CardExpiration;
import org.example.cards.services.CardGenerator;
import org.example.cards.services.CardListing;

public class CardFactory {
    public CardGenerator generator;
    public CardExpiration expiration;
    public CardListing listing;

    public CardFactory(CardGenerator generator, CardExpiration expiration, CardListing listing) {
        this.generator = generator;
        this.expiration = expiration;
        this.listing = listing;
    }

    public PaymentCard createPaymentCard(String owner) {
        String cvv = generator.generateCCVNumber();
        String number = generator.generateUniqueCardNumber();
        String month = expiration.getCardExpirationMonth();
        String year = expiration.getCardExpirationYear();
        PaymentCard card = new PaymentCard(number, cvv, month, year, owner);

        listing.add(card);
        return card;
    }
}
