package org.example.customers;

import org.example.utils.Serialization;

public class CustomerXMLSerializer implements Serialization<Customer> {
    @Override
    public String serialize(Customer customer) {
        return String.format(
                "<customer>" +
                    "<uuid>%s</uuid>" +
                    "<firstName>%s</firstName>" +
                    "<lastName>%s</lastName>" +
                "</customer>",
                customer.getUuid(),
                customer.getFirstName(),
                customer.getLastName()
        );
    }

    @Override
    public Customer deserialize(String data) {
        String uuid = getValue(data, "uuid");
        String firstName = getValue(data, "firstName");
        String lastName = getValue(data, "lastName");

        return new Customer(uuid, firstName, lastName);
    }

    private String getValue(String xml, String tag) {
        String open = tag + ">";
        String close = "</" + tag;

        int start = xml.indexOf(open) + open.length();
        int end = xml.indexOf(close);
        return xml.substring(start, end);
    }
}
