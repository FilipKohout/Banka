package org.example.transactions.services;

import com.google.inject.Inject;
import org.example.accounts.services.InterestRunnerFacade;
import org.example.utils.Consts;

public class TransactionExportCron {
    @Inject
    private TransactionDownloadFacade transactionDownloadFacade;

    public void run() {
        while (true) {
            try {
                Thread.sleep(Consts.TRANSACTION_EXPORT_INTERVAL); // Sleep for 24 hours
                transactionDownloadFacade.exportAllTransactions();

                System.out.println("Transactions exported");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
