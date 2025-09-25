package org.example.customers;

import java.util.UUID;

public class Customer {
    private String uuid;
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.uuid = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
