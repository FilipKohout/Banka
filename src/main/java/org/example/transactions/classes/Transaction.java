package org.example.transactions.classes;

import org.example.accounts.classes.BaseBankAccount;
import org.example.cards.classes.PaymentCard;
import org.example.transactions.TransactionStatus;
import org.example.transactions.TransactionType;

public class Transaction {
    private String uuid;
    private String date;
    private double amount;
    private BaseBankAccount account;
    private PaymentCard card;
    private TransactionStatus status;
    private TransactionType type;

    public Transaction(String uuid, String date, double amount, BaseBankAccount account, PaymentCard card, TransactionStatus status, TransactionType type) {
        this.uuid = uuid;
        this.date = date;
        this.amount = amount;
        this.account = account;
        this.card = card;
        this.status = status;
        this.type = type;
    }

    public String getUuid() {
        return uuid;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public BaseBankAccount getAccount() {
        return account;
    }

    public PaymentCard getCard() {
        return card;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public TransactionType getType() {
        return type;
    }
}
