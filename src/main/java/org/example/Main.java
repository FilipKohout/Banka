package org.example;

import org.example.accounts.BaseBankAccount;
import org.example.customers.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John", "Doe");

        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
    }
}