package org.example.accounts;

import org.example.accounts.classes.BaseBankAccount;
import org.example.accounts.classes.SavingsBankAccount;
import org.example.accounts.classes.StandardBankAccount;
import org.example.accounts.classes.StudentBankAccount;
import org.example.accounts.serialization.AccountJSONSerializer;
import org.example.accounts.services.AccountGenerator;
import org.example.customers.Customer;

public final class BankAccountFactory {
    private AccountGenerator generator;

    public BankAccountFactory(AccountGenerator generator) {
        this.generator = generator;
    }

    public StandardBankAccount createStandardAccount(Customer customer) {
        return new StandardBankAccount(
                customer,
                java.util.UUID.randomUUID().toString(),
                generator.generateUniqueAccountNumber()
        );
    }

    public SavingsBankAccount createSavingsAccount(Customer customer, float interestRate) {
        return new SavingsBankAccount(
                customer,
                java.util.UUID.randomUUID().toString(),
                generator.generateUniqueAccountNumber(),
                interestRate
        );
    }
    public StudentBankAccount createStudentAccount(Customer customer, String schoolName) {
        return new StudentBankAccount(
                customer,
                java.util.UUID.randomUUID().toString(),
                generator.generateUniqueAccountNumber(),
                schoolName
        );
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
