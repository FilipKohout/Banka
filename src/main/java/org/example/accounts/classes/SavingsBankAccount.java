package org.example.accounts.classes;

import org.example.customers.Customer;

public final class SavingsBankAccount extends BaseBankAccount {
    private float interestRate;

    public SavingsBankAccount(Customer customer, String uuid, String accountNumber, float interestRate) {
        super(customer, uuid, accountNumber, 0);

        this.interestRate = interestRate;
    }
}
