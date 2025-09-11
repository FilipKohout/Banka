package org.example.accounts;

import org.example.customers.Customer;

import java.util.UUID;

public class BaseBankAccount {
    protected String uuid;
    protected String bankAccountNumber;
    protected Customer customer;

    protected double balance;

    protected BaseBankAccount(Customer customer) {
        this.uuid = UUID.randomUUID().toString();
        this.bankAccountNumber = bankAccountNumber;
        this.customer = customer;
        this.balance = 0;
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
