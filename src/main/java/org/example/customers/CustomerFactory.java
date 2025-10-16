package org.example.customers;

import java.util.UUID;

public class CustomerFactory {
    private final CustomerJSONSerializer serializerJSON = new CustomerJSONSerializer();
    private final CustomerXMLSerializer serializerXML = new CustomerXMLSerializer();

    public Customer createCustomer(String firstName, String lastName) {
        String uuid = UUID.randomUUID().toString();
        return new Customer(uuid, firstName, lastName);
    }

    public String serializeJSONCustomer(Customer customer) {
        return serializerJSON.serialize(customer);
    }

    public Customer deserializeJSONCustomer(String data) {
        return serializerJSON.deserialize(data);
    }

    public String serializeXMLCustomer(Customer customer) {
        return serializerXML.serialize(customer);
    }

    public Customer deserializeXMLCustomer(String data) {
        return serializerXML.deserialize(data);
    }
}
