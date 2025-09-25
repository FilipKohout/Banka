package org.example.accounts;

import org.example.customers.Customer;

import java.util.UUID;

public class BaseBankAccount {
    private String uuid;
    private String bankAccountNumber;
    private Customer customer;

    protected double balance;

    protected BaseBankAccount(Customer customer, double balance) {
        this.uuid = UUID.randomUUID().toString();
        this.bankAccountNumber = "";
        this.customer = customer;
        this.balance = balance;
    }

    protected BaseBankAccount(Customer customer) {
        this(customer, 0);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        double newBalance = balance - amount;

        if (newBalance < 0)
            throw new IllegalArgumentException("Not enough balance");

        balance = newBalance;
    }
}
