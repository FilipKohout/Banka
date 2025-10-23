package org.example;

import org.example.accounts.classes.BaseBankAccount;
import org.example.cards.classes.PaymentCard;
import org.example.customers.Customer;
import org.example.logs.classes.Log;

public class App {
    private Container container = new Container();

    public void run() {
        Customer customer = container.customerFactory.createCustomer("John", "Doe");

        BaseBankAccount account = container.bankAccountFactory.createStandardAccount(customer);
        container.accountTransactions.deposit(account, 500);
        container.accountTransactions.withdraw(account, 200);
        System.out.println("Final balance: " + account.balance);

        String serialized = container.customerFactory.serializeJSONCustomer(customer);
        System.out.println(serialized);
        System.out.println(container.customerFactory.deserializeJSONCustomer(serialized));

        String xmlSerialized = container.customerFactory.serializeXMLCustomer(customer);
        System.out.println(xmlSerialized);
        System.out.println(container.customerFactory.deserializeXMLCustomer(xmlSerialized));

        PaymentCard card = container.cardFactory.createPaymentCard("John Doe");
        container.bankAccountLinking.LinkBankAccount(account, card);

        container.cardTransactions.deposit(card, 300);
        container.cardTransactions.withdraw(card, 100);

        Log[] logs = container.logListing.all().toArray(new Log[0]);

        for (Log log : logs) {
            System.out.println(log.getMessage());
        }
    }
}
