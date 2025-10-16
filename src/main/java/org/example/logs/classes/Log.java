package org.example.logs.classes;

import org.example.accounts.classes.BaseBankAccount;
import org.example.cards.classes.PaymentCard;
import org.example.logs.LogType;
import org.example.transactions.TransactionStatus;
import org.example.transactions.TransactionType;

public class Log {
    private String uuid;
    private String date;
    private LogType type;
    private String message;

    public Log(String uuid, String date, LogType type, String message) {
        this.uuid = uuid;
        this.date = date;
        this.type = type;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
