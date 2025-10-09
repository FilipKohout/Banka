package org.example.cards.services;

import org.example.accounts.classes.BaseBankAccount;
import org.example.cards.classes.PaymentCard;

public class BankAccountLinking {
    public void LinkBankAccount(BaseBankAccount bankAccount, PaymentCard paymentCard) {
        bankAccount.paymentCards.add(paymentCard);
    }
}
