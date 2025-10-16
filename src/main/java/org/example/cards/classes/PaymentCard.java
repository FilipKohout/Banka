package org.example.cards.classes;

import org.example.accounts.classes.BaseBankAccount;

public class PaymentCard {
    private String cardNumber;
    private String ccvNumber;
    private String expirationMonth;
    private String expirationYear;
    private String owner;
    private BaseBankAccount BankAccount;

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

    public void setBankAccount(BaseBankAccount bankAccount) {
        BankAccount = bankAccount;
    }

    public BaseBankAccount getBankAccount() {
        return BankAccount;
    }
}
