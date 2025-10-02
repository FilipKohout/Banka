package org.example.customers;

import org.example.utils.Serialization;

public class CustomerJSONSerializer implements Serialization<Customer> {
    @Override
    public String serialize(Customer customer) {
        return String.format(
                "{" +
                    "\"uuid\": \"%s\", " +
                    "\"firstName\": \"%s\", " +
                    "\"lastName\": \"%s\" " +
                "}",
                customer.getUuid(),
                customer.getFirstName(),
                customer.getFirstName()
        );
    }

    @Override
    public Customer deserialize(String data) {
        data = data.trim().replaceAll("[{}\"]", "");
        String[] parts = data.split(",");

        String uuid = parts[0].split(":")[1].trim();
        String firstName = parts[1].split(":")[1].trim();
        String lastName = parts[2].split(":")[1].trim();

        Customer customer = new Customer(uuid, firstName, lastName);
        return customer;
    }
}
