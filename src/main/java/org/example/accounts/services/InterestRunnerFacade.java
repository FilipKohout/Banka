package org.example.accounts.services;

import com.google.inject.Inject;
import org.example.accounts.classes.BaseBankAccount;
import org.example.accounts.classes.SavingsBankAccount;
import org.example.transactions.services.TransactionHandler;
import org.example.utils.Consts;

import java.sql.Timestamp;

public class InterestRunnerFacade {
    @Inject
    private AccountListing accountListing;

    @Inject
    private AccountTransactions accountTransactions;

    @Inject
    private InterestCalculator interestCalculator;

    public void processAllInterest() {
        long currentTime = System.currentTimeMillis();

        for (BaseBankAccount account : accountListing.all()) {
            if (
                    account instanceof SavingsBankAccount &&
                    currentTime >= ((SavingsBankAccount) account).getLastInterestApplied() + Consts.SAVINGS_ACCOUNT_INTEREST_INTERVAL
            ) {
                double interest = interestCalculator.calculate((SavingsBankAccount) account);

                accountTransactions.applyInterest(account, interest);
                ((SavingsBankAccount) account).setLastInterestApplied(System.currentTimeMillis());
            }
        }
    }
}
