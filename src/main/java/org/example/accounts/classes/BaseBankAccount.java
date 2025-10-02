package org.example.accounts.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.example.customers.Customer;

public class BaseBankAccount {
    @SerializedName("uuid")
    @Expose
    private String uuid;

    @SerializedName("bank_account_number")
    @Expose
    private String bankAccountNumber;

    private Customer customer;

    public double balance;

    protected BaseBankAccount(Customer customer, String uuid, String accountNumber, double balance) {
        this.uuid = uuid;
        this.bankAccountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
    }
}
