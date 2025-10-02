package org.example.accounts.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.example.customers.Customer;

public final class SavingsBankAccount extends BaseBankAccount {
    @SerializedName("interest_rate")
    @Expose
    private float interestRate;

    public SavingsBankAccount(Customer customer, String uuid, String accountNumber, float interestRate) {
        super(customer, uuid, accountNumber, 0);

        this.interestRate = interestRate;
    }
}
