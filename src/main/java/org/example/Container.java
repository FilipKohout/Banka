package org.example;

import org.example.accounts.BankAccountFactory;
import org.example.accounts.services.AccountGenerator;
import org.example.accounts.services.AccountTransactions;
import org.example.cards.CardFactory;
import org.example.customers.CustomerFactory;
import org.example.transactions.services.TransactionHandler;
import org.example.cards.services.*;
import org.example.customers.CustomerJSONSerializer;
import org.example.customers.CustomerXMLSerializer;
import org.example.logs.LogFactory;
import org.example.logs.services.LogListing;
import org.example.transactions.TransactionFactory;
import org.example.transactions.services.TransactionListing;
import org.example.transactions.services.TransactionValidation;

public class Container {
    public TransactionFactory transactionFactory;
    public TransactionListing transactionListing;
    public TransactionHandler transactionHandler;
    public TransactionValidation transactionValidation;

    public LogFactory logFactory;
    public LogListing logListing;

    public CustomerFactory customerFactory;
    public CustomerJSONSerializer customerJSONSerializer;
    public CustomerXMLSerializer customerXMLSerializer;

    public CardFactory cardFactory;
    public CardGenerator cardGenerator;
    public CardExpiration cardExpiration;
    public CardListing cardListing;
    public BankAccountLinking bankAccountLinking;
    public CardTransactions cardTransactions;

    public BankAccountFactory bankAccountFactory;
    public AccountGenerator accountGenerator;
    public AccountTransactions accountTransactions;

    public Container() {
        this.logListing = new LogListing();
        this.logFactory = new LogFactory(this.logListing);

        this.customerXMLSerializer = new CustomerXMLSerializer();
        this.customerJSONSerializer = new CustomerJSONSerializer();
        this.customerFactory = new CustomerFactory(this.customerJSONSerializer, this.customerXMLSerializer);

        this.transactionValidation = new TransactionValidation();
        this.transactionHandler = new TransactionHandler(this.transactionValidation);
        this.transactionListing = new TransactionListing();
        this.transactionFactory = new TransactionFactory(this.logFactory, this.transactionListing);

        this.cardGenerator = new CardGenerator();
        this.cardExpiration = new CardExpiration();
        this.cardListing = new CardListing();
        this.bankAccountLinking = new BankAccountLinking();
        this.cardFactory = new CardFactory(this.cardGenerator, this.cardExpiration, this.cardListing);
        this.cardTransactions = new CardTransactions(this.transactionFactory, this.transactionHandler);

        this.accountGenerator = new AccountGenerator();
        this.bankAccountFactory = new BankAccountFactory(this.accountGenerator);
        this.accountTransactions = new AccountTransactions(this.transactionFactory, this.transactionHandler);
    }
}
