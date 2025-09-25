package org.example.accounts.classes;

import org.example.customers.Customer;

public class BaseBankAccount {
    private String uuid;
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
