package org.example.customers;

import java.util.UUID;

public class CustomerFactory {
    public CustomerJSONSerializer serializerJSON;
    public CustomerXMLSerializer serializerXML;

    public CustomerFactory(CustomerJSONSerializer serializerJSON, CustomerXMLSerializer serializerXML) {
        this.serializerJSON = serializerJSON;
        this.serializerXML = serializerXML;
    }

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
