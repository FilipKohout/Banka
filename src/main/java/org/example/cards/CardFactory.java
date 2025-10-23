package org.example.cards;

import com.google.inject.Inject;
import org.example.cards.classes.PaymentCard;
import org.example.cards.services.CardExpiration;
import org.example.cards.services.CardGenerator;
import org.example.cards.services.CardListing;

public class CardFactory {
    @Inject
    public CardGenerator generator;
    @Inject
    public CardExpiration expiration;
    @Inject
    public CardListing listing;

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
