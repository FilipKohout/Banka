package org.example.accounts;

import org.example.accounts.classes.BaseBankAccount;
import org.example.accounts.classes.SavingsBankAccount;
import org.example.accounts.classes.StandardBankAccount;
import org.example.accounts.classes.StudentBankAccount;
import org.example.accounts.serialization.AccountJSONSerializer;
import org.example.customers.Customer;

public final class BankAccountFactory {
    public static StandardBankAccount createStandardAccount(Customer customer) {
        return new StandardBankAccount(
                customer,
                java.util.UUID.randomUUID().toString(),
                Generator.generateUniqueAccountNumber()
        );
    }

    public static SavingsBankAccount createSavingsAccount(Customer customer, float interestRate) {
        return new SavingsBankAccount(
                customer,
                java.util.UUID.randomUUID().toString(),
                Generator.generateUniqueAccountNumber(),
                interestRate
        );
    }
    public static StudentBankAccount createStudentAccount(Customer customer, String schoolName) {
        return new StudentBankAccount(
                customer,
                java.util.UUID.randomUUID().toString(),
                Generator.generateUniqueAccountNumber(),
                schoolName
        );
    }

    public static <T extends BaseBankAccount> String serializeJSONBankAccount(T account) {
        AccountJSONSerializer<T> serializer = new AccountJSONSerializer<T>((Class<T>) account.getClass());
        return serializer.serialize(account);
    }

    public static <T extends BaseBankAccount> T deserializeJSONBankAccount(String data, Class<T> type) {
        AccountJSONSerializer<T> serializer = new AccountJSONSerializer<T>(type);
        return serializer.deserialize(data);
    }
}
