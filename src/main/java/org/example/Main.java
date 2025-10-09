package org.example;

import org.example.accounts.BankAccountFactory;
import org.example.accounts.classes.BaseBankAccount;
import org.example.accounts.services.TransactionHandler;
import org.example.customers.Customer;
import org.example.customers.CustomerFactory;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustomerFactory.createCustomer("John", "Doe");

        BaseBankAccount account = BankAccountFactory.createStandardAccount(customer);
        TransactionHandler.deposit(account, 500);
        TransactionHandler.withdraw(account, 200);
        System.out.println("Final balance: " + account.balance);

        String serialized = CustomerFactory.serializeJSONCustomer(customer);
        System.out.println(serialized);
        System.out.println(CustomerFactory.deserializeJSONCustomer(serialized));

        String xmlSerialized = CustomerFactory.serializeXMLCustomer(customer);
        System.out.println(xmlSerialized);
        System.out.println(CustomerFactory.deserializeXMLCustomer(xmlSerialized));
    }
}