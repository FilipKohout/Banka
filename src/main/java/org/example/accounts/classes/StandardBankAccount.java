package org.example.accounts.classes;

import org.example.customers.Customer;

public final class StandardBankAccount extends BaseBankAccount {
    public StandardBankAccount(Customer customer, String uuid, String accountNumber) {
        super(customer, uuid, accountNumber, 0);
    }
}
