package org.example.cards;

import org.example.cards.classes.PaymentCard;
import org.example.cards.services.Expiration;
import org.example.cards.services.Generator;

public class PaymentCardFactory {
    private final Generator generator = new Generator();
    private final Expiration expiration = new Expiration();

    public PaymentCard createPaymentCard(String owner) {
        String cvv = generator.generateCCVNumber();
        String number = generator.generateUniqueCardNumber();
        String month = expiration.getCardExpirationMonth();
        String year = expiration.getCardExpirationYear();

        return new PaymentCard(number, cvv, month, year, owner);
    }
}
