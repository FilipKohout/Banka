package org.example.accounts;

import org.example.customers.Customer;

public final class SavingsBankAccount extends BaseBankAccount {
    private float interestRate;

    public SavingsBankAccount(Customer customer, float interestRate) {
        super(customer);

        this.interestRate = interestRate;
    }

    public SavingsBankAccount(Customer customer) {
        this(customer, 0);
    }
}
