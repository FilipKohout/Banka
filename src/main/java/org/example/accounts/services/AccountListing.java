package org.example.accounts.services;

import com.google.inject.Inject;
import org.example.accounts.AccountList;
import org.example.accounts.classes.BaseBankAccount;
import org.example.transactions.TransactionList;
import org.example.transactions.classes.Transaction;

import java.util.ArrayList;

public class AccountListing {
    @Inject
    public AccountList accountList;

    public void add(BaseBankAccount account) {
        accountList.accounts.add(account);
    }

    public void remove(BaseBankAccount account) {
        accountList.accounts.remove(account);
    }

    public ArrayList<BaseBankAccount> all() {
        return accountList.accounts;
    }
}
