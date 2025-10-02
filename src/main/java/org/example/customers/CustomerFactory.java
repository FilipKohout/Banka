package org.example.customers;

import java.util.UUID;

public class CustomerFactory {
    private static CustomerJSONSerializer serializerJSON = new CustomerJSONSerializer();
    private static CustomerXMLSerializer serializerXML = new CustomerXMLSerializer();

    public static Customer createCustomer(String firstName, String lastName) {
        String uuid = UUID.randomUUID().toString();
        return new Customer(uuid, firstName, lastName);
    }

    public static String serializeJSONCustomer(Customer customer) {
        return serializerJSON.serialize(customer);
    }

    public static Customer deserializeJSONCustomer(String data) {
        return serializerJSON.deserialize(data);
    }

    public static String serializeXMLCustomer(Customer customer) {
        return serializerXML.serialize(customer);
    }

    public static Customer deserializeXMLCustomer(String data) {
        return serializerXML.deserialize(data);
    }
}
