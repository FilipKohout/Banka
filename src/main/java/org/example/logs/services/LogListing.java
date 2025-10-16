package org.example.logs.services;

import org.example.cards.CardList;
import org.example.logs.LogList;
import org.example.logs.classes.Log;

import java.util.ArrayList;

public class LogListing {
    public void add(Log log) {
        LogList.logs.add(log);
    }

    public void remove(Log log) {
        LogList.logs.remove(log);
    }

    public ArrayList<Log> all() {
        return LogList.logs;
    }
}
