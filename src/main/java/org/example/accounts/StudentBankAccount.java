package org.example.accounts;

import org.example.customers.Customer;
import org.example.utils.consts;

public final class StudentBankAccount extends BaseBankAccount {
    private String schoolName;

    public StudentBankAccount(Customer customer, String schoolName) {
        super(customer, consts.STUDENT_INITIAL_BALANCE);

        this.schoolName = schoolName;
    }
}
