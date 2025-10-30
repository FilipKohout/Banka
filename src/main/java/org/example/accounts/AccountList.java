package org.example.accounts;

import com.google.inject.Singleton;
import org.example.accounts.classes.BaseBankAccount;
import org.example.transactions.classes.Transaction;

import java.util.ArrayList;

@Singleton
public class AccountList {
    public ArrayList<BaseBankAccount> accounts = new ArrayList<BaseBankAccount>();
}
