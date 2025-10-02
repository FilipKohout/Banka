package org.example.accounts.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.example.customers.Customer;
import org.example.utils.Consts;

public final class StudentBankAccount extends BaseBankAccount {
    @SerializedName("school_name")
    @Expose
    private String schoolName;

    public StudentBankAccount(Customer customer, String uuid, String accountNumber, String schoolName) {
        super(customer, uuid, accountNumber, Consts.STUDENT_INITIAL_BALANCE);

        this.schoolName = schoolName;
    }
}
