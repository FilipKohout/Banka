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

    public String getUuid() {
        return uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
