package org.example.transactions.services;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.inject.Inject;
import org.example.accounts.classes.BaseBankAccount;
import org.example.accounts.classes.SavingsBankAccount;
import org.example.accounts.services.AccountListing;
import org.example.accounts.services.AccountTransactions;
import org.example.accounts.services.InterestCalculator;
import org.example.transactions.classes.Transaction;
import org.example.utils.Consts;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TransactionDownloadFacade {
    @Inject
    private TransactionListing transactionListing;

    private Gson gson = new Gson();
    public void exportAllTransactions() {
        ArrayList<Transaction> transactions = transactionListing.all();

        // serialize transactions to a json file using gson
        String json = gson.toJson(transactions);
        try (FileWriter file = new FileWriter(Consts.FILE_PATH_TRANSACTIONS_JSON)) {
            file.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
