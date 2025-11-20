package org.example.utils;

import java.io.File;

public final class Consts {
    public static final double STUDENT_INITIAL_BALANCE = 100;

    public static final double MAX_TRANSACTION_AMOUNT = 100_000;

    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    public static final String ACCOUNT_NUMBER_BANK_CODE = "2056";

    public static final int CARD_NUMBER_LENGTH = 9;
    public static final String CARD_NUMBER_BANK_CODE = "2056";

    public static final long INTEREST_CALCULATION_INTERVAL = 1000 * 60 * 1;
    public static final long SAVINGS_ACCOUNT_INTEREST_INTERVAL = 1000 * 60 * 5;

    public static final String FILE_PATH_TRANSACTIONS_JSON = System.getProperty("user.dir") + File.separator + "download" + File.separator + "transactions.json";
    public static final long TRANSACTION_EXPORT_INTERVAL = 1000 * 60 * 1;
}
