package org.example.accounts.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.example.cards.classes.PaymentCard;
import org.example.customers.Customer;

import java.util.ArrayList;
import java.util.List;

public class BaseBankAccount {
    @SerializedName("uuid")
    @Expose
    private String uuid;

    @SerializedName("bank_account_number")
    @Expose
    private String bankAccountNumber;

    private Customer customer;

    public ArrayList<PaymentCard> paymentCards;
    public double balance;

    protected BaseBankAccount(Customer customer, String uuid, String accountNumber, double balance) {
        this.uuid = uuid;
        this.bankAccountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
        this.paymentCards = new ArrayList<PaymentCard>();
    }

    public String getAccountNumber() {
        return bankAccountNumber;
    }
}
