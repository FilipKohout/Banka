package org.example.accounts.services;

import com.google.inject.Inject;
import org.example.transactions.TransactionList;
import org.example.transactions.services.TransactionListing;
import org.example.utils.Consts;

public class InterestCron {
    @Inject
    private InterestRunnerFacade interestRunnerFacade;

    @Inject
    private TransactionListing transactionListing;

    public void run() {
        while (true) {
            try {
                Thread.sleep(Consts.INTEREST_CALCULATION_INTERVAL); // Sleep for 24 hours
                interestRunnerFacade.processAllInterest();

                for (var transaction : transactionListing.all()) {
                    System.out.println("Transaction ID: " + transaction.getUuid() +
                            ", Type: " + transaction.getType() +
                            ", Amount: " + transaction.getAmount());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
