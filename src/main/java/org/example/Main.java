package org.example;

import org.example.accounts.BankAccountFactory;
import org.example.accounts.classes.BaseBankAccount;
import org.example.accounts.services.AccountTransactions;
import org.example.cards.CardFactory;
import org.example.cards.classes.PaymentCard;
import org.example.cards.services.BankAccountLinking;
import org.example.cards.services.CardTransactions;
import org.example.customers.Customer;
import org.example.customers.CustomerFactory;
import org.example.logs.classes.Log;
import org.example.logs.services.LogListing;

public class Main {
    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();
        AccountTransactions transactions = new AccountTransactions();
        BankAccountFactory bankAccountFactory = new BankAccountFactory();
        CardFactory cardFactory = new CardFactory();
        BankAccountLinking linking = new BankAccountLinking();
        LogListing listing = new LogListing();
        CardTransactions cardTransactions = new CardTransactions();

        Customer customer = customerFactory.createCustomer("John", "Doe");

        BaseBankAccount account = bankAccountFactory.createStandardAccount(customer);
        transactions.deposit(account, 500);
        transactions.withdraw(account, 200);
        System.out.println("Final balance: " + account.balance);

        String serialized = customerFactory.serializeJSONCustomer(customer);
        System.out.println(serialized);
        System.out.println(customerFactory.deserializeJSONCustomer(serialized));

        String xmlSerialized = customerFactory.serializeXMLCustomer(customer);
        System.out.println(xmlSerialized);
        System.out.println(customerFactory.deserializeXMLCustomer(xmlSerialized));

        PaymentCard card = cardFactory.createPaymentCard("John Doe");
        linking.LinkBankAccount(account, card);

        cardTransactions.deposit(card, 300);
        cardTransactions.withdraw(card, 100);

        Log[] logs = listing.all().toArray(new Log[0]);

        for (Log log : logs) {
            System.out.println(log.getMessage());
        }
    }
}