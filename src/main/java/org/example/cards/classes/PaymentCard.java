package org.example.cards.classes;

public class PaymentCard {
    private String cardNumber;
    private String ccvNumber;
    private String expirationMonth;
    private String expirationYear;
    private String owner;

    public PaymentCard(String cardNumber, String ccvNumber, String expirationMonth, String expirationYear, String owner) {
        this.cardNumber = cardNumber;
        this.ccvNumber = ccvNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.owner = owner;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCcvNumber() {
        return ccvNumber;
    }

    public String getExpirationMonth() {
        return expirationMonth;
    }

    public String getExpirationYear() {
        return expirationYear;
    }

    public String getOwner() {
        return owner;
    }
}
