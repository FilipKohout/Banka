package org.example.customers;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import org.example.utils.Serialization;

public class CustomerJSONSerializer implements Serialization<Customer> {
    private final Gson gson = new Gson();

    @Override
    public String serialize(Customer customer) {
        return gson.toJson(customer);
    }

    @Override
    public Customer deserialize(String data) {
        return gson.fromJson(data, Customer.class);
    }
}
