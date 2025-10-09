package org.example.cards;

import org.example.cards.classes.PaymentCard;
import org.example.cards.services.Expiration;
import org.example.cards.services.Generator;

public class PaymentCardFactory {
    public PaymentCard createPaymentCard(String owner) {
        String cvv = Generator.generateCCVNumber();
        String number = Generator.generateUniqueCardNumber();
        String month = Expiration.getCardExpirationMonth();
        String year = Expiration.getCardExpirationYear();

        return new PaymentCard(number, cvv, month, year, owner);
    }
}
