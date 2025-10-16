package org.example;

import org.example.accounts.BankAccountFactory;
import org.example.accounts.classes.BaseBankAccount;
import org.example.accounts.services.Transactions;
import org.example.customers.Customer;
import org.example.customers.CustomerFactory;

public class Main {
    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();
        Transactions transactions = new Transactions();
        BankAccountFactory bankAccountFactory = new BankAccountFactory();

        Customer customer = customerFactory.createCustomer("John", "Doe");

        BaseBankAccount account = bankAccountFactory.createStandardAccount(customer);
        transactions.deposit(account, 500);
        transactions.withdraw(account, 200);
        System.out.println("Final balance: " + account.balance);

        String serialized = customerFactory.serializeJSONCustomer(customer);
        System.out.println(serialized);
        System.out.println(customerFactory.deserializeJSONCustomer(serialized));

        String xmlSerialized = customerFactory.serializeXMLCustomer(customer);
        System.out.println(xmlSerialized);
        System.out.println(customerFactory.deserializeXMLCustomer(xmlSerialized));
    }
}