package org.example;

import com.google.inject.Inject;
import org.example.accounts.BankAccountFactory;
import org.example.accounts.classes.BaseBankAccount;
import org.example.accounts.classes.SavingsBankAccount;
import org.example.accounts.services.AccountTransactions;
import org.example.accounts.services.InterestCron;
import org.example.cards.CardFactory;
import org.example.cards.classes.PaymentCard;
import org.example.cards.services.BankAccountLinking;
import org.example.cards.services.CardTransactions;
import org.example.customers.Customer;
import org.example.customers.CustomerFactory;
import org.example.logs.classes.Log;
import org.example.logs.services.LogListing;

public class App {
    @Inject
    CustomerFactory customerFactory;
    @Inject
    AccountTransactions accountTransactions;
    @Inject
    BankAccountFactory bankAccountFactory;
    @Inject
    CardFactory cardFactory;
    @Inject
    BankAccountLinking bankAccountLinking;
    @Inject
    LogListing logListing;
    @Inject
    CardTransactions cardTransactions;
    @Inject
    InterestCron interestCron;

    public void run() {
        Customer customer = customerFactory.createCustomer("John", "Doe");

        BaseBankAccount account = bankAccountFactory.createStandardAccount(customer);
        accountTransactions.deposit(account, 500);
        accountTransactions.withdraw(account, 200);
        System.out.println("Final balance: " + account.balance);

        String serialized = customerFactory.serializeJSONCustomer(customer);
        System.out.println(serialized);
        System.out.println(customerFactory.deserializeJSONCustomer(serialized));

        String xmlSerialized = customerFactory.serializeXMLCustomer(customer);
        System.out.println(xmlSerialized);
        System.out.println(customerFactory.deserializeXMLCustomer(xmlSerialized));

        PaymentCard card = cardFactory.createPaymentCard("John Doe");
        bankAccountLinking.LinkBankAccount(account, card);

        cardTransactions.deposit(card, 300);
        cardTransactions.withdraw(card, 100);

        Log[] logs = logListing.all().toArray(new Log[0]);

        for (Log log : logs) {
            System.out.println(log.getMessage());
        }

        SavingsBankAccount savingsAccount = bankAccountFactory.createSavingsAccount(customer, 0.5f);
        accountTransactions.deposit(savingsAccount, 1000);

        interestCron.run();
    }
}
