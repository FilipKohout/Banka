package org.example;

import org.example.accounts.BankAccountFactory;
import org.example.accounts.classes.BaseBankAccount;
import org.example.customers.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John", "Doe");

        BaseBankAccount account = BankAccountFactory.createStandardAccount(customer);

    }
}