package org.example.accounts;

import org.example.customers.Customer;

public final class StudentBankAccount extends BaseBankAccount {
    private String schoolName;

    public StudentBankAccount(Customer customer, String schoolName) {
        super(customer,100);

        this.schoolName = schoolName;
    }
}
