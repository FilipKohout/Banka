package org.example.accounts;

import com.google.inject.Inject;
import org.example.accounts.classes.BaseBankAccount;
import org.example.accounts.classes.SavingsBankAccount;
import org.example.accounts.classes.StandardBankAccount;
import org.example.accounts.classes.StudentBankAccount;
import org.example.accounts.serialization.AccountJSONSerializer;
import org.example.accounts.services.AccountGenerator;
import org.example.accounts.services.AccountListing;
import org.example.customers.Customer;

public final class BankAccountFactory {
    @Inject
    private AccountGenerator generator;

    @Inject
    private AccountListing listing;

    public StandardBankAccount createStandardAccount(Customer customer) {
        StandardBankAccount account = new StandardBankAccount(
                customer,
                java.util.UUID.randomUUID().toString(),
                generator.generateUniqueAccountNumber()
        );

        listing.add(account);
        return account;
    }

    public SavingsBankAccount createSavingsAccount(Customer customer, float interestRate) {
        SavingsBankAccount account = new SavingsBankAccount(
                customer,
                java.util.UUID.randomUUID().toString(),
                generator.generateUniqueAccountNumber(),
                interestRate
        );

        listing.add(account);
        return account;
    }
    public StudentBankAccount createStudentAccount(Customer customer, String schoolName) {
        StudentBankAccount account = new StudentBankAccount(
                customer,
                java.util.UUID.randomUUID().toString(),
                generator.generateUniqueAccountNumber(),
                schoolName
        );

        listing.add(account);
        return account;
    }

    public <T extends BaseBankAccount> String serializeJSONBankAccount(T account) {
        AccountJSONSerializer<T> serializer = new AccountJSONSerializer<T>((Class<T>) account.getClass());
        return serializer.serialize(account);
    }

    public <T extends BaseBankAccount> T deserializeJSONBankAccount(String data, Class<T> type) {
        AccountJSONSerializer<T> serializer = new AccountJSONSerializer<T>(type);
        return serializer.deserialize(data);
    }
}
