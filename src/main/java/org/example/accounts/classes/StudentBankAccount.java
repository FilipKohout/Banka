package org.example.accounts.classes;

import org.example.customers.Customer;
import org.example.utils.Consts;

public final class StudentBankAccount extends BaseBankAccount {
    private String schoolName;

    public StudentBankAccount(Customer customer, String uuid, String accountNumber, String schoolName) {
        super(customer, uuid, accountNumber, Consts.STUDENT_INITIAL_BALANCE);

        this.schoolName = schoolName;
    }
}
